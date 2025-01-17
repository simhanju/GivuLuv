package com.gl.givuluv.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gl.givuluv.domain.dto.Criteria;
import com.gl.givuluv.domain.dto.FPaymentDTO;
import com.gl.givuluv.domain.dto.ProductDTO;
import com.gl.givuluv.domain.dto.SPaymentDTO;

@Mapper
public interface ProductMapper {

	String[] getProductConnectid();

	List<ProductDTO> getList();
	ProductDTO getSList(int connectid);
	int insertSBoardProduct(ProductDTO product);
	int insertFundingProduct(ProductDTO product);


	List<ProductDTO> getProductListBySBoardnum(int sBoardnum);

	List<ProductDTO> getMProductList();

	int getProductnumByNameAndConnectid(String productname, int fBoardnum);

	boolean decreaseAmount(int amount);

	boolean decreaseAmount(FPaymentDTO payment);
	
	List<ProductDTO> getListBySBoardnum(String sBoardnum);
	
    List<ProductDTO> getListBySBoardnumType(String sBoardnum, char type);
    
    List<ProductDTO> getProduct(int productnum);

	List<ProductDTO> getProductByConnectid(int fBoardnum);
	
	int[] getMConnectid();

	int[] getMConnectidByCategory(String category);

	// MDM
	boolean decreaseAmount(SPaymentDTO s_payment);

	// MDM
	int getProductnumBySBoardnum(int sBoardnum);

	// MDM
	int getSProductnumByNameAndConnectid(String productname, int sBoardnum);

	List<ProductDTO> getListByProductName(String text, String sellerid, Criteria cri);

	int getTotal(Criteria cri, String sellerid);

	List<ProductDTO> getProductCriList(String sellerid, Criteria cri);

	long getTotalCnt(String sellerid, String text);

	ProductDTO getProductnumListBySBoardnum(int sBoardnum);

	boolean updateAmount(FPaymentDTO payment);
	
	
}
