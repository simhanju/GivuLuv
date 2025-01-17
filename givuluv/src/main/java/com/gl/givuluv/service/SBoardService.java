package com.gl.givuluv.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.gl.givuluv.domain.dto.ProductDTO;
import com.gl.givuluv.domain.dto.SBoardDTO;
import com.gl.givuluv.domain.dto.UserDTO;

import ch.qos.logback.core.model.Model;

public interface SBoardService {
	boolean regist(Model model, SBoardDTO sBoard, String sellerId, List<ProductDTO> productList, String filenames, MultipartFile thumbnail) throws Exception;
	SBoardDTO getSBoard(int connectid);
	
	UserDTO getUserById(String userid);
	
	SBoardDTO getSboardByProductnum(int productnum);
	List<Map<String, Object>> getMSBoardList();
}
