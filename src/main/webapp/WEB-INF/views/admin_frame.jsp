<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩云之南内容管理平台</title>
<link rel="stylesheet" type="text/css" href="../css/admin_style.css" />
<link rel="stylesheet" type="text/css"
	href="../css/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../css/themes/icon.css" />
<script type="text/javascript" src="../js/jquery-2.0.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script src="../js/admin-iframe.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height:95px;padding: 0px;margin: 0px; overflow: hidden;">
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
					<c:choose>
						<c:when test="${ selTopMenu==0  }">
							<li>
								<a href="javascript:void(0);" class="selected" id="menu_0">后台首页</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								<a href="javascript:void(0);" id="menu_0">后台首页</a>
							</li>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ selTopMenu==1  }">
							<li>
								<a href="javascript:void(0);" class="selected" id="menu_1">网站首页管理</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								<a href="javascript:void(0);" id="menu_1">网站首页管理</a>
							</li>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ selTopMenu==2  }">
							<li>
								<a href="javascript:void(0);" class="selected" id="menu_2">菜单设置</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								<a href="javascript:void(0);" id="menu_2">菜单设置</a>
							</li>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${ selTopMenu==3  }">
							<li>
								<a href="javascript:void(0);" class="selected" id="menu_3">文章管理</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								<a href="javascript:void(0);" id="menu_3">文章管理</a>
							</li>
						</c:otherwise>
					</c:choose>
					<!-- <li><a href="#">采集设置</a>
				</li>
				<li><a href="#">广告管理</a>
				</li>
				<li><a href="#">数据管理</a>
				</li>
				<li><a href="#">用户管理</a>
				</li>
				<li><a href="#">系统设置</a>
				</li> -->
				</ul>
			</div>
			<div class="top_member">
				欢迎您，${ user.userName } |
				<a href="#">帐号管理</a>
				|
				<a href="#">充值</a>
				|
				<a href="#">编辑</a>
				|
				<a href="#">2条信息</a>
			</div>
		</div>
	</div>
	<div data-options="region:'west',split:false,border:false"
		style="width:195px;padding:0px; margin:0px; background-color: #f1f1f1;">
		<c:choose>
			<c:when test="${ selTopMenu==0 }">
				<!-- <div class="side_switch" id="side_switch" style="display: none;"></div>
				<div class="side_switchl" id="side_switchl" style="display: none;"></div> -->
				<div class="left" style="display: none;">
					<!-- <div class="member_info">
						<div class="member_ico">
							<img src="../images/admin/a.png" width="43" height="43">
						</div>
						<a class="system_a" href="">系统设置</a><a href="" class="system_log">注销</a><a
							href="" class="system_logout">退出</a>
					</div> -->
					<div class="left_title" style="margin:0px;border-top: 0px;">常用功能操作</div>
					<ul class="side" id="left_menu_1">
						<li>
							<a href="javascript:void(0);" turl="../homePage/table"
								class="selected">广告管理</a>
						</li>
						<li>
							<a href="javascript:void(0);">热门商品管理</a>
						</li>
					</ul>
					<ul class="side" id="left_menu_2">
						<li>
							<a href="javascript:void(0);" class="selected">导航管理</a>
						</li>
					</ul>
					<ul class="side" id="left_menu_3">
						<li>
							<a href="javascript:void(0);" class="selected">热门文章管理</a>
						</li>
					</ul>
					<ul class="side catsub">
						<!-- <li class="feed"><a href="http://www.uimaker.com">网站订阅查看</a>
						</li> -->
						<li class="side_about">
							<a href="javascript:void(0);">版权声明</a>
						</li>
					</ul>
				</div>
			</c:when>
			<c:otherwise>
				<div class="side_switch" id="side_switch"></div>
				<div class="side_switchl" id="side_switchl"></div>
				<div class="left">
					<!-- <div class="member_info">
						<div class="member_ico">
							<img src="../images/admin/a.png" width="43" height="43">
						</div>
						<a class="system_a" href="">系统设置</a><a href="" class="system_log">注销</a><a
							href="" class="system_logout">退出</a>
					</div> -->
					<div class="left_title">常用功能操作</div>
					<ul class="side" id="left_menu_1">
						<li>
							<a href="javascript:void(0);" turl="../homePage/table"
								class="selected">广告管理</a>
						</li>
						<li>
							<a href="javascript:void(0);">热门商品管理</a>
						</li>
					</ul>
					<ul class="side" id="left_menu_2">
						<li>
							<a href="javascript:void(0);" class="selected">导航管理</a>
						</li>
					</ul>
					<ul class="side" id="left_menu_3">
						<li>
							<a href="javascript:void(0);" class="selected">热门文章管理</a>
						</li>
					</ul>
					<ul class="side catsub">
						<!-- <li class="feed"><a href="http://www.uimaker.com">网站订阅查看</a>
						</li> -->
						<li class="side_about">
							<a href="javascript:void(0);">版权声明</a>
						</li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	<div data-options="region:'center',border:false" class="easyui-tabs"
		style="padding: 0px;margin: 0px;" id="centerPanel">
		<iframe style="width: 100%;height: 100%;" id="main" name="main"
			src="default" frameBorder=0 scrolling="auto"></iframe>
	</div>
</body>
</html>
