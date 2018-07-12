package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.EmployeeDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.Employee;


@WebServlet("/FindEmployeeIdServlet")
public class FindEmployeeIdServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employee_id = request.getParameter("id");
		String uid_tips="";		
		
		Employee vo = new Employee();
		vo.setId(employee_id);
		
		IEmployeeDAO dao = new EmployeeDAOProxy();
		
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

		try {
			if(dao.findEmployeeId(vo)) {
				uid_tips="<font color='red'>用户名已存在</font>";		        
		        response.getWriter().println(uid_tips);	
		        
		        return ;
			}else {
				uid_tips="<font color='green'>用户名可用</font>";
		        response.getWriter().println(uid_tips);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
