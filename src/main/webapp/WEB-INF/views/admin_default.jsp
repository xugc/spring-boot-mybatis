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
				<li><a href="#" class="selected">后台首页</a></li>
				<li><a href="#">网站首页管理</a></li>
				<li><a href="#">菜单设置</a></li>
				<li><a href="#">文章管理</a></li>
				<li><a href="#">采集设置</a></li>
				<li><a href="#">广告管理</a></li>
				<li><a href="#">数据管理</a></li>
				<li><a href="#">用户管理</a></li>
				<li><a href="#">系统设置</a></li>
			</ul>
		</div>
		<div class="top_member">
			欢迎您，${ user.userName } | <a href="#">帐号管理</a> | <a href="#">充值</a> | <a href="#">编辑</a>
			| <a href="#">2条信息</a>
		</div>
	</div>
	<div class="body right_body">
		<!-- <div class="top_subnav">彩云之南内容管理平台 ＞ 首页</div> -->
		<div class="title">
			<div class="title_info zs">
				${ user.userName } 早上好，欢迎使用彩云之南后台管理系统<label>(${ user.email
					})</label> <a href="#">帐号设置</a>
			</div>
		</div>
		<div class="quick">
			<div class="login_info">
				您上次登录的时间是：2011-12-27 18:53 (不是您登录的？<a href="#">请点这里</a>)
			</div>
			<p class="line"></p>
			<div class="quick_block">
				<a href="main"><img src="../images/admin/index_ico.jpg"><span>网站设置</span>
				</a> <a href="#"><img src="../images/admin/add_ico.jpg"><span>发布文章</span>
				</a> <a href="#"><img src="../images/admin/tj_ico.jpg"><span>数据统计</span>
				</a> <a href="#"><img src="../images/admin/enter_ico.jpg"><span>文件上传</span>
				</a> <a href="#"><img src="../images/admin/open_ico.jpg"><span>目录管理</span>
				</a> <a href="#"><img src="../images/admin/serch_ico.jpg"><span>查询</span>
				</a> <a href="#" class="button"> <span>添加新的快捷功能</span> </a>
			</div>
		</div>
		<div style="clear:both"></div>
		<div class="use_meth">
			<div class="title">
				<div class="title_info light">彩云之南 内容管理平台 使用指南</div>
			</div>
			<p>
				<span>您可以快速进行文章发布管理操作</span><a href="articles">发布或管理文章</a>
			</p>
			<p>
				<span>您可以快速发布产品 </span><a href="#">发布或管理产品</a>
			</p>
			<p>
				<span>您可以进行密码修改、帐户设置等操作 </span><a href="#">帐户管理</a>
			</p>
		</div>
		<p class="line"></p>
	</div>
</body>
</html>
