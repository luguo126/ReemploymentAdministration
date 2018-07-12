<%@ page contentType="text/html" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
 <head>
 <meta charset="UTF-8">
  <title>logout</title>
 </head>
 <body> 
  <%
   response.setHeader("refresh", "3; URL = reset_password.jsp");  // 定时跳转
  %>
  <h3>重置密码失败，<strong>3秒</strong>钟后跳转到密码重置页面</h3>
  如果没有自动跳转，请点击<a href="reset_password.jsp">这里</a>
 </body>
</html>