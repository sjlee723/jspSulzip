package com.sulzip.app.sulkit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SulkitFrontController extends HttpServlet {
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
		case "/sulkit/sulkitDetail.suk": 
			System.out.println("안녕하세요!!!");
			new SulkitBoardController().execute(req, resp);
			break;
		case "/sulkit/productSulkit1.suk" : 
			req.getRequestDispatcher("/app/sulkit/sulkit1.jsp").forward(req, resp);
			break;
		case "/sulkit/productSulkit2.suk" : 
			req.getRequestDispatcher("/app/sulkit/sulkit2.jsp").forward(req, resp);
			break;
		case "/sulkit/productSulkit3.suk" : 
			req.getRequestDispatcher("/app/sulkit/sulkit3.jsp").forward(req, resp);
			break;
		}
	}
}
