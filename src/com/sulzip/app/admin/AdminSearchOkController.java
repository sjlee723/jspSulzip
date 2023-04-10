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
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sulzip.app.Execute;
import com.sulzip.app.admin.dao.AdminDAO;
import com.sulzip.app.admin.vo.SearchVO;
import com.sulzip.app.product.vo.ProductVO;

public class AdminSearchOkController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		AdminDAO adminDAO = new AdminDAO();
		SearchVO searchVO = new SearchVO();
		Gson gson = new Gson();
		JsonArray replies = new JsonArray();
		PrintWriter out = resp.getWriter();
		
		
		String keyword = req.getParameter("keyword");
		String category = req.getParameter("category");
		
		System.out.println(keyword);
		System.out.println(category);
		
		
		searchVO.setCategory(category);
		searchVO.setKeyword(keyword);
		
		
		List<ProductVO> joined = new ArrayList<ProductVO>();
		
		if(category.equals("0")) {
			List<ProductVO> searchPro = adminDAO.searchProAll(searchVO);
			List<ProductVO> searchSul = adminDAO.searchSul(searchVO);
			
			joined.addAll(searchPro);
			joined.addAll(searchSul);
			
			for(ProductVO join : joined) {
				String replyJson = gson.toJson(join);
				replies.add(JsonParser.parseString(replyJson));
			}
			
		}else if(category.equals("1")) {
			List<ProductVO> searchSul = adminDAO.searchSul(searchVO);
			
			for(ProductVO sul : searchSul) {
				String replyJson = gson.toJson(sul);
				replies.add(JsonParser.parseString(replyJson));
			}
			
		}else if(category.equals("2") || category.equals("3") || category.equals("4")) {
			List<ProductVO> searchPro = adminDAO.searchPro(searchVO);
			
			for(ProductVO pro : searchPro) {
				String replyJson = gson.toJson(pro);
				replies.add(JsonParser.parseString(replyJson));
			}
		}
		
		out.print(replies.toString());
		out.close();
	}
}











