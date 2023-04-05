package com.sulzip.app.clientboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.clientboard.dao.ClientBoardDAO;
import com.sulzip.app.clientboard.dto.ClientBoardDTO;

public class ServiceUpdateController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int boardNumber = Integer.valueOf(req.getParameter("boardNumber"));
		ClientBoardDAO clientBoardDAO = new ClientBoardDAO();
		ClientBoardDTO clientBoardDTO = new ClientBoardDTO();
		req.setCharacterEncoding("utf-8");
		clientBoardDTO.setBoardNumber(boardNumber);
		req.setAttribute("clientBoard", clientBoardDAO.selectDetail(clientBoardDTO));
		req.getRequestDispatcher("/app/clientboard/serviceupdate.jsp").forward(req, resp);
		
	}
}
