<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl" %>
<%@ page import="com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection" %>   
<%@ page import="java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet"
		href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
	<link rel="stylesheet"
		href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	<!-- Jquery 依赖 -->
	<script src="https://cdn.bootcss.com/jquery/1.9.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js">
	</script>

</head>
<body>

<%
	Connection conn = new DatabaseConnectionImpl().getConnection();
	Statement stmt = null;
	ResultSet rs = null;

	String sql = "select * from zhaopin where category='普工'";
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