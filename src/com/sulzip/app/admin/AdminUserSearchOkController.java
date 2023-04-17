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
import com.sulzip.app.admin.vo.UserListVO;
import com.sulzip.app.admin.vo.UserSearchVO;

public class AdminUserSearchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		
		AdminDAO adminDAO = new AdminDAO();
		UserListVO userListVO = new UserListVO();
		UserSearchVO userSearchVO = new UserSearchVO();
		
		Gson gson = new Gson();
		JsonArray search = new JsonArray();
		PrintWriter out = resp.getWriter();
		
		String keyword = req.getParameter("keyword");
		String select = req.getParameter("select");
		String date = req.getParameter("date");
		String gender = req.getParameter("gender");
		
		userSearchVO.setKeyword(keyword);
		userSearchVO.setSelect(select);
		userSearchVO.setDate(date);
		userSearchVO.setGender(gender);
		
	
		
//		System.out.println(userSearchVO);
		
		List<UserListVO> userList = adminDAO.searchUser(userSearchVO);
//		
//		System.out.println(userList);
//		
		for(UserListVO user : userList) {
			String jsonString = gson.toJson(user);
			search.add(JsonParser.parseString(jsonString));
		}
		
	
		
		
		out.print(search.toString());
		out.close();
		
		
		
		

		
		
	}

}














