package com.sulzip.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.user.dao.UserDAO;
import com.sulzip.app.user.dto.UserDTO;

public class EdituserinfoController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		UserDAO userDAO = new UserDAO();
		
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		
		UserDTO userDTO = userDAO.getUserDetail(userNumber);
		
		String path = null;
		if(userNumber == null || userNumber < 1) {
			path = "/app/user/login.jsp";
		} else {
			path = "/app/user/edituserinfo.jsp";
			req.setAttribute("userDTO", userDTO);
		}
		
		req.getRequestDispatcher(path).forward(req, resp);
	}
}
