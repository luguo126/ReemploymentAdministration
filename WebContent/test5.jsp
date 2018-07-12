<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();


%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>XXX</title>
<style type="text/css">
//编写样式后面的工作
*{margin:0;
padding:0;
}
body{
font-size:12px;
font-family:"微软雅黑";
}
a{color:blue;
text-decoration: none;
}
a:HOVER {
    color:red;
}

</style>
</head>

<body>
XX网站<br/>
<c:if test="${sessionScope.user ==null }">
    <a href="<%=path %>/login.jsp">登录</a>
    <a href="<%=path %>/register.jsp">注册</a>

</c:if>
<c:if test="${sessionScope.user !=null }">
    欢迎<a href="">${sessionScope.user.username}</a>&nbsp; &nbsp; 
    <a href="${pageContext.request.contextPath  }/servlet/LogoutServlet">注销</a>
</c:if>


</body>
</html>