package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.luguo126.ReemploymentAdministration.dao.ICompanyDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.CompanyDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.ZhaoPinInfo;

/**
 * Servlet implementation class StoreZhaopin
 */
@WebServlet("/StoreZhaopin")
public class StoreZhaopin extends HttpServlet {
	private static final long serialVersionUID = 134L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");		
		
		ZhaoPinInfo vo = new ZhaoPinInfo();
		ICompanyDAO dao = new CompanyDAOProxy();
		
		vo.setTitle(request.getParameter("title"));
		vo.setCategory(request.getParameter("category"));
		vo.setSalary(request.getParameter("salary"));
		vo.setWelfare(request.getParameter("welfare"));
		vo.setCompany(request.getParameter("company"));
		vo.setAddress(request.getParameter("address"));
		vo.setRelease_date(request.getParameter("release_date"));
		vo.setContent(request.getParameter("content"));
		
		//------for debug -----
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("salary"));
		System.out.println(request.getParameter("welfare"));
		System.out.println(request.getParameter("company"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("release_date"));
		System.out.println(request.getParameter("content"));
		// --------------------
		
		if(dao.save_zhaopin(vo)) {
			response.sendRedirect(request.getContextPath()+"/fabu_zhaopin_success.jsp");
		}else {
			response.sendRedirect(request.getContextPath()+"/fabu_zhaopin_error.jsp");
		}
	}

}
