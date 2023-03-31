package com.sulzip.app.clientboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientBoardFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);
		
		switch(target) {
		case "/clientboard/serviceListOk.clb":
			req.getRequestDispatcher("/app/clientboard/service.jsp").forward(req, resp);
			new ServiceListOkController().execute(req, resp);
			break;
		case "/clientboard/serviceReadOk.clb":
			new ServiceReadOkController().execute(req, resp);
			break;
		case "/clientboard/serviceWrite.clb":
			new ServiceWriteController().execute(req, resp);
			break;
		case "/clientboard/serviceWriteOk.clb":
			new ServiceWriteOkController().execute(req, resp);
			break;
		case "/clientboard/serviceDeleteOk.clb":
			new ServiceDeleteOkController().execute(req, resp);
			break;
		case "/clientboard/serviceUpdate.clb":
			new ServiceUpdateController().execute(req, resp);
			break;
		case "/clientboard/serviceUpdateOk.clb":
			new ServiceUpdateOkController().execute(req, resp);
			break;
		}
	}
}
