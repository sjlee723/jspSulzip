package com.sulzip.app.myrecipe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.myrecipe.dao.MyRecipeDAO;
import com.sulzip.app.myrecipe.dto.MyRecipeDTO;

public class MyRecipeUpdateOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MyRecipeDAO myRecipeDAO = new MyRecipeDAO();
		MyRecipeDTO myRecipeDTO = new MyRecipeDTO();
		HttpSession session = req.getSession();
		
		
		
		
	}

}
