package com.sulzip.app.sulkit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.sulkit.dao.SulkitDAO;
import com.sulzip.app.sulkit.dto.SulkitDTO;

public class SulkitBoardController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SulkitDAO sulkitDAO = new SulkitDAO();
		
		int num = Integer.parseInt(req.getParameter("num"));
		
		System.out.println(num);
		
		SulkitDTO sulkitDTO = sulkitDAO.selectSulkit(num);
		
		System.out.println(sulkitDTO);
		
		req.setAttribute("sulkit", sulkitDTO);
	}

}
