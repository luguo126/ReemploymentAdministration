package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.luguo126.ReemploymentAdministration.dao.ICompanyDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.CompanyDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.Company;


@WebServlet("/FindCompanyIdServlet")
public class FindCompanyIdServlet extends HttpServlet {
	private static final long serialVersionUID = 33L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String company_id = request.getParameter("id");
		String uid_tips="";		
		
		Company vo = new Company();
		vo.setId(company_id);
		
		ICompanyDAO dao = new CompanyDAOProxy();
		
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

		try {
			if(dao.findCompanyId(vo)) {
				uid_tips="<font color='red'>id已存在</font>";		        
		        response.getWriter().println(uid_tips);	
		        
		        return ;
			}else {
				uid_tips="<font color='green'>id可用</font>";		        
		        response.getWriter().println(uid_tips);
		        
		        return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
