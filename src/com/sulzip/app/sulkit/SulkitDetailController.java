package com.sulzip.app.sulkit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.product.dto.ProductDTO;
import com.sulzip.app.sulkit.dao.SulkitDAO;

public class SulkitDetailController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SulkitDAO sulkitDAO = new SulkitDAO();
		
		int num = Integer.parseInt(req.getParameter("num"));
		
		ProductDTO productDTO = sulkitDAO.recipe(num);
		
		System.out.println(productDTO);
		
		req.setAttribute("sulkit", productDTO);
	}

}
