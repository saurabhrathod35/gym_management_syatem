package com.digimation.goldengym.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digimation.goldengym.bean.TrainerBean;
import com.digimation.goldengym.dao.TrainerDAO;

public class TrainerUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		TrainerBean cityBeanObj =new TrainerDAO().getTrainerListByPK(Integer.parseInt(id));
		request.setAttribute("trainerBean",cityBeanObj);
		request.getRequestDispatcher("TrainerUpdate.jsp").forward(request, response);

	}

}
