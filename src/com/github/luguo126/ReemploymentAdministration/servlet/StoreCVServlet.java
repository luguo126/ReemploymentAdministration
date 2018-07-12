package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.EmployeeDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.CV;


@WebServlet("/StoreCVServlet")
public class StoreCVServlet extends HttpServlet {

	private static final long serialVersionUID = -1302660507028774233L;

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");		
		
		CV vo = new CV();
		IEmployeeDAO dao = new EmployeeDAOProxy();
		
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        
		vo.setUid(id);
		vo.setName(request.getParameter("name"));
		vo.setSex(request.getParameter("sex"));
		vo.setAge(request.getParameter("age"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		vo.setJobIntent(request.getParameter("job-intent"));
		vo.setSelfDescription(request.getParameter("self-description"));
		vo.setWorkExperience(request.getParameter("work-experience"));
		vo.setEducation(request.getParameter("education"));
		
		
//		System.out.println(vo.getName());
//		System.out.println(vo.getSex());
//		System.out.println(vo.getAge());
//		System.out.println(vo.getTel());
//		System.out.println(vo.getEmail());
//		System.out.println(vo.getJobIntent());
//		System.out.println(vo.getSelfDescription());
//		System.out.println(vo.getWorkExperience());
//		System.out.println(vo.getEducation());
		
		
		try {
			if(dao.storeCV(vo)) {
				response.sendRedirect(request.getContextPath()+"/storecv_success.jsp");
			}else {
				System.out.println("store CV err");
				response.sendRedirect(request.getContextPath()+"/storecv_error.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
