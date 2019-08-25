<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	//获取项目名字  getContextPath() 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

<head>
<meta charset="utf-8" />
<title>分配权限</title>
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
<link rel="stylesheet"
	href="/web_system/common/css/healthmanagement.css" />
<link rel="stylesheet" href="/web_system/common/css/layui.css">
<link rel="stylesheet" href="/web_system/common/css/sccl.css">
<link rel="stylesheet" href="/web_system/css/alertDiv.css">
</head>
<style>
/*	折叠层*/
body {
	font-family: "微软雅黑";
}
</style>

<body>
	<p style="padding-top: 10px;">
		<span class="layui-breadcrumb" style="visibility: visible;"> <a><cite>系统管理</cite><span
				class="layui-box">></span></a> <a href="#">菜单管理</a>
		</span>
	</p>
	<div style="padding-top: 10px;">
		<button id="addbtn" class="layui-btn" onclick="one()">
			<i class="icon-font">&#xe654;</i>添加一级菜单
		</button>
	</div>
	<!-- 	<select style="float: left; margin-right: 50px;">
		<option>请选择用户权限组</option>
		<option>权限组1</option>
		<option>权限组2</option>
	</select> -->
	<br>
	<ul style="float: left; font-size: 20px" id="tt"
		data-options="checkbox:true"></ul>


	<div id="mm" class="easyui-menu" style="width: 120px;">
		<div onclick="menuHandler(this)" name="add"
			data-options="iconCls:'icon-add'">添加子菜单</div>
		<div onclick="menuHandler(this)" name="delete"
			data-options="iconCls:'icon-remove'">删除该菜单</div>
	</div>
	<div style="clear: both;"></div>
	<!-- 弹出层 start -->


	<div id="light" class="white_content">
		<div
			style="background-color: #f2f2f2; height: 30px; padding-top: 10px; padding-left: 16px">添加菜单</div>
		<a class="float_div" href="javascript:two();">X关闭</a>
		<form style="padding: 16px;">
			请输入 菜单名字 :<input type="text" /><br> <br> 请输入 菜单访问路径 :<input
				type="text" /><br> <br>
			<button id="addbtn" class="layui-btn "
				style="width: 60px; line-height: 15px; height: 28px;">提交</button>
		</form>

	</div>
	<div id="fade" class="black_overlay"></div>
	<!-- 弹出层 end -->
	<!-- 	<button onclick="getCheck()">获取选中</button> -->
</body>
<script>
	//需要查询资料请查询http://www.jeasyui.net/plugins/185.html

	//如果要显示选择框 需要在html空间上使用 data-options="checkbox:true"
	$(function() {
		//使用esyui构造tree数据格式必须是json
		$('#tt').tree({
			method : "get",
			//url: 'http://localhost:8080/admin/Ajax',
			url : "http://localhost:8080/web_system/a/caidan/getAll",
			lines : true,
			//当右键点击节点时触发
			onContextMenu : function(e, node) {
				e.preventDefault();
				//选中当前节点
				$('#tt').tree('select', node.target);
				// 展示鼠标右键菜单
				$('#mm').menu('show', {
					left : e.pageX,
					top : e.pageY
				});
			}
		});
	})
	//鼠标右键处理逻辑
	function menuHandler(item1) {
		//获取tree这个控件
		var tree = $("#tt");
		//获取name属性 用来区分点击的是哪个 是add还是delete
		var name = $(item1).attr("name");
		//获取选中的节点 因为我们新建的节点的pid就是选中的节点 的id
		var node = tree.tree("getSelected");
		if (name === "add") {
			//显示输入框 
			one();
			//先发送ajax请求   添加成功以后在添加到树中
			//	get(url: String, data: Map, success: Function(String,String,XMLHttpRequest), dataType: String): 
			//$.get用于发送ajax请求  三个参数 第一个 请求的url 第二个请求的参数 json数据
			//第三个是一个function function(data,statue,xmlHttp) data的意思是服务器返回的数据 statue 是http状态码
			/*	$.get("http://localhost:8080/admin/ProductTypeServlet?m=add",{"pid":node.id,"name":addname},
					function(data,statue,xmlHttp){
				//请求成功以后，吧新添加的节点添加到这个tree
				//tree.tree('append',json数据)  ---吧json里面的数据添加某个节点
				tree.tree('append', {
					parent: node.target, //parent 被添加节点的父节点
					data: [{  //data的意思是 创建新节点需要的数据
						"id": data,
						"text": addname
					}]
				})
			});*/

		} else if (name === "rename") {
			tree.tree('beginEdit', node.target);
		} else if (name === "delete") {
			var msg = "您确定要删除该数据吗？";
			if (confirm(msg) == true) { //表示选择的是 确定
				//确认删除以后？ 发送ajax到服务器 通过id 删除数据 
				$.get("http://localhost:8080/admin/ProductTypeServlet?m=del", {
					"id" : node.id
				}, function(data, sattus, xmlhttp) {
					tree.tree("remove", node.target)
				});

			}

		}
	}
	//弹出js自带的输入框
	function diag(item) { //prompt第一个参数是提示语
		var str = prompt(item, "");
		return str;
	}

	function one() {
		document.getElementById('light').style.display = 'block';
		document.getElementById('fade').style.display = 'block'
	}

	function two() {
		//先获取数据  通过 ajax提交数据 然后在让当前弹出层消失
		$("form")[0].submit();
		document.getElementById('light').style.display = 'none';
		document.getElementById('fade').style.display = 'none'

	}

	function getCheck() {
		var nodes = $('#tt').tree('getChecked');
		//获取子节点选中（但是没有全部选中） 的父节点
		var nodes2 = $('#tt').tree('getChecked', 'indeterminate');
		console.log(nodes2)
		//							$.each(nodes, function(){     
		//			  alert(this.id);  
		//			})
		console.log(nodes);
	}
</script>

</html>