<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reset password</title>


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


	<form id="signupForm" class="form-horizontal" style="padding: 30px 100px 10px;"
		action="ResetPasswordServlet" method="post">

		<fieldset>
			<legend>重置密码</legend>
		</fieldset>


		<div class="form-group">

			<label for="password" class="col-sm-2 control-label">密码：</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="password" name="password"
					 placeholder="请输入密码" maxlength="16"/>
			</div>
<!-- 			<div style="display: inline">
				<label class="help-block"> 6-16 位字母、数字、符号、区分大小写</label>
			</div> -->
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<input type="submit" class="btn btn-default btn-lg pull-right" value="重置密码" />
			</div>
		</div>
	</form>


</body>
</html>