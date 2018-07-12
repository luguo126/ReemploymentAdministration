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



<script src="https://cdn.bootcss.com/jquery-validate/1.17.0/jquery.validate.min.js"></script>
<script src="https://cdn.bootcss.com/jquery-validate/1.17.0/localization/messages_ar.js"></script>

<script>
    $().ready(function() {
    // 在键盘按下并释放及提交后验证提交表单
      var validator = $("#signupForm").validate({
    	    rules: {
              user_id: "required",
    	      password: {
    	        required: true,
    	        minlength: 6
    	      },
    	      confirm_password: {
    	        required: true,
    	        minlength: 6,
    	        equalTo: "#password"
    	      },
    	      email: {
    	        required: true,
    	        email: true
    	      },
    	      agree: "required"
    	    },
    	    messages: {
    	      user_id: "请输入用户id",
    	      password: {
    	        required: "请输入密码",
    	        minlength: "密码长度不能小于 6 个字母"
    	      },
    	      confirm_password: {
    	        required: "请输入密码",
    	        minlength: "密码长度不能小于 6 个字母",
    	        equalTo: "两次密码输入不一致"
    	      },
    	      email: "请输入一个正确的邮箱",
    	      agree: "<--请接受我们的声明",
    	    }
    	});
});

    </script>
    
    <style>
        .error{
        	color:red;
        }
    </style>


<script type="text/javascript">  
    $(function(){  
    	
        $(":input[name='id']").change(function(){  
        	$("#usermessage").show();
        	
            var val=$(this).val();  
            val=$.trim(val);  
            if(val!=""){  
                var url="${pageContext.request.contextPath}/FindEmployeeIdServlet";  
                var t={"id":val,"time":new Date()};  
                $.post(url,t,function(data){  
                    $("#usermessage").html(data);
                });  
            }  
        });  
    })  
 </script> 






</head>
<body>


	<form id="signupForm" class="form-horizontal" style="padding: 30px 100px 10px;"
		action="StoreEmployeeServlet" method="post">

		<fieldset>
			<legend>再就业人员注册账号</legend>
		</fieldset>

		<div class="form-group">

			<label for="account" class="col-sm-2 control-label">用户id：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control " id="user_id"
					 name="id" placeholder="请输入用户id" autofocus="autofocus"/>
				<div hidden="true" id="usermessage" style="width:200px;height:20px;margin-top:10px;margin-left:40px;">  
				</div>
			</div>
		</div>

		<div class="form-group">

			<label for="password" class="col-sm-2 control-label">密码：</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="password" name="password"
					 placeholder="请输入密码" maxlength="16"/>
			</div>
			<div style="display: inline">
				<label class="help-block"> 6-16 位字母、数字、符号、区分大小写</label>
			</div>
		</div>

		<div class="form-group">
			<label for="confirm_password" class="col-sm-2 control-label">再输一次：</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="confirm-password" name="confirm_password"/>
			</div>
		</div>

<!-- 		<div class="form-group">
			<label for="email" class="col-sm-2 control-label">邮箱：</label>
			<div class="col-sm-3">
				<input type="email" class="form-control" id="email" name="email"
					placeholder="例如:123abc@hgd.lab" />
			</div>
		</div> -->


		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">姓名：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="姓名" />
			</div>
		</div>

		<div class="form-group">
			<label for="gender" class="col-sm-2 control-label">性别：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="gender" name="gender"
					placeholder="性别" />
			</div>
		</div>

		<div class="form-group">
			<label for="birthday" class="col-sm-2 control-label">出生日期：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="birthday" name="birthday"
					placeholder="出生日期" />
			</div>
		</div>

		<div class="form-group">
			<label for="workage" class="col-sm-2 control-label">工作年限：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="workage" name="workage"
					placeholder="工作年限" />
			</div>
		</div>


		<div class="form-group">
			<label for="major" class="col-sm-2 control-label">专业：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="major" name="major"
					placeholder="专业" />
			</div>
		</div>		

		<div class="form-group">
			<label for="education" class="col-sm-2 control-label">教育程度：</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="education" name="education"
					placeholder="教育程度" />
			</div>
		</div>
		

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">

				<div class="checkbox">
					<label><input id="agree" name="agree" type="checkbox"/>&nbsp;&nbsp;我已阅读并接受</label> <a href="#"
						style="text-decoration: underline;" target="_blank">注册条款</a>
				</div>
			</div>
		</div>


		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<input type="submit" class="btn btn-default btn-lg pull-right" value="注册" />
			</div>
		</div>
	</form>


</body>
</html>