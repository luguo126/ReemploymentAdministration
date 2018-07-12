<%@ page contentType="text/html" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
 <head>
 <meta charset="UTF-8">
  <title>logout</title>
 </head>
 <body> 
  <%
   response.setHeader("refresh", "5; URL = index.jsp");  // 定时跳转
  %>
  <h3>您已成重置密码，<strong>5秒</strong>钟后跳转到主页面</h3>
  如果没有自动跳转，请点击<a href="index.jsp">这里</a>
 </body>
</html>