package com.sulzip.app.admin;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sulzip.app.Execute;

public class AdminSearchOkController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		
		
		
		String keyword = req.getParameter("keyword");
		String category = req.getParameter("category");
		
		System.out.println(keyword);
		System.out.println(category);
		
		Gson gson = new Gson();
		JsonElement json = JsonParser.parseString("{\"aa\" : 1234}");
		PrintWriter out = resp.getWriter();
		out.print(json.toString());
		
		List<SearchVO> searchList = 	
	}
}











