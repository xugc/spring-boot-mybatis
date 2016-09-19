<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0" />
<title>后台登录</title>

<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.css" />
<link href="../static/css/custom-styles.css" rel="stylesheet" />
<style type="text/css">
html,body {
	height: 100%;
}
</style>

</head>

<body>
	<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1>
					<small>登录</small>
				</h1>
			</div>
			<div class="login-content ">
				<div class="form">
					<form action="submit" method="post">
						<input type="hidden" value="${ valcodeuuid }" name="pageId" />
						<input type="hidden" value="${ _csrf_param_value }" name="_csrf_param_value" />
						<input type="hidden" value="${ _csrf_param_name }" name="_csrf_param_name" />
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon">
										<span class="glyphicon glyphicon-user"></span>
									</span>
									<input type="text" value="${ info.userName }" name="userName" class="form-control" placeholder="用户名" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12  ">
								<div class="input-group">
									<span class="input-group-addon">
										<span class="glyphicon glyphicon-lock"></span>
									</span>
									<input type="password" name="userPwd" class="form-control" placeholder="密码" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-6">
								<div class="input-group">
									<input name="validateNumber" type="text" class="form-control" value="${ info.validateNumber }" placeholder="验证码" />
								</div>
							</div>
							<div class="col-xs-6">
								<div class="input-group">
									<img src="/imgCreator/captcha-image?pageId=${ valcodeuuid }" id="kaptchaImage" />
									<script type="text/javascript">
										$(function() {
											$('#kaptchaImage').click(function() {//生成验证码
												$(this).hide().attr('src', '/imgCreator/captcha-image?pageId=${ valcodeuuid }').fadeIn();
											})
										});
									</script>
								</div>
							</div>
							<div class="col-xs-12">
								<c:if test="${ info.msg!=null }">
									<span>
										<font color="red">${ info.msg }</font>
									</span>
								</c:if>
							</div>
						</div>
						<div class="form-group form-actions">
							<div class="col-xs-4 col-xs-offset-4 ">
								<button type="submit" class="btn btn-sm btn-top">
									<span class="glyphicon glyphicon-off"></span>
									登录
								</button>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-6 link">
								<p class="text-center remove-margin">
									<small>忘记密码？</small>
									<a href="javascript:void(0)">
										<small>找回</small>
									</a>
								</p>
							</div>
							<div class="col-xs-6 link">
								<p class="text-center remove-margin">
									<small>还没注册?</small>
									<a href="javascript:void(0)">
										<small>注册</small>
									</a>
								</p>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div style="text-align:center;">
		<p></p>
	</div>

</body>

</html>