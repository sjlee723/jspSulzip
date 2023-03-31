package com.sulzip.app.myrecipe;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sulzip.app.Execute;
import com.sulzip.app.myrecipe.dao.MyRecipeDAO;
import com.sulzip.app.myrecipe.dto.MyRecipeDTO;
import com.sulzip.app.myrecipe.vo.MyRecipeVO;

public class MyRecipeBoardController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("mrb컨트롤러 들어옴");
		MyRecipeDAO myRecipeDAO = new MyRecipeDAO();
		System.out.println("2");
		 int mrbNum = Integer.parseInt(req.getParameter("num"));
		 System.out.println("3");
	      MyRecipeDTO myRecipeDTO = myRecipeDAO.select(mrbNum);
	      List<MyRecipeVO> ingreList = myRecipeDAO.ingre(mrbNum);
	      System.out.println("4");
	      req.setAttribute("myRecipe", myRecipeDTO);
	      req.setAttribute("ingreList", ingreList);
	      System.out.println("mrb컨트롤러 끝남");
	      req.getRequestDispatcher("/app/myrecipe/myrecipedetail.jsp").forward(req, resp);
	}

}
