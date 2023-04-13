package com.sulzip.app.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.admin.dao.AdminDAO;
import com.sulzip.app.admin.vo.BoardSearchVO;
import com.sulzip.app.admin.vo.BoardVO;

public class AdminBoardController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		BoardVO boardVO = new BoardVO();
		BoardSearchVO boardSearchVO = new BoardSearchVO();
		
		List<BoardVO> myRecipeList = adminDAO.selectMyRecipeAll();
		
//		System.out.println(myRecipeList);
		req.setAttribute("myRecipeList", myRecipeList);
		
		
		req.getRequestDispatcher("/app/admin/adminboard.jsp").forward(req, resp);
		
		
	}

}











