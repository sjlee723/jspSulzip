package com.sulzip.app.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sulzip.app.Execute;
import com.sulzip.app.admin.dao.AdminDAO;
import com.sulzip.app.admin.vo.BoardSearchVO;
import com.sulzip.app.admin.vo.BoardVO;
import com.sulzip.app.user.dto.UserDTO;

public class AdminBoardSearchOKController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("들어옴");
		resp.setContentType("application/json;charset=utf-8");
		
		AdminDAO adminDAO = new AdminDAO();
		BoardVO boardVO = new BoardVO();
		BoardSearchVO boardSearchVO = new BoardSearchVO();
		UserDTO userDTO = new UserDTO();
		
		
		Gson gson = new Gson();
		JsonArray search = new JsonArray();
		PrintWriter out = resp.getWriter();
		
		
		String keyword = req.getParameter("keyword");
		String select = req.getParameter("select");
		String category = req.getParameter("category");
		
//		System.out.println(category);
//		System.out.println(keyword);
		
		boardSearchVO.setKeyword(keyword);
		boardSearchVO.setSelect(select);
		boardSearchVO.setCategory(category);
		
		
//		List<BoardVO> myRecipeList = adminDAO.myRecipeList();
//		List<BoardVO> clientList = adminDAO.clientList();
//		List<BoardVO> myRecipeList = adminDAO.myRecipeList(boardSearchVO);
		
//		System.out.println(boardSearchVO);
		
		if(category.equals("M")) {
			
			if(select.equals("1")) {
			List<BoardVO> myRecipeName = adminDAO.myRecipeName(boardSearchVO);
			
//			System.out.println(myRecipeName);
			
			for(BoardVO board : myRecipeName) {
				String jsonString = gson.toJson(board);
				search.add(JsonParser.parseString(jsonString));
			}
		}else if(select.equals("2")) {
			List<BoardVO> myRecipeId = adminDAO.myRecipeId(boardSearchVO);
			
			for(BoardVO board : myRecipeId) {
				String jsonString = gson.toJson(board);
				search.add(JsonParser.parseString(jsonString));
			}
			
		}else {
			List<BoardVO> myRecipeList = adminDAO.selectMyRecipeAll();
			
			for(BoardVO board : myRecipeList) {
				String jsonString = gson.toJson(board);
				search.add(JsonParser.parseString(jsonString));
			}
		}
			
		}else if(category.equals("C")) {
			
			if(select.equals("1")) {
				List<BoardVO> clientName = adminDAO.clientName(boardSearchVO);
				
				for(BoardVO board : clientName) {
					String jsonString = gson.toJson(board);
					search.add(JsonParser.parseString(jsonString));
				}
			}else if(select.equals("2")) {
				List<BoardVO> clientId = adminDAO.clientId(boardSearchVO);
				
				for(BoardVO board : clientId) {
					String jsonString = gson.toJson(board);
					search.add(JsonParser.parseString(jsonString));
				}
			}else {
				List<BoardVO> clientList = adminDAO.selectClientAll();
				
				for(BoardVO board : clientList) {
					String jsonString = gson.toJson(board);
					search.add(JsonParser.parseString(jsonString));
				}
			}
			
		}
		

		out.print(search.toString());
		out.close();
		
	}
	

	
//	if(select.equals("1")) {
//		List<BoardVO> myRecipeName = adminDAO.myRecipeName(boardSearchVO);
//		
////		System.out.println(myRecipeName);
//		
//		for(BoardVO board : myRecipeName) {
//			String jsonString = gson.toJson(board);
//			search.add(JsonParser.parseString(jsonString));
//		}
//	}else if(select.equals("2")) {
//		List<BoardVO> myRecipeId = adminDAO.myRecipeId(boardSearchVO);
//		
//		for(BoardVO board : myRecipeId) {
//			String jsonString = gson.toJson(board);
//			search.add(JsonParser.parseString(jsonString));
//		}
//		
//	}

}














