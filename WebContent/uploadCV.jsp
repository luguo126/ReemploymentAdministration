<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>填写简历</title>
	<link rel="stylesheet"
		href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	<script src="https://cdn.bootcss.com/jquery/1.9.1/jquery.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js">
	</script>
	<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
</head>



<body>
	<form id="signupForm" class="form-horizontal" style="padding: 30px 100px 10px;"
		action="StoreCVServlet" method="post">

		<fieldset>
			<legend>填写简历</legend>
		</fieldset>

		<div class="form-group">

			<label for="name" class="col-sm-2 control-label">姓名：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control " id="name"
					 name="name" placeholder="请输姓名" autofocus="autofocus"/>
			</div>
		</div>

		<div class="form-group">
			<label for="sex" class="col-sm-2 control-label">性别：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="sex" name="sex"
					 placeholder="请输入性别" />
			</div>
		</div>

		<div class="form-group">
			<label for="age" class="col-sm-2 control-label">年龄：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="age" name="age"
					placeholder="年龄" />
			</div>
		</div>

		<div class="form-group">
			<label for="tel" class="col-sm-2 control-label">联系电话：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="tel" name="tel"
					placeholder="联系电话" />
			</div>
		</div>
		
		<div class="form-group">
			<label for="email" class="col-sm-2 control-label">邮箱：</label>
			<div class="col-sm-3">
				<input type="email" class="form-control" id="email" name="email"
					placeholder="邮箱" />
			</div>
		</div>			
		
		<div class="form-group">
			<label for="job-intent" class="col-sm-2 control-label">求职意向：</label>
			<div class="col-sm-3">
				<textarea placeholder="最多100字" name="job-intent" id="job-intent" class="form-control" rows="6"></textarea>
			</div>
			    <span id="num">0</span>字
    		<script type="text/javascript">
        		window.onload = function(){
            		$("#job-intent").on('input propertychange',function(e){
                		$("#num").html(e.target.value.length);
            		});
        		}
    		</script>
		</div>
		
		<div class="form-group">
			<label for="self-description" class="col-sm-2 control-label">自我描述：</label>
			<div class="col-sm-3">
				<textarea placeholder="最多100字" name="self-description" id="self-description" class="form-control" rows="6"></textarea>
			</div>
			    <span id="num">0</span>字
    		<script type="text/javascript">
        		window.onload = function(){
            		$("#self-description").on('input propertychange',function(e){
                		$("#num").html(e.target.value.length);
            		});
        		}
    		</script>
		</div>			

		<div class="form-group">
			<label for="work-experience" class="col-sm-2 control-label">工作经历：</label>
			<div class="col-sm-3">
				<textarea placeholder="最多500字" name="work-experience" id="work-experience" class="form-control" rows="6"></textarea>
			</div>
			    <span id="num">0</span>字
    		<script type="text/javascript">
        		window.onload = function(){
            		$("#work-experience").on('input propertychange',function(e){
                		$("#num").html(e.target.value.length);
            		});
        		}
    		</script>
		</div>	
				
		<div class="form-group">
			<label for="education" class="col-sm-2 control-label">教育经历：</label>
			<div class="col-sm-3">
				<textarea placeholder="最多100字" name="education" id="education" class="form-control" rows="6"></textarea>
			</div>
			    <span id="num">0</span>字
    		<script type="text/javascript">
        		window.onload = function(){
            		$("#education").on('input propertychange',function(e){
                		$("#num").html(e.target.value.length);
            		});
        		}
    		</script>
		</div>					

		<div class="form-group" >
			<div class="col-sm-offset-2 col-sm-3">
				<input type="submit" class="btn btn-default btn-lg pull-right" value="保存" />
			</div>
		</div>	

	</form>


</body>
</html>