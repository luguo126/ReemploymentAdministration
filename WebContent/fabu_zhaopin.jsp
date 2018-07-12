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
		action="StoreZhaopin" method="post">

		<fieldset>
			<legend>发布招聘信息</legend>
		</fieldset>

		<div class="form-group">

			<label for="title" class="col-sm-2 control-label">职称：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control " id="title"
					 name="title" placeholder="请输入职称" autofocus="autofocus"/>
			</div>
		</div>

		<div class="form-group">

			<label for="category" class="col-sm-2 control-label">工作类别：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="category" name="category"
					 placeholder="请输入工作类别" maxlength="16"/>
			</div>
			<div style="display: inline">
				<label class="help-block"></label>
			</div>
		</div>

		<div class="form-group">
			<label for="salary" class="col-sm-2 control-label">薪水：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="salary" name="salary"
					placeholder="薪水(可以填薪水或者面议)" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="welware" class="col-sm-2 control-label">福利：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="welware" name="welfare"
					placeholder="福利(可以不填)" />
			</div>
		</div>		
		
		<div class="form-group">
			<label for="company" class="col-sm-2 control-label">发布公司：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="company" name="company"
					placeholder="发布公司" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="address" class="col-sm-2 control-label">公司地址：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="address" name="address"
					placeholder="公司地址" />
			</div>
		</div>				

		
		<div class="form-group">
			<label for="release_date" class="col-sm-2 control-label">发布日期：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="release_date" name="release_date"
					placeholder="发布日期" />
			</div>
		</div>		
		
		
		<div class="form-group">
			<label for="content" class="col-sm-2 control-label">招聘内容：</label>
			<div class="col-sm-3">
				<textarea placeholder="最多500字" name="content" id="content" class="form-control" rows="12"></textarea>
			</div>
			    <span id="num">0</span>字
    <script type="text/javascript">
        window.onload = function(){
            $("#content").on('input propertychange',function(e){
                $("#num").html(e.target.value.length);
            });
        }
    </script>
		</div>		
		
				
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<input type="submit" class="btn btn-default btn-lg pull-right" value="发布" />
			</div>
		</div>
	</form>




</body>
</html>