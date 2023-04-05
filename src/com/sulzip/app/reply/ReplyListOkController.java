package com.sulzip.app.reply;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sulzip.app.Execute;
import com.sulzip.app.reply.dao.ReplyDAO;
import com.sulzip.app.reply.vo.ReplyVO;

public class ReplyListOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		ReplyDAO replyDAO = new ReplyDAO();
		Gson gson = new Gson();
		JsonArray replies = new JsonArray();
		
		List<ReplyVO> replyList = replyDAO.selectAll(boardNumber);
		
		for(ReplyVO reply : replyList) {
			
			String replyJson = gson.toJson(reply);
			System.out.println(replyJson);
			replies.add(JsonParser.parseString(replyJson));
		}
		
		resp.setContentType("application/json;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print(replies.toString());
		out.close();
	}
}
