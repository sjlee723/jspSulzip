package com.sulzip.app.myrecipe;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.myrecipe.dao.MyRecipeDAO;
import com.sulzip.app.product.dto.ProductDTO;

public class MyRecipeUploadController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MyRecipeDAO myRecipeDAO = new MyRecipeDAO();
		
		//카테고리 넘버가 2(술)와 3(재료)인 상품목록을 List로 가져오기
		List<ProductDTO> alcoholList = myRecipeDAO.category(2); 
		List<ProductDTO> ingreList = myRecipeDAO.category(3); 
		
		//술은 알콜리스트에, 재료는 인그리리스트에 담기
		req.setAttribute("alcoholList", alcoholList);
		req.setAttribute("ingreList", ingreList);
		
		req.getRequestDispatcher("/app/myrecipe/myrecipeupload.jsp").forward(req, resp);
	}

}