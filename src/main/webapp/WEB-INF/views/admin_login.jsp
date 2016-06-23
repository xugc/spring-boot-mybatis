<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩云之南内容管理平台</title>
<link rel="stylesheet" type="text/css"
	href="../css/admin_common_style.css" />
<script type="text/javascript" src="../js/jquery-2.0.2.min.js"></script>
<script>
	$(function() {
		var _select = $('.select');
		_select.click(function() {
			$(this).find('ul').show();
		});

		$('.select li')
				.click(
						function() {
							var eid = $(this).attr('eid');
							var eid_input = '<input type="hidden" value="'+eid+'" name="eid" id="eid" />';
							var _eidhtml = $(this).html();
							$('.eid_value').html(_eidhtml);
							if ($('#eid').attr('value')) {
								$('#eid').attr('value', eid);
							}

						});
		$('.select ul').hover(function() {

		}, function() {
			$(this).hide();
		});
	})
</script>
</head>
<body>
	<div class="login">
		<div class="login_form">
			<form action="login" method="post">
				<!-- <input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" /> -->
				<div class="login_info">
					<div class="login_info_title">选择登录版本：</div>
					<div class="select">
						<p class="eid_value">中文版</p>
						<ul>
							<li eid="english">English</li>
							<li eid="chinese">中文版</li>
						</ul>
						<input type="hidden" value="chinese" name="eid" id="eid" />
						<input type="hidden" value="${ valcodeuuid }" name="pageId" />
					</div>
				</div>
				<div class="form_info">
					<div class="field">
						<label>用户名：</label> <input name="userName" type="text"
							class="text" size="20" value="${ info.userName }">
					</div>
					<div class="field">
						<label>密 码：</label> <input name="userPwd" type="password"
							class="text" size="20">
					</div>
					<div class="field">
						<label>验证码：</label> <input name="validateNumber" type="text"
							class="text" size="10" value="${ info.validateNumber }">
					</div>
					<div class="field">
						<cite><img src="/imgCreator/captcha-image?pageId=${ valcodeuuid }"
							id="kaptchaImage" /> <script type="text/javascript">
								$(function() {
									$('#kaptchaImage').click(
													function() {//生成验证码
														$(this).hide().attr('src',
																		'/imgCreator/captcha-image?pageId=${ valcodeuuid }').fadeIn();
													})
								});
							</script> </cite>
					</div>
					<c:if test="${ info.msg!=null }">
						<div class="field">
							<span><font color="red">${ info.msg }</font> </span>
						</div>
					</c:if>
					<div class="field">
						<label></label>
						<button class="button" style="margin-left:50px;_margin-left:48px"
							type="submit"></button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
