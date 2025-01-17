package com.gl.givuluv.service;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gl.givuluv.domain.dto.FBoardDTO;
import com.gl.givuluv.domain.dto.FileDTO;
import com.gl.givuluv.domain.dto.ProductDTO;
import com.gl.givuluv.domain.dto.SBoardDTO;
import com.gl.givuluv.domain.dto.StoreDTO;
import com.gl.givuluv.domain.dto.UserDTO;
import com.gl.givuluv.mapper.BoardMapper;
import com.gl.givuluv.mapper.FileMapper;
import com.gl.givuluv.mapper.ProductMapper;
import com.gl.givuluv.mapper.StoreMapper;
import com.gl.givuluv.mapper.UserMapper;

import ch.qos.logback.core.model.Model;

@Service
public class SBoardServiceImpl implements SBoardService{

	@Value("${file.dir}")
	private String saveFolder;
	
	@Autowired
	private BoardMapper bmapper;
	
	@Autowired
	private StoreMapper smapper;
	
	@Autowired
	private ProductMapper pmapper;
	
	@Autowired 
	private FileMapper fmapper;
	
	@Autowired
	private UserMapper umapper;
	
	@Override
	   public boolean regist(Model model, SBoardDTO sBoard, String sellerId, List<ProductDTO> products, String filenames, MultipartFile thumbnail) throws Exception {
	      // s_num 찾기
	      StoreDTO store = smapper.getStoreBySellerId(sellerId);
	      int sNum = store.getSNum();
	      sBoard.setSNum(sNum);
	      System.out.println(sNum);
	      
	      if(bmapper.insertStoreBoard(sBoard)==1) {
	         int sBoardnum = bmapper.getStoreBoardLastNumBySNum(sNum);
	         System.out.println(sBoardnum);
	         // content에 있는 파일이름 DB에 저장
	         System.out.println(filenames);
	         String[] filenameList = filenames.split(",");
	         if(!filenameList[0].isEmpty()){
	            for (String systemname : filenameList) {
	               FileDTO file = new FileDTO();
	               file.setConnectionid(sBoardnum+"");
	               file.setType('M');
	               file.setSystemname(systemname);
	               fmapper.insertFile(file);
	            }
	         }
	         
	         // 썸네일 저장
	         String orgname = thumbnail.getOriginalFilename();
	         int lastIdx = orgname.lastIndexOf(".");
	         String ext = orgname.substring(lastIdx);
	         System.out.println(ext);
	         
	         LocalDateTime now = LocalDateTime.now();
	         String time = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
	         
	         String systemname = time+UUID.randomUUID().toString()+ext;
	         
	         String path = saveFolder+systemname;
	         
	         FileDTO thumbnailFile = new FileDTO();
	         thumbnailFile.setConnectionid(sBoardnum+"");
	         thumbnailFile.setType('M');
	         thumbnailFile.setSystemname(systemname);
	         System.out.println(thumbnailFile.getConnectionid());
	         System.out.println(thumbnailFile.getType());
	         System.out.println(thumbnailFile.getSystemname());
	         
	         if(fmapper.insertThumbnail(thumbnailFile) == 1) {
	            thumbnail.transferTo(new File(path));
	         }
	         else {
	            //content에 해당하는 파일들과 파일db 삭제, board삭제 등
	            return false;
	         }
	         // product 넣기
	         for (ProductDTO product : products) {
	            product.setConnectid(sBoardnum+"");
	            if(pmapper.insertSBoardProduct(product)==1) {}
	            else {
	               //넣은 product들 삭제 / SBoard 삭제 ...
	               return false;
	            }
	         }
	      }
	      return true;
	   }
	@Override
	public SBoardDTO getSBoard(int connectid) {
		return bmapper.getSBoard(connectid);
	}
	
	// MDM
	@Override
	public SBoardDTO getSboardByProductnum(int productnum) {
		return bmapper.getSboardByProductnum(productnum);
	}

	// MDM
	@Override
	public UserDTO getUserById(String userid) {
		return umapper.getUserById(userid);
	}
	@Override
	public List<Map<String, Object>> getMSBoardList() {
	    List<SBoardDTO> sboardList = bmapper.getSBoardList();
	    String src = "/summernoteImage/";
	    List<Map<String, Object>> result = new ArrayList<>();

	    for (SBoardDTO board : sboardList) {
	        // 게시판 파일 목록 가져오기
	        List<String> sboardfile = fmapper.getFileBySBoardnum(board.getSBoardnum());
	        ProductDTO productnumList = pmapper.getProductnumListBySBoardnum(board.getSBoardnum());
	        List<String> sboardfilePaths = new ArrayList<>();
	        for (String file : sboardfile) {
	            sboardfilePaths.add(src + file);
	        }

	        // 가게 목록 가져오기
	        List<StoreDTO> storeList = smapper.getStoreListBySNum(board.getSNum());
	        for (StoreDTO store : storeList) {
	            // 가게 파일 목록 가져오기
	            List<String> storefile = fmapper.getFileBySellerid(store.getSellerid());
	            List<String> storefilePaths = new ArrayList<>();
	            for (String file : storefile) {
	                storefilePaths.add(src + file);
	            }

	            // 결과 맵에 추가
	            Map<String, Object> map = new HashMap<>();
	            map.put("board", board);
	            map.put("product", productnumList);
	            map.put("sboardFiles", sboardfilePaths);
	            map.put("store", store);
	            map.put("storeFiles", storefilePaths);
	            result.add(map);
	        }
	    }

	    System.out.println("결과 " + result);
	    return result;
	}

	
}
