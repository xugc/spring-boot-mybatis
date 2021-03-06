﻿<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>网站后台管理系统</title>
<!-- Bootstrap Styles-->
<link href="../../static/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="../../static/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="../../static/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="../../static/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>

<body>
	<div id="wrapper">
		<nav class="navbar navbar-default top-navbar" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">
					<i>
						<img src="../images/fh.png" />
					</i>
					<strong>网站后台管理系统 </strong>
				</a>
			</div>
		</nav>
		<!--/. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div id="sideNav" href="">
				<i class="fa fa-caret-right"></i>
			</div>
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">

					<li>
						<a href="index.html">
							<i class="fa fa-dashboard"></i>
							首页
						</a>
					</li>
					<li>
						<a href="#" class="active-menu">
							<i class="fa fa-sitemap"></i>
							网站管理
							<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level">
							<li>
								<a href="../statistics/productHotMap">文章管理</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="#">
							<i class="fa fa-sitemap"></i>
							流量统计
							<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level">
							<li>
								<a href="#">日均访问量</a>
							</li>
							<li>
								<a href="#">月均访问量</a>
							</li>
						</ul>
					</li>
				</ul>

			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<ol class="breadcrumb">
							<li>
								<a href="#">网站管理</a>
							</li>
							<li class="active">文章管理</li>
						</ol>
					</div>
				</div>


				<!-- /. ROW  -->

				<div class="row">
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-green green">
							<div class="panel-left pull-left green">
								<i class="fa fa-bar-chart-o fa-5x"></i>

							</div>
							<div class="panel-right pull-right">
								<h3>20</h3>
								<strong>热门文章</strong>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-blue blue">
							<div class="panel-left pull-left blue">
								<i class="fa fa-shopping-cart fa-5x"></i>
							</div>

							<div class="panel-right pull-right">
								<h3>100</h3>
								<strong>所有文章</strong>

							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-red red">
							<div class="panel-left pull-left red">
								<i class="fa fa fa-comments fa-5x"></i>

							</div>
							<div class="panel-right pull-right">
								<h3>1200</h3>
								<strong>访问量</strong>

							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-brown brown">
							<div class="panel-left pull-left brown">
								<i class="fa fa-users fa-5x"></i>

							</div>
							<div class="panel-right pull-right">
								<h3>500</h3>
								<strong>日均访问量</strong>

							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6 col-sm-12 col-xs-12">
						<div class="panel panel-default">
							<div class="panel-heading">文章TOP10</div>
							<div class="panel-body">
								<div class="list-group">

									<a href="#" class="list-group-item">
										<span class="badge">1 分钟前</span>
										<i class="fa fa-fw fa-comment"></i>
										人生本寂寞
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">10 分钟前</span>
										<i class="fa fa-fw fa-truck"></i>
										风风火火闯九州
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">12 分钟前</span>
										<i class="fa fa-fw fa-globe"></i>
										大河向东流啊
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1 小时前</span>
										<i class="fa fa-fw fa-user"></i>
										天上星亮晶晶
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1.23 小时前</span>
										<i class="fa fa-fw fa-user"></i>
										风光无限好
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">昨天</span>
										<i class="fa fa-fw fa-globe"></i>
										黄昏之歌
									</a>
								</div>
								<div class="text-right">
									<a href="#">
										更多
										<i class="fa fa-arrow-circle-right"></i>
									</a>
								</div>
							</div>
						</div>

					</div>
					<div class="col-md-6 col-sm-12 col-xs-12">
						<div class="panel panel-default">
							<div class="panel-heading">文章TOP10</div>
							<div class="panel-body">
								<div class="list-group">

									<a href="#" class="list-group-item">
										<span class="badge">1 分钟前</span>
										<i class="fa fa-fw fa-comment"></i>
										人生本寂寞
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">10 分钟前</span>
										<i class="fa fa-fw fa-truck"></i>
										风风火火闯九州
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">12 分钟前</span>
										<i class="fa fa-fw fa-globe"></i>
										大河向东流啊
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1 小时前</span>
										<i class="fa fa-fw fa-user"></i>
										天上星亮晶晶
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1.23 小时前</span>
										<i class="fa fa-fw fa-user"></i>
										风光无限好
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">昨天</span>
										<i class="fa fa-fw fa-globe"></i>
										黄昏之歌
									</a>
								</div>
								<div class="text-right">
									<a href="#">
										更多
										<i class="fa fa-arrow-circle-right"></i>
									</a>
								</div>
							</div>
						</div>

					</div>
				</div>
				<!-- /. ROW  -->
				<footer>
				</footer>
			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<!-- JS Scripts-->
	<!-- jQuery Js -->
	<script src="../../static/js/jquery-1.10.2.js"></script>
	<!-- Bootstrap Js -->
	<script src="../../static/js/bootstrap.min.js"></script>

	<!-- Metis Menu Js -->
	<script src="../../static/js/jquery.metisMenu.js"></script>
	<!-- Morris Chart Js -->
	<script src="../../static/js/morris/raphael-2.1.0.min.js"></script>
	<script src="../../static/js/morris/morris.js"></script>


	<script src="../../static/js/easypiechart.js"></script>
	<script src="../../static/js/easypiechart-data.js"></script>


	<!-- Custom Js -->
	<script src="../../static/js/custom-scripts.js"></script>


</body>

</html>