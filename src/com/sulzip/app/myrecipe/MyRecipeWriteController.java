package com.sulzip.app.myrecipe;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.myrecipe.dao.MyRecipeDAO;
import com.sulzip.app.product.dto.ProductDTO;

public class MyRecipeWriteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductDTO productDTO = new ProductDTO();
		MyRecipeDAO myRecipeDAO = new MyRecipeDAO();
		
//		int categoryNumber = Integer.parseInt(req.getParameter("categoryNumber"));
		
		List<ProductDTO> alcoholList = myRecipeDAO.category(2); 
		List<ProductDTO> ingreList = myRecipeDAO.category(3); 
		
		req.setAttribute("alcoholList", alcoholList);
		req.setAttribute("ingreList", ingreList);
		
		req.getRequestDispatcher("/app/myrecipe/myrecipeupload.jsp").forward(req, resp);
	}

}