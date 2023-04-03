package com.sulzip.app.clientboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.clientboard.dao.ClientBoardDAO;
import com.sulzip.app.clientboard.dto.ClientBoardDTO;

//<!-- //int boardNumber;
//String boardDate;
//String boardTitle;
//String boardContent;
//String boardCondition;
//int userNumber; -->


public class ServiceWriteOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClientBoardDAO clientboardDAO = new ClientBoardDAO();
		ClientBoardDTO clientboardDTO = new ClientBoardDTO();
		
		HttpSession session = req.getSession();
		req.setCharacterEncoding("utf-8");
		
		clientboardDTO.setBoardDate(req.getParameter("boardDate"));
		clientboardDTO.setBoardTitle(req.getParameter("boardTitle"));
		clientboardDTO.setBoardContent(req.getParameter("boardContent"));
		clientboardDTO.setBoardCondition(req.getParameter("boardCondition"));
//		clientboardDTO.setUserNumber(Integer.valueOf(req.getParameter("userNumber")));
		clientboardDTO.setUserNumber(1);

		
		clientboardDAO.write(clientboardDTO);
		
		resp.sendRedirect("/clientboard/serviceListOk.clb");
	}
}
