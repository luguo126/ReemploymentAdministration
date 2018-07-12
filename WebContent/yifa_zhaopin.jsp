<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl" %>
<%@ page import="com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection" %>   
<%@ page import="java.sql.*" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
已发布的招聘信息

<%
	Connection conn = new DatabaseConnectionImpl().getConnection();
	Statement stmt = null;
	ResultSet rs = null;

	String sql = "select * from zhaopin";
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql);
	while(rs.next()) {
		String title = rs.getString("title");
		String category = rs.getString("category");
		String salary = rs.getString("salary");
		String welfare = rs.getString("welfare");
		String company = rs.getString("company");
		String address = rs.getString("address");
		String release_date = rs.getString("release_date");
		String content = rs.getString("content");
%>

		title: <%= title%><br>
		category: <%= category%><br>
		salary: <%= salary%><br>
		welfare: <%= welfare%><br>
		company: <%= company%><br>
		address: <%= address%><br>
		release_date: <%= release_date%><br>
		content: <%= content%><br>

<%
out.print("-------------------------------------------------------------");
%>
<br>
<%
	}
%>


</body>
</html>