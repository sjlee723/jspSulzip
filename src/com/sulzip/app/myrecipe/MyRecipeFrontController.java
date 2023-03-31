package com.sulzip.app.myrecipe;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.sulkit.SulkitBoardController;

public class MyRecipeFrontController extends HttpServlet {
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
		case "/myrecipe/myRecipeBoard.mrb": 
			System.out.println("안녕하세요!!!");
			new MyRecipeBoardController().execute(req, resp);
			System.out.println("이게나오면프론트컨트롤러정상");
			break;
		case "/myrecipe/myRecipeWrite.mrb": 
			System.out.println("안녕하세요!!!");
			new MyRecipeWriteController().execute(req, resp);
			break;
		}
	}
}
