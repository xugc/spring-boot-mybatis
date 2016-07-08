<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>彩云之南内容管理平台</title>
<link rel="stylesheet" type="text/css" href="../css/admin_style.css" />
<script type="text/javascript" src="../js/jquery-2.0.2.min.js"></script>
</head>
<body>
	<div class="body">
		<!-- <div class="title_h2">搜索</div>
		<p class="line" style="margin-top:5;"></p> -->
		<form action="#">
			<input type="hidden" value="${ _csrf_param_value }" name="_csrf_param_value" />
			<input type="hidden" value="${ _csrf_param_name }" name="_csrf_param_name" />
			<div class="condition_header">
				<div class="filed_cond fl">
					<label>广告名称：</label>
					<input type="text" class="text" size="20">
				</div>
				<div class="filed_cond fl">
					<label>组名称：</label>
					<input type="text" class="text" size="20">
				</div>
				<div class="filed_cond fl">
					<label>组编号：</label>
					<input type="text" class="text" size="20">
				</div>
				<div class="clear"></div>
				<div class="filed_cond fl">
					<label>广告位置：</label>
					<select name="category" id="imagePosition">
						<option value="0">全部</option>
						<option value="1">向上淡出</option>
						<option value="2">向下淡出</option>
						<option value="2">向左淡出</option>
						<option value="2">向右淡出</option>
					</select>
				</div>
				<div class="filed_cond fl">
					<label>广告状态：</label>
					<select name="category" id="imageStatus">
						<option value="0">全部</option>
						<option value="1">已启用</option>
						<option value="2">未启用</option>
					</select>
				</div>
				<div class="filed_cond fl">
					<button class="button"></button>
				</div>
			</div>
		</form>

		<div class="tablelist">
			<table class="table">
				<tr>
					<th colspan="8" class="top_th">
						<a href="javascript:void(0);" turl="../homePage/toAdvertisementAdd" class="add">
							<em>添加广告</em>
							<span></span>
						</a>
						<a href="javascript:void(0);" class="delete">
							<em>选择删除</em>
							<span></span>
						</a>
						<a href="javascript:void(0);" class="delete">
							<em>全部删除</em>
							<span></span>
						</a>
						<!-- <a href="#" class="tongji">
							<em>统计</em>
							<span></span>
						</a> 
						<a href="javascript:void(0);" class="sort">
							<em>排序</em>
							<span></span>
						</a> -->
					</th>
				</tr>
				<tr>
					<th>
						<input type="checkbox" id="selAll"/>
					</th>
					<th>编号</th>
					<th>图片名称</th>
					<th>组编号</th>
					<th>组名称</th>
					<th>淡出位置</th>
					<th>状态</th>
					<th>操作</th>
				</tr>

				<tr>
					<td>
						<input type="checkbox" value="1" />
					</td>
					<td>0101</td>
					<td>风景</td>
					<td>01</td>
					<td>最新</td>
					<td>向上淡出</td>
					<td>已启用</td>
					<td>编辑</td>
				</tr>
			</table>
		</div>
		<div class="page">
			<ul>
				<li>
					<a href="#" class="pg_index">首页</a>
				</li>
				<li>
					<a href="#" class="pg_selected">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">...</a>
				</li>
				<li>
					<a href="#" class="pg_next">下一页</a>
				</li>
				<li>
					<a href="#" class="pg_last">尾页</a>
				</li>
			</ul>
			<p>共有 265 条数据，当前第 1 页</p>

		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$("a[class='add'],a[class='edit']").each(function() {
			$(this).click(function() {
				parent.addTab(this);
			});
		});
	});
</script>
</html>
