<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
简历已经保存
  <%
   response.setHeader("refresh", "4; URL = index.jsp");  // 定时跳转
   session.invalidate(); // 注销 session 
  %>
  <h3>您已成功退出，<strong>4秒</strong>钟后跳转到主页面</h3>
  如果没有自动跳转，请点击<a href="index.jsp">这里</a>
</body>
</html>