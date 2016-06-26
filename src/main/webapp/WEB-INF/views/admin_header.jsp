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
<body style="overflow: hidden; height:100%;width: 100%; color: black;">
	<div class="top">dsfdsfd</div>
	<div class="left">dsfdsfd</div>
	<div class="right" style="margin-left: 0px;">
		<IFRAME style="OVERFLOW: visible;" id="main" name="main" src="table"
			frameBorder=0 width="100%" scrolling="yes" height="100%"></IFRAME>
		<script type="text/javascript">
			$("#main").load(
					function() {
						var mainheight = $(this).contents().find("body")
								.height() - 270;
						$(this).height(mainheight);

					});
			window.onresize = function() {
				var iframe = document.getElementById("main");
				iframe.style.width = window.innerWidth + 'px';
				iframe.style.height = window.innerHeight -100 + 'px';
			};
		</script>
	</div>
</body>
</html>
