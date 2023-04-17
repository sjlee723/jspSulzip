package com.sulzip.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.admin.dao.AdminDAO;
import com.sulzip.app.admin.vo.UserListVO;
import com.sulzip.app.user.dto.UserDTO;

public class AdminUserDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		UserListVO userListVO = new UserListVO();
		UserDTO userDTO = new UserDTO();
		
		String[] userList = req.getParameterValues("userList");
		
//		System.out.println(Arrays.toString(userIds));
		
//		List<UserListVO> userList = adminDAO.userList();
		
		
		
		for(String userId : userList) {
			adminDAO.delete(userId);
		
		}
		
		List<UserListVO> userLists = adminDAO.userList();
		
		req.setAttribute("userList", userLists);
		
		
	}

}
