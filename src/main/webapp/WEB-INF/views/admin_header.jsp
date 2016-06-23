<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩云之南内容管理平台</title>
<link rel="stylesheet" type="text/css" href="../css/admin_style.css" />
<script type="text/javascript" src="../js/jquery-2.0.2.min.js"></script>
<script src="../js/admin-iframe.js"></script>
</head>
<body>
	<div class="top">
		<div class="top_about">
			<a href="#" class="help1" id="btn2" onclick="openMsgWindow()">使用帮助</a>
			<a href="#" class="help2">关于</a>
		</div>
		<div class="admin_logo">
			<img src="../images/admin/admin_logo.jpg">
		</div>
		<div class="top_nav">
			<ul>
				<li><a href="#" class="selected">后台首页</a>
				</li>
				<li><a href="#">网站首页管理</a>
				</li>
				<li><a href="#">菜单设置</a>
				</li>
				<li><a href="#">文章管理</a>
				</li>
				<li><a href="#">采集设置</a>
				</li>
				<li><a href="#">广告管理</a>
				</li>
				<li><a href="#">数据管理</a>
				</li>
				<li><a href="#">用户管理</a>
				</li>
				<li><a href="#">系统设置</a>
				</li>
			</ul>
		</div>
		<div class="top_member">
			欢迎您，${ user.userName } | <a href="#">帐号管理</a> | <a href="#">充值</a> |
			<a href="#">编辑</a> | <a href="#">2条信息</a>
		</div>
	</div>
</body>
</html>
