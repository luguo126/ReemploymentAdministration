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


@WebServlet("/StoreEmployeeServlet")
public class StoreEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 132L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
		
		Employee vo = new Employee();
		IEmployeeDAO dao = new EmployeeDAOProxy();
		
       
        vo.setId(request.getParameter("id").trim());
		vo.setName(request.getParameter("name").trim());
		vo.setGender(request.getParameter("gender").trim());
		vo.setPassword(request.getParameter("password").trim());
		vo.setBirthday(request.getParameter("birthday").trim());
		vo.setWorkage(request.getParameter("workage"));
		vo.setMajor(request.getParameter("major").trim());
		vo.setEducation(request.getParameter("education").trim());
        
		try {
			if(!dao.findEmployeeId(vo)) { // 这里用该判断employee ID 是否可用
				dao.doCreate(vo);
			}
			response.sendRedirect(request.getContextPath()+"/registration_success.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/registration_error.jsp");
		}finally {
			// 关闭数据库连接
		}
		

		
	}

}
