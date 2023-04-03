package com.sulzip.app.clientboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.clientboard.dao.ClientBoardDAO;
import com.sulzip.app.clientboard.dto.ClientBoardDTO;

public class ServiceUpdateOkController implements Execute {
@Override
public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ClientBoardDAO clientboardDAO = new ClientBoardDAO();
	ClientBoardDTO clientboardDTO = new ClientBoardDTO();
	
	int boardnumber = 0;
	
	System.out.println("ok컨트롤러 확인");
	System.out.println(req.getParameter("boardTitle"));
	
	
}
}
