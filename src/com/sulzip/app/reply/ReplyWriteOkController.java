package com.sulzip.app.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.reply.dao.ReplyDAO;
import com.sulzip.app.reply.dto.ReplyDTO;

public class ReplyWriteOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReplyDTO replyDTO = new ReplyDTO();
		
		req.setCharacterEncoding("utf-8");
		
		replyDTO.setBoardNumber(Integer.valueOf(req.getParameter("boardNumber")));
		replyDTO.setUserNumber(Integer.valueOf(req.getParameter("userNumber")));
		replyDTO.setReplyContent(req.getParameter("replyContent"));
	
		new ReplyDAO().insert(replyDTO);
	}
}
