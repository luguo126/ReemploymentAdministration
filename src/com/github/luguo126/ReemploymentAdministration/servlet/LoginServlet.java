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


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 19L;

    public LoginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
//        request.getRequestDispatcher("index.jsp").include(request, response);
        
		String category = request.getParameter("role").trim();
		if(category.equals("再就业人员")) {
			Employee vo = new Employee();
			vo.setId(request.getParameter("form-id"));
			vo.setPassword(request.getParameter("form-password"));
			
			IEmployeeDAO dao = new EmployeeDAOProxy();
			try {
				if(dao.findLogin(vo)) {
					HttpSession session = request.getSession();
					session.setAttribute("id", vo.getId());
					session.setAttribute("category", "再就业人员");
					System.out.println(vo.getId());
//					response.sendRedirect(request.getContextPath()+"/index-employee.jsp");
					request.getRequestDispatcher("index.jsp").include(request, response);
				} else {
					out.print("<font style='color:red;'>对不起，用户名或密码错误!</font>");
		            request.getRequestDispatcher("login.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(category.equals("公司")) {
			Company vo = new Company();
			vo.setId(request.getParameter("form-id"));
			vo.setPassword(request.getParameter("form-password"));
			
			ICompanyDAO dao = new CompanyDAOProxy();
			try {
				if(dao.findLogin(vo)) {
					HttpSession session = request.getSession();
					session.setAttribute("id", vo.getId());
					session.setAttribute("category", "公司");
//					response.sendRedirect(request.getContextPath()+"/index-company.jsp");
					request.getRequestDispatcher("index.jsp").include(request, response);
				}else {
					out.print("<font style='color:red;'>对不起，用户名或密码错误!</font>");
		            request.getRequestDispatcher("login.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if(category.equals("管理员")){
			Administrator vo = new Administrator();
			vo.setId(request.getParameter("form-id"));
			vo.setPassword(request.getParameter("form-password"));
			IAdminDAO dao = new AdminDAOProxy();
			try {
				if(dao.findLogin(vo)) {
					HttpSession session = request.getSession();
					session.setAttribute("id", vo.getId());
					session.setAttribute("category", "管理员");
//					response.sendRedirect(request.getContextPath()+"/admin.jsp");
					request.getRequestDispatcher("index.jsp").include(request, response);
				}else {
					out.print("<font style='color:red;'>对不起，用户名或密码错误!</font>");
		            request.getRequestDispatcher("login.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		
		out.close();
		System.out.println(category);
	}

}
