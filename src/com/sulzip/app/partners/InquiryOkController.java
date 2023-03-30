package com.sulzip.app.partners;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sulzip.app.Execute;
import com.sulzip.app.partners.dao.PartnersDAO;
import com.sulzip.app.partners.dto.PartnersDTO;

//int partnersNumber;
//String partnersContact;
//String partnersEmail;
//String partnersLoc;
//String partnersLocation;
//int userNumber;
//String partnersName;
//String partnersContent;

public class InquiryOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PartnersDAO partnersDAO = new PartnersDAO();
		PartnersDTO partnersDTO = new PartnersDTO();
		HttpSession session = req.getSession();
		req.setCharacterEncoding("utf-8");
		
		partnersDTO.setPartnersContact(req.getParameter("partnersContact"));
		partnersDTO.setPartnersEmail(req.getParameter("partnersEmail"));
		partnersDTO.setPartnersLoc(req.getParameter("partnersLoc"));
		partnersDTO.setPartnersLocation(req.getParameter("partnersLocation"));
		partnersDTO.setUserNumber(2);
//		partnersDTO.setUserNumber((Integer)session.getAttribute("userNumber"));
		partnersDTO.setPartnersName(req.getParameter("partnersName"));
		partnersDTO.setPartnersContent(req.getParameter("partnersContent"));
		
		partnersDAO.inquiry(partnersDTO);
		
		resp.sendRedirect("/user/login.usr");
		
	}
	
}
