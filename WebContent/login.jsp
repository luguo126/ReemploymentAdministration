<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>登录</title>

        <!-- CSS -->
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<!--         <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css"> -->
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

<script>

</script>

    </head>

    <body>



        <!-- Top content -->
        <div class="top-content">

            <div class="inner-bg">
                <div class="container">

                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong><a href="index.html">再就业网</a></strong> 用户登录</h1>
                            <div class="description">
                            	<p>
	                            	欢迎登录再就就业网
                            	</p>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                    	<div class="col-sm-6 book">
                    		<img src="assets/img/logo.png" alt="">
                    	</div>

                        <div class="col-sm-5 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>登录</h3>
                            		<p>请输入正确的登录信息:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="LoginServlet" method="post" class="registration-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-id">id</label>
			                        	<input type="text" name="form-id" placeholder="用户ID" class="form-id form-control" id="form-id" autofocus="autofocus">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">password</label>
			                        	<input type="password" name="form-password" placeholder="密码" class="form-password form-control" id="form-password">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="category">password</label>
			                        	<input type="radio" name="role" value="再就业人员" checked>&nbsp;再就业人员&nbsp;&nbsp;&nbsp;
			                        	<input type="radio" name="role" value="公司">&nbsp;公司&nbsp;&nbsp;&nbsp;
			                        	<input type="radio" name="role" value="管理员">&nbsp;管理员&nbsp;&nbsp;&nbsp;             	
			                        </div>
			                        <button type="submit" name="login" id="login" class="btn">登录</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>





        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/retina-1.1.0.min.js"></script>
        <script src="assets/js/scripts.js"></script>

        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
