package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.luguo126.ReemploymentAdministration.dao.IAdminDAO;
import com.github.luguo126.ReemploymentAdministration.dao.ICompanyDAO;
import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.AdminDAOProxy;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.CompanyDAOProxy;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.EmployeeDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.Administrator;
import com.github.luguo126.ReemploymentAdministration.vo.Company;
import com.github.luguo126.ReemploymentAdministration.vo.Employee;


@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {

	private static final long serialVersionUID = 3534432566487448359L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session2 = request.getSession();
		String category = (String) session2.getAttribute("category");
		if(category.equals("再就业人员")) {
			Employee vo = new Employee();
	        HttpSession session = request.getSession();
	        String id = (String) session.getAttribute("id");
			vo.setId(id);
			vo.setPassword(request.getParameter("password"));
			
			IEmployeeDAO dao = new EmployeeDAOProxy();
			try {
				if(dao.resetPassword(vo)) {
					request.getRequestDispatcher("resetPassword_success.jsp").include(request, response);
				}else {
					request.getRequestDispatcher("resetPassword_error.jsp").include(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(category.equals("公司")) {
			Company vo = new Company();
	        HttpSession session = request.getSession();
	        String id = (String) session.getAttribute("id");
			vo.setId(id);
			vo.setPassword(request.getParameter("password"));
			
			ICompanyDAO dao = new CompanyDAOProxy();
			try {
				if(dao.resetPassword(vo)) {
					request.getRequestDispatcher("resetPassword_success.jsp").include(request, response);
				}else {
					request.getRequestDispatcher("resetPassword_error.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if(category.equals("管理员")){
			Administrator vo = new Administrator();
	        HttpSession session = request.getSession();
	        String id = (String) session.getAttribute("id");
			vo.setId(id);
			vo.setPassword(request.getParameter("password"));
			IAdminDAO dao = new AdminDAOProxy();
			try {
				if(dao.resetPassword(vo)) {
					request.getRequestDispatcher("resetPassword_success.jsp").include(request, response);
				}else {
					request.getRequestDispatcher("resetPassword_error.jsp").include(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		out.close();
		System.out.println(category);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
