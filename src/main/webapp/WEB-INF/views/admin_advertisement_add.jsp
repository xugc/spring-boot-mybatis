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
<script type="text/javascript">
	var newImageZIndex = 1; // To make sure newly-loaded images land on top of images on the table
	var loaded = false; // Used to prevent initPhotos() running twice
	// When the document is ready, fire up the table!
	$(initPhotos);
	function initPhotos() {
		// (Ensure this function doesn't run twice)
		if (loaded)
			return;
		loaded = true;
		// Process each photo in turn...
		$('#lighttable img').each(function(index) {
			// Make the photo draggable
			$(this).draggable({
				containment : 'parent',
				stack : '#lighttable img',
				cursor : 'pointer'
			});
			// When the photo image has loaded...
			$(this).load(function() {
				// (Ensure this function doesn't run twice)
				if ($(this).data('loaded'))
					return;
				$(this).data('loaded', true);
				// Make sure its z-index is higher than the photos already on the table
				$(this).css('z-index', newImageZIndex++);

			});
			// Hack for browsers that don't fire load events for cached images
			if (this.complete)
				$(this).trigger("load");

		});
	}
	
</script>
</head>
<body>
	<div class="body">
		<form action="#">
			<form id="advForm" method="post" action="#">
				<div class="field">
					<label>组名:</label>
					<input class="easyui-validatebox" required="true" type="text" name="groupName" style="width:10%"></input>
				</div>
				<div class="field">
					<label>组编号:</label>
					<input class="easyui-validatebox" required="true" type="text" name="groupNameNum" style="width:10%"></input>
				</div>
				<div class="field">
					<label>向上淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInUpImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*"
						style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向下淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInDownImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*"
						style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向左淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInLeftImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*"
						style="width:50%" buttonText="浏览"></input>
				</div>
				<div class="field">
					<label>向右淡出广告:</label>
					<input class="easyui-filebox" multiple="true" type="text" name="fadeInRightImage" data-options="prompt:'选择上传文件，可多选'" accept="image/*"
						style="width:50%" buttonText="浏览"></input>
				</div>
				<div id="lighttable">
					<img src="../images/photo02.jpg" style="left:24px;top:34px;" />
					<img src="../images/photo15.jpg" style="left:200px;top:100px;" />
					<img src="../images/photo20.jpg" style="left:300px;top:200px;" />
					<img src="../images/photo16.jpg" style="left:45px;top:160px;" />
					<img src="../images/photo14.jpg" style="left:100px;top:90px;" />
				</div>
				<p class="line" style="margin-top:10;"></p>
				<div class="submit_bt">
					<input type="submit" class="button" value="保存">
				</div>
			</form>
		</form>
	</div>
</body>
</html>
