<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	//获取项目名字  getContextPath() 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:if test="${list == null}">

	<c:redirect url="/a/Quanx/getList"></c:redirect>
</c:if>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>权限组管理</title>
<link rel="stylesheet" href="/web_system/common/css/sccl.css">
<link rel="stylesheet" href="/web_system/common/css/layui.css">
<link rel="stylesheet"
	href="/web_system/common/css/healthmanagement.css" />
<!-- 载入easyui样式及图标样式  注意该一下路径-->
<link rel="stylesheet" type="text/css"
	href="/web_system/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="/web_system/easyui/themes/icon.css">
<!-- 载入jquery支持文件（必须写在其他js文件前）、easyui支持文件、easyui中文支持文件 -->
<script type="text/javascript" src="/web_system/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="/web_system/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="/web_system/easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="/web_system/common/layui/layui.js"></script>
<script src="/web_system/common/js/sccl-util.js"></script>
<link rel="stylesheet" href="/web_system/css/alertDiv.css" />
<style>
</style>

</head>
<body>

	<p style="padding-top: 10px;">
		<span class="layui-breadcrumb" style="visibility: visible;"> <a><cite>系统管理</cite><span
				class="layui-box">></span></a> <a href="#">权限组管理</a>
		</span>
	</p>
	<div style="padding-top: 10px;">
		<button id="addbtn" class="layui-btn">
			<i class="icon-font">&#xe654;</i>添加权限组
		</button>
	</div>
	<table class="layui-table">
		<thead>
			<tr>
				<th>权限组名称</th>
				<th>权限组备注</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="listbody">
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.quanxmc}</td>

					<td>${item.quanxbz}</td>
					<td>
						<button class="layui-btn layui-btn-danger layui-btn-small">删除权限组</button>
						<button class="layui-btn layui-btn-small">编辑</button>
						<button class="layui-btn layui-btn-small"
							onclick='showDiv("${item.id}")'>分配系统菜单</button>
					</td>
				</tr>

			</c:forEach>


		</tbody>
	</table>
	<div id="pagbox"></div>

	<!-- 弹出层 start -->


	<div id="light" class="white_content"
		style="height: 100%; width: 80%; left: 5%; top: 2%;">
		<input type="hidden" name="quanxId" id="quanxId">
		<div
			style="background-color: #f2f2f2; height: 30px; padding-top: 10px; padding-left: 16px">给权限组分配菜单</div>
		<a class="float_div" href="javascript:two();">X关闭</a>
		<ul style="float: left; font-size: 20px; padding-left: 40px" id="tt"
			data-options="checkbox:true"></ul>
		<!-- <div style="clear:both;"></div> -->
		<button id="addbtn" class="layui-btn" onclick="two()"
			style="width: 60px; line-height: 15px; height: 28px; clear: both;">提交</button>
	</div>
	<div id="fade" class="black_overlay"></div>
	<!-- 弹出层 end -->
	<script type="text/html" id="code-temp">
    <div class="layui-form-item" style="padding-top: 10px;">
  		<label class="layui-form-label">权限组名称</label>
  		<div class="layui-input-block">
    		<input id="namement" type="text" maxlength="10" name="title" style="width: 350px;" required lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
  		</div>
	</div>
	
	<div class="layui-form-item">
  		<label class="layui-form-label">权限组说明</label>
  		<div class="layui-input-block">
    		<textarea id="txtmore" name="" maxlength="100" style="width: 350px;resize:none" required lay-verify="required" placeholder="请输入" class="layui-textarea"></textarea>
  		</div>
	</div>
</script>
	<script type="text/javascript">
		function showDiv(QuanXID) {
			$("#quanxId").val(QuanXID);
			$('#tt')
					.tree(
							{
								method : "get",
								url : "http://localhost:8080/web_system/a/caidan/getAll?quanxianid="
										+ QuanXID,
								lines : true
							});
			document.getElementById('light').style.display = 'block';
			document.getElementById('fade').style.display = 'block'
		}
		function two() {
			//先获取数据  通过 ajax提交数据 然后在让当前弹出层消失
			//	$("form")[0].submit();
			var nodes = $('#tt').tree('getChecked');

			//获取子节点选中（但是没有全部选中） 的父节点
			var nodes2 = $('#tt').tree('getChecked', 'indeterminate');

			console.log(nodes2)
			console.log(nodes);
			//如何提交数据？ 拼接数据
			//我们把单个菜单的id和名字拼接成 id-名字;id1-名字1;
			var data = "";
			$.each(nodes, function() {
				data = data + this.id + "-" + this.text + ";";
			})
			$.each(nodes2, function() {
				data = data + this.id + "-" + this.text + ";";
			})
			//提交到服务器
			console.log(data);
			console.log($("#quanxId").val());

			$.post("http://localhost:8080/web_system/a/caidan/updatePri", {
				"data" : data,
				"quanxianid" : $("#quanxId").val()
			}, function(data) {
alert(data)
			}, "json");
			document.getElementById('light').style.display = 'none';
			document.getElementById('fade').style.display = 'none';

		}
	</script>
</body>
</html>
