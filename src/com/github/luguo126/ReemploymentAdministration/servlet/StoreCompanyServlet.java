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


@WebServlet("/StoreCompanyServlet")
public class StoreCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 30L;
       
    public StoreCompanyServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
		
		Company vo = new Company();
		ICompanyDAO dao = new CompanyDAOProxy();
		
       
        vo.setId(request.getParameter("id").trim());
		vo.setName(request.getParameter("name").trim());
		vo.setNature(request.getParameter("nature").trim());
        vo.setPassword(request.getParameter("password").trim());
        vo.setContactPerson(request.getParameter("contactPerson").trim());
		vo.setContactTel(request.getParameter("contactTel").trim());
		
//		System.out.println(vo.getId());
//		System.out.println(vo.getName());
//		System.out.println(vo.getPassword());
//		System.out.println(vo.getName());
//		System.out.println(vo.getContactPerson());
//		System.out.println(vo.getContactTel());
		
		
		try {
			if(!dao.findCompanyId(vo)) {
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
