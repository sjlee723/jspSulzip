
package com.sulzip.app.clientboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.user.dao.UserDAO;

public class ServiceWriteController implements Execute {
@Override
public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserDAO userDAO = new UserDAO();
	HttpSession session = req.getSession();
//	Integer userNumber = (Integer)session.getAttribute("userNumber");
	Integer userNumber = 1;
	String path = null;
	
	if(userNumber == null || userNumber < 1) {
		path = "/app/user/login.jsp";
	} else {
		path = "/app/clientboard/servicewrite.jsp";
//		req.setAttribute("userId", userDAO.getUserId(userNumber));
		req.setAttribute("userId", "aaa");
	}
	
	req.getRequestDispatcher(path).forward(req, resp);
}
}
