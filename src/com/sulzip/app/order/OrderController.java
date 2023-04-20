package com.sulzip.app.order;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.cart.dao.CartDAO;
import com.sulzip.app.cart.vo.CartVO;
import com.sulzip.app.order.dao.OrderDAO;
import com.sulzip.app.product.dao.ProductDAO;
import com.sulzip.app.product.dto.ProductDTO;
import com.sulzip.app.user.dao.UserDAO;
import com.sulzip.app.user.dto.UserDTO;

public class OrderController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		OrderDAO orderDAO = new OrderDAO();
		HttpSession session = req.getSession();
		CartDAO cartDAO = new CartDAO();
		UserDAO userDAO = new UserDAO();
		ProductDAO productDAO = new ProductDAO();
		
		List<ProductDTO> checkedList = new ArrayList<>();
		
		int userNumber = (Integer)session.getAttribute("userNumber");
		UserDTO userDTO = userDAO.getUserDetail(userNumber);
		
		req.setAttribute("user", userDTO);
		
		List<CartVO> cartList = cartDAO.select(userNumber);
		
		String[] checked = req.getParameterValues("cart_check");
		
		
		for(String product : checked) {
			int num = Integer.valueOf(product);
			checkedList.add(productDAO.alcohol(num));
		}
		
//		req.setAttribute("cartList", cartList);
		req.setAttribute("checkedList", checkedList);
		req.getRequestDispatcher("/app/order/orderpage.jsp").forward(req, resp);
		
		
		
		
	}
}
