package com.sulzip.app.order;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.order.dao.OrderDAO;

public class OrderController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderDAO orderDAO = new OrderDAO();
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");

	}
}
