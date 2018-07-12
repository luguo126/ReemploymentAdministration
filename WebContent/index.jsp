<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!-- <!DOCTYPE html> -->
<html>
    <head>
        <meta charset="UTF-8">

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



		<script src="static/js/jquery-3.3.1.min.js"></script>

        <style type="text/css">
            html,body {
                margin:0;padding:0;
            }
            a{ text-decoration: none;}
            a:hover{txt-decoration:underline;}


            #mainContainer {
                height:100%;
                width:100%;
            }
            #header {
                height:10%;
                background-color:#333;
            }
            #mid {
            	height:80%;
                background-color:white;
            }
			#footer {
            	height:10%;
                background-color:#333;
            }
        </style>
        
        <script>
        	$(document).ready(function(){
        		  $("#canyin").click(function(){
        		     $('#canyin-page').load("canyin.jsp");
        		  })
        	})
        	
         	$(document).ready(function(){
        		  $("#kefu").click(function(){
        		     $('#canyin-page').load("kefu.jsp");
        		  })
        	})
        	
        	$(document).ready(function(){
        		  $("#wuliu").click(function(){
        		     $('#canyin-page').load("wuliu.jsp");
        		  })
        	})     	
        	
        	$(document).ready(function(){
        		  $("#pugong").click(function(){
        		     $('#canyin-page').load("pugong.jsp");
        		  })
        	})        	
 
        	$(document).ready(function(){
        		  $("#renshi").click(function(){
        		     $('#canyin-page').load("renshi.jsp");
        		  })
        	}) 
        	
        	$(document).ready(function(){
        		  $("#chaoshi").click(function(){
        		     $('#canyin-page').load("chaoshi.jsp");
        		  })
        	})
        	
        	$(document).ready(function(){
        		  $("#caiwu").click(function(){
        		     $('#canyin-page').load("caiwu.jsp");
        		  })
        	})
        	
        	$(document).ready(function(){
        		  $("#jiazheng").click(function(){
        		     $('#canyin-page').load("jiazheng.jsp");
        		  })
        	})
        	
        	$(document).ready(function(){
        		  $("#siji").click(function(){
        		     $('#canyin-page').load("siji.jsp");
        		  })
        	})
        	
        	$(document).ready(function(){
        		  $("#more").click(function(){
        		     $('#canyin-page').load("more.jsp");
        		  })
        	})        	
        </script>
    </head>


    <body>
        <div id="mainContainer">
            <div id="header">
            	<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">再就业网</a>
					</div>
					<div>
						<ul class="nav navbar-nav">
							<li class="active"><a href="index.jsp">首页</a></li>
							<li><a href="#">公司</a></li>
						</ul>
					</div>
					</div>
					
                <c:if test="${ id == null}">
    				<a href="login.jsp">登录</a>
    				<a href="register.jsp">注册</a>
				</c:if>
				
				<c:if test="${ id != null && category == '再就业人员' }" >
					<div class="dropdown" align="right">
						<button type="button" class="btn dropdown-toggle" id="account" data-toggle="dropdown">
        					<c:out value="${ id }" />账户<span class="caret"></span>
    					</button>
    				    <ul class="dropdown-menu pull-right" role="menu" aria-labelledby="daccount">
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="uploadCV.jsp">填写简历</a>
					        </li>
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="ShowCVServlet">我的简历</a>
					        </li>					        
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="cv_sent.jsp">我的投递</a>
					        </li>
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="reset_password.jsp">修改密码</a>
					        </li>					        
					        <li role="presentation" class="divider"></li>
					        
					        <li role="presentation">
					            <a href="${pageContext.request.contextPath}/logout.jsp" role="menuitem" tabindex="-1" href="#">注销</a>
					        </li>
					    </ul>
					</div>				
				</c:if>
				
				<c:if test="${ id != null && category == '公司' }" >
					<div class="dropdown" align="right">
						<button type="button" class="btn dropdown-toggle" id="account" data-toggle="dropdown">
        					<c:out value="${ id }" />账户<span class="caret"></span>
    					</button>
    				    <ul class="dropdown-menu pull-right" role="menu" aria-labelledby="daccount">
<!-- 					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="#">查看简历</a>
					        </li> -->
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="fabu_zhaopin.jsp">发布招聘</a>
					        </li>
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="yifa_zhaopin.jsp">已发招聘</a>
					        </li>					        				        
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="reset_password.jsp">修改密码</a>
					        </li>					        
					        <li role="presentation" class="divider"></li>
					        
					        <li role="presentation">
					            <a href="${pageContext.request.contextPath}/logout.jsp" role="menuitem" tabindex="-1" href="#">注销</a>
					        </li>
					    </ul>
					</div>				
				</c:if>	


				<c:if test="${ id != null && category == '管理员' }" >
					<div class="dropdown" align="right">
						<button type="button" class="btn dropdown-toggle" id="account" data-toggle="dropdown">
        					<c:out value="${ id }" />账户<span class="caret"></span>
    					</button>
    				    <ul class="dropdown-menu pull-right" role="menu" aria-labelledby="daccount">
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="#">管理公司</a>
					        </li>
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="#">管理再就业人员</a>
					        </li>					        
					        <li role="presentation">
					            <a role="menuitem" tabindex="-1" href="reset_password.jsp">修改密码</a>
					        </li>					        
					        <li role="presentation" class="divider"></li>
					        
					        <li role="presentation">
					            <a href="${pageContext.request.contextPath}/logout.jsp" role="menuitem" tabindex="-1" href="#">注销</a>
					        </li>
					    </ul>
					</div>				
				</c:if>										
				</nav>
                                

            </div>




            
            <div id="mid">
            	<div class="left container" style="height:100%;width:25%;background-color:rgb(242, 245, 244);float:left;">
            		<ul>
            			<li><button id="canyin" type="button" class="btn btn-primary">餐饮</button></li>
            			<li><button id="kefu" type="button" class="btn btn-primary">客服</button></li>
            			<li><button id="wuliu" type="button" class="btn btn-primary">物流/仓储</button></li>
            			<li><button id="pugong" type="button" class="btn btn-primary">普工/技工</button></li>
            			<li><button id="renshi" type="button" class="btn btn-primary">人事/行政/后勤</button></li>
            			<li><button id="chaoshi" type="button" class="btn btn-primary">超市/零售/百货</button></li>
            			<li><button id="caiwu" type="button" class="btn btn-primary">财务/审计/统计</button></li>
            			<li><button id="jiazheng" type="button" class="btn btn-primary">家政/保洁/安保</button></li>
            			<li><button id="siji" type="button" class="btn btn-primary">司机/交通/服务</button></li>
            			<li><button id="more" type="button" class="btn btn-primary">更多职类</button></li>
            		</ul>
            	</div>
            	<div id="canyin-page" class="right" style="height:100%;">
            	再就业招聘
            	</div>
            </div>
            
            <div align="center" style="color:white" id="footer">@copyright</div>
        </div>


    </body>
</html>
