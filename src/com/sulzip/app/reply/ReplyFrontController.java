package com.sulzip.app.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReplyFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);
		
		switch(target) {
		case "/reply/replyListOk.rep":
			new ReplyListOkController().execute(req, resp);
			break;
		case "/reply/replyWriteOk.rep":
			new ReplyWriteOkController().execute(req, resp);
			break;
		case "/reply/replyDeleteOk.rep":
			new ReplyDeleteOkController().execute(req, resp);
			break;
		case "/reply/replyUpdateOk.rep":
			new ReplyUpdateOkController().execute(req, resp);
			break;
		}
	}
}
