package com.github.luguo126.ReemploymentAdministration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.dao.proxy.EmployeeDAOProxy;
import com.github.luguo126.ReemploymentAdministration.vo.CV;


@WebServlet("/ShowCVServlet")
public class ShowCVServlet extends HttpServlet {
	private static final long serialVersionUID = 455L;
    
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("cv.jsp").include(request, response);
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        
		CV vo = null;
		IEmployeeDAO dao = new EmployeeDAOProxy();
        try {
			vo = dao.findCVByUid(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        out.println("<html>");
        out.println("<head>");
        out.println("<title>我的简历</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>我的信息</h3>");
        	out.println("<p>");
        	out.println("姓名: ");out.println(vo.getName());out.println("<br>");
        	out.println("年龄:");out.println(vo.getAge());out.println("<br>");
        	out.println("性别:");out.println(vo.getSex());out.println("<br>");
        	out.println("email:");out.println(vo.getEmail());out.println("<br>");
        	out.println("联系电话:");out.println(vo.getTel());out.println("<br>");
        out.println("<h3>求职意向</h3>");
        	out.println(vo.getJobIntent());out.println("<br>");
        out.println("<h3>自我描述</h3>");
        	out.println(vo.getSelfDescription());out.println("<br>");
        out.println("<h3>教育经历</h3>");
        	out.println(vo.getEducation());out.println("<br>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
	}

}
