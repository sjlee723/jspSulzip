package com.sulzip.app.myrecipe;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.myrecipe.dao.MyRecipeDAO;
import com.sulzip.app.myrecipe.dto.MyRecipeDTO;
import com.sulzip.app.product.dto.ProductDTO;

public class MyRecipeUpdateController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MyRecipeDAO myRecipeDAO = new MyRecipeDAO();
		MyRecipeDTO myRecipeDTO = new MyRecipeDTO();
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		
		int userNumber = (int)session.getAttribute("userNumber");
		
		int boardNum = Integer.parseInt(req.getHeader("referer").substring("http://localhost:8085/myrecipe/myRecipeDetail.mrb?num=".length()));
		
		myRecipeDTO = myRecipeDAO.select(boardNum);
		
		req.setAttribute("myRecipeDTO", myRecipeDTO);
		
		//카테고리 넘버가 2(술)와 3(재료)인 상품목록을 List로 가져오기
		List<ProductDTO> alcoholList = myRecipeDAO.category(2); 
		List<ProductDTO> ingreList = myRecipeDAO.category(3); 
		
		//술은 알콜리스트에, 재료는 인그리리스트에 담기
		req.setAttribute("alcoholList", alcoholList);
		req.setAttribute("ingreList", ingreList);
		
		req.getRequestDispatcher("/app/myrecipe/myrecipeupdate.jsp").forward(req, resp);
	}

}
