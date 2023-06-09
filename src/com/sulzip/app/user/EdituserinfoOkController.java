package com.sulzip.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.user.dao.UserDAO;
import com.sulzip.app.user.dto.UserDTO;

public class EdituserinfoOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		req.setCharacterEncoding("utf-8");

		HttpSession session = req.getSession();
		
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		String userPw = req.getParameter("userPw");
		String userEmail = req.getParameter("userEmail");
		String userPhone = req.getParameter("userPhone");
		
		userDTO.setUserPw(userPw);
		userDTO.setUserEmail(userEmail);
		userDTO.setUserPhone(userPhone);
		userDTO.setUserNumber(userNumber);
		
		userDAO.modify(userDTO);
		System.out.println("ok컨트롤러 확인");
		System.out.println(req.getParameter("userEmail"));
		
	}
}
