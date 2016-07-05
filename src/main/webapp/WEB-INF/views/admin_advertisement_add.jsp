<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩云之南内容管理平台</title>
<link rel="stylesheet" type="text/css" href="../css/admin_style.css" />
<link rel="stylesheet" type="text/css" href="../css/themes/gray/easyui.css" />
<link rel="stylesheet" type="text/css" href="../css/themes/icon.css" />
<script type="text/javascript" src="../js/jquery-2.0.2.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<div class="body">
		<form action="#">
			<!-- <div class="field fl">
				<label>关键词：</label>
				<input type="text" class="text" size="20">
			</div>
			<div class="field fl">
				<label>栏目：</label>
				<input type="text" class="text" size="20">
					<select name="category" id="category" style="display:none">
						<option value="1">分类栏目</option>
						<option value="2">所有分类</option>
					</select>
			</div> -->
			<form id="advForm" method="post" action="#">
				<div class="field">
					<label>组名:</label>
					<input class="easyui-validatebox" required="true" type="text" name="groupName"style="width:10%"></input>
				</div>
				<div class="field">
					<label>组编号:</label>
					<input class="easyui-validatebox" required="true" type="text" name="groupNameNum"style="width:10%"></input>
				</div>
				<div class="field">
					<label>向上淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInUpImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*" style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向下淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInDownImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*" style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向左淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInLeftImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*" style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向右淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInRightImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*" style="width:50%" buttonText="浏览"></input>
				</div>
				<p class="line" style="margin-top:10;"></p>
				<div class="submit_bt">
					<input type="submit" class="button" value="保存">
				</div>
			</form>
			<!-- <div class="field fl">
				<button class="button"></button>
			</div> -->
		</form>
	</div>
</body>
</html>
