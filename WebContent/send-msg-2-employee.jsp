<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>


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


	<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">



</head>
<body>


	<form id="signupForm" class="form-horizontal" style="padding: 30px 100px 10px;"
		action="StoreCompanyServlet" method="post">

		<fieldset>
			<legend>发送的信息</legend>
		</fieldset>
	
		
		
		<div class="form-group">
			<label for="content" class="col-sm-2 control-label"></label>

				<textarea placeholder="最多500字" id="form-content" class="form-control" rows="18" cols="12"></textarea>

			    <span id="num">0</span>字
    <script type="text/javascript">
        window.onload = function(){
            $("#form-content").on('input propertychange',function(e){
                $("#num").html(e.target.value.length);
            });
        }
    </script>
		</div>		
		
				
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<input type="submit" class="btn btn-default btn-lg pull-right" value="发送" />
			</div>
		</div>
	</form>




</body>
</html>