package com.sulzip.app.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.user.dao.UserDAO;

public class CheckIdOkController implements Execute {

   @Override
   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       UserDAO userDAO= new UserDAO();
       
       resp.setContentType("text/html; charset=utf-8");
       
       boolean result = userDAO.checkId(req.getParameter("userId"));
       
       PrintWriter out = resp.getWriter();
       
       out.print(result? "사용가능한 아이디 입니다." : "중복된 아이디 입니다.");
       
       out.close();
   }

}