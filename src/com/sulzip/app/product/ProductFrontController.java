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
		case "/product/productAlcoholDetail.prd": 
			System.out.println("안녕하세요!!!");
			new ProductAlcoholController().execute(req, resp);
			break;
		case "/product/productAlcohol1.prd" : 
			req.getRequestDispatcher("/app/product/alcohol1.jsp").forward(req, resp);
			break;
		case "/product/productAlcohol2.prd" : 
			req.getRequestDispatcher("/app/product/alcohol2.jsp").forward(req, resp);
			break;
		case "/product/productIngredientsDetail.prd": 
			new ProductIngredientsController().execute(req, resp);
			break;
		case "/product/productIngredients1.prd" : 
			req.getRequestDispatcher("/app/product/ingredients1.jsp").forward(req, resp);
			break;
		case "/product/productIngredients2.prd" : 
			req.getRequestDispatcher("/app/product/ingredients2.jsp").forward(req, resp);
			break;
		case "/product/productSuppliesDetail.prd": 
			new ProductSuppliesController().execute(req, resp);
			break;
		case "/product/productSupplies1.prd" : 
			req.getRequestDispatcher("/app/product/supplies1.jsp").forward(req, resp);
			break;
		case "/product/productSupplies2.prd" : 
			req.getRequestDispatcher("/app/product/supplies2.jsp").forward(req, resp);
			break;
		}
	}
}
