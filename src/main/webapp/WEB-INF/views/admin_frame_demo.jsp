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
					<i><img src="../images/fh.png"/></i>
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
						<a class="active-menu" href="index.html">
							<i class="fa fa-dashboard"></i>
							首页
						</a>
					</li>
					<li>
						<a href="#">
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
								<h3>8,457</h3>
								<strong> Daily Visits</strong>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-blue blue">
							<div class="panel-left pull-left blue">
								<i class="fa fa-shopping-cart fa-5x"></i>
							</div>

							<div class="panel-right pull-right">
								<h3>52,160</h3>
								<strong> Sales</strong>

							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-red red">
							<div class="panel-left pull-left red">
								<i class="fa fa fa-comments fa-5x"></i>

							</div>
							<div class="panel-right pull-right">
								<h3>15,823</h3>
								<strong> Comments </strong>

							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-primary text-center no-boder bg-color-brown brown">
							<div class="panel-left pull-left brown">
								<i class="fa fa-users fa-5x"></i>

							</div>
							<div class="panel-right pull-right">
								<h3>36,752</h3>
								<strong>No. of Visits</strong>

							</div>
						</div>
					</div>
				</div>


				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">Line Chart</div>
							<div class="panel-body">
								<div id="morris-line-chart"></div>
							</div>
						</div>
					</div>
				</div>


				<div class="row">
					<div class="col-xs-6 col-md-3">
						<div class="panel panel-default">
							<div class="panel-body easypiechart-panel">
								<h4>Customers</h4>
								<div class="easypiechart" id="easypiechart-blue" data-percent="82">
									<span class="percent">82%</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-6 col-md-3">
						<div class="panel panel-default">
							<div class="panel-body easypiechart-panel">
								<h4>Sales</h4>
								<div class="easypiechart" id="easypiechart-orange" data-percent="55">
									<span class="percent">55%</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-6 col-md-3">
						<div class="panel panel-default">
							<div class="panel-body easypiechart-panel">
								<h4>Profits</h4>
								<div class="easypiechart" id="easypiechart-teal" data-percent="84">
									<span class="percent">84%</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-6 col-md-3">
						<div class="panel panel-default">
							<div class="panel-body easypiechart-panel">
								<h4>No. of Visits</h4>
								<div class="easypiechart" id="easypiechart-red" data-percent="46">
									<span class="percent">46%</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/.row-->


				<div class="row">
					<div class="col-md-9 col-sm-12 col-xs-12">
						<div class="panel panel-default">
							<div class="panel-heading">Bar Chart Example</div>
							<div class="panel-body">
								<div id="morris-bar-chart"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-12 col-xs-12">
						<div class="panel panel-default">
							<div class="panel-heading">Donut Chart Example</div>
							<div class="panel-body">
								<div id="morris-donut-chart"></div>
							</div>
						</div>
					</div>

				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">Area Chart</div>
							<div class="panel-body">
								<div id="morris-area-chart"></div>
							</div>
						</div>
					</div>
				</div>
				<!-- /. ROW  -->





				<div class="row">
					<div class="col-md-4 col-sm-12 col-xs-12">
						<div class="panel panel-default">
							<div class="panel-heading">Tasks Panel</div>
							<div class="panel-body">
								<div class="list-group">

									<a href="#" class="list-group-item">
										<span class="badge">7 minutes ago</span>
										<i class="fa fa-fw fa-comment"></i>
										Commented on a post
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">16 minutes ago</span>
										<i class="fa fa-fw fa-truck"></i>
										Order 392 shipped
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">36 minutes ago</span>
										<i class="fa fa-fw fa-globe"></i>
										Invoice 653 has paid
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1 hour ago</span>
										<i class="fa fa-fw fa-user"></i>
										A new user has been added
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">1.23 hour ago</span>
										<i class="fa fa-fw fa-user"></i>
										A new user has added
									</a>
									<a href="#" class="list-group-item">
										<span class="badge">yesterday</span>
										<i class="fa fa-fw fa-globe"></i>
										Saved the world
									</a>
								</div>
								<div class="text-right">
									<a href="#">
										More Tasks
										<i class="fa fa-arrow-circle-right"></i>
									</a>
								</div>
							</div>
						</div>

					</div>
					<div class="col-md-8 col-sm-12 col-xs-12">

						<div class="panel panel-default">
							<div class="panel-heading">Responsive Table Example</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover">
										<thead>
											<tr>
												<th>S No.</th>
												<th>First Name</th>
												<th>Last Name</th>
												<th>User Name</th>
												<th>Email ID.</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>John</td>
												<td>Doe</td>
												<td>John15482</td>
												<td>name@site.com</td>
											</tr>
											<tr>
												<td>2</td>
												<td>Kimsila</td>
												<td>Marriye</td>
												<td>Kim1425</td>
												<td>name@site.com</td>
											</tr>
											<tr>
												<td>3</td>
												<td>Rossye</td>
												<td>Nermal</td>
												<td>Rossy1245</td>
												<td>name@site.com</td>
											</tr>
											<tr>
												<td>4</td>
												<td>Richard</td>
												<td>Orieal</td>
												<td>Rich5685</td>
												<td>name@site.com</td>
											</tr>
											<tr>
												<td>5</td>
												<td>Jacob</td>
												<td>Hielsar</td>
												<td>Jac4587</td>
												<td>name@site.com</td>
											</tr>
											<tr>
												<td>6</td>
												<td>Wrapel</td>
												<td>Dere</td>
												<td>Wrap4585</td>
												<td>name@site.com</td>
											</tr>

										</tbody>
									</table>
								</div>
							</div>
						</div>

					</div>
				</div>
				<!-- /. ROW  -->
				<footer>
					<p>
						Copyright &copy; 2016.Company name All rights reserved.
					</p>
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