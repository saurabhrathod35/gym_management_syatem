package com.digimation.goldengym.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digimation.goldengym.bean.PackageDetailBean;
import com.digimation.goldengym.dao.PackageDetailDAO;

public class PackageDetailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<PackageDetailBean> listOfPackageDetailBeans=new PackageDetailDAO().getPackageList();
		request.setAttribute("listofpackagedetail", listOfPackageDetailBeans);
		request.getRequestDispatcher("PackageDetailList.jsp").forward(request, response);

	}

}
