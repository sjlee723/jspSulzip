package com.sulzip.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductFrontController extends HttpServlet {
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
		case "/product/productAlcohol.prd": 
			System.out.println("안녕하세요!!!");
			new ProductAlcoholController().execute(req, resp);
			break;
		case "/product/productIngredients.prd": 
			System.out.println("안녕하세요!!!");
			new ProductIngredientsController().execute(req, resp);
			break;
		case "/product/productSupplies.prd": 
			System.out.println("안녕하세요!!!");
			new ProductSuppliesController().execute(req, resp);
			break;
		}
	}
}
