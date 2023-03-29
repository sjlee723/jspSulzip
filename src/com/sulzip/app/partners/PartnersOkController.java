package com.sulzip.app.partners;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.partners.dao.PartnersDAO;
import com.sulzip.app.partners.dto.PartnersDTO;


//int partnersNumber;
//String userContact;
//String userEmail;
//String partnersLoc;
//String partnersLocation;
//String partnersStatus;
//int userNumber;

public class PartnersOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PartnersDAO partnersDAO = new PartnersDAO();
		PartnersDTO partnersDTO = new PartnersDTO();
		
		req.setCharacterEncoding("utf-8");
		
		partnersDTO.setPartnersNumber(Integer.valueOf(req.getParameter("partnersNumber")));
		
	}
	
}
