<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	//获取项目名字  getContextPath() 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%-- 判断list对象是否为空，重定向到servlet --%>
<%-- <c:if test="${list == null}">
	<c:redirect url="DeptServletUrl"></c:redirect>
</c:if> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>部门管理综合应用demo</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/main.css">
<script type="text/javascript" src="<%=path%>/js/1.8.3_jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="/xee1810_7_curd/css/bootstrap.css" />
<script type="text/javascript" src="/xee1810_7_curd/js/jqPaginator.js"></script>

<style type="text/css">
* {
	font-size: 14px;
	font-family: "黑体";
}

.main {
	width: 800px;
	margin: 0 auto;
}

.selectDiv {
	padding-left: 10px;
	margin-top: 10px;
	margin-bottom: 10px;
	border: #33ccff solid 1px;
	border-radius: 4px;
	text-align: left;
	height: 40px;
	line-height: 40px;
}

.tableList {
	width: 800px;
	border-collapse: collapse;
	border: #ccc solid 1px;
}

.tableList td, th {
	border: #ccc solid 1px;
	border-collapse: collapse;
	text-align: center;
	height: 25px;
}

.trHover:hover {
	background-color: #ccffff;
}
</style>

</head>

<body>
	<div class="main">
		<div class="title">部门信息列表</div>
		<div class="selectDiv">
			<form action="<%=path%>/getAllDeptWhth" name="selectForm"
				method="post">
				部门编号:<input type="text" name="id" value="${id}" class="text" />&nbsp;
				部门名称:<input type="text" name="name" value="${name}" class="text" />&nbsp;<input
					type="submit" value="搜 索" class="button" />

			</form>
		</div>
		<div class="title">查询条件：</div>
		<table class="tableList">
			<tr bgcolor="#66ccff">
				<th>部门编号</th>
				<th>部门名称</th>
				<th>部门备注</th>
				<th>相关操作&nbsp;[<a href="<%=path%>/jsp/addDept.jsp">添加部门</a>]
				</th>
			</tr>

			<c:forEach items="${depts }" var="d">

				<tr class="trHover">
					<td>${d.deptId}</td>
					<td>${d.sname}</td>

					<td>${d.sdes}</td>
					<td><a
						href="/web_18_ssm/updateBefore?id=${d.deptId}">修改</a>&nbsp;|&nbsp;
						<%-- 	<a href="<%=path%>/DeptServlet?m=delete&id=${d.deptId}">删除</a> --%>
						<button onclick="sureDle(${d.deptId})">删除</button></td>
				</tr>

			</c:forEach>





		</table>

		<!-- 分页条  -->
		<div class="pagination" style="margin: 0px;" id="pagination"></div>

		<!-- 因为需要回显当前点击的是第几页   -->
		<input type="hidden" id="nowpage" value="${nowpage }">
	</div>




</body>
<script type="text/javascript">
	function sureDle(id) {
  //js原生的confirm方法会弹出一个提示框 有确认和取消两个操作 
		var msg = "您确定要删除该数据吗？";
		if (confirm(msg) == true) { //表示选择的是 确定
			//超链接跳转
			window.location.href="/web_18_ssm/deletebyid?id="+id
			//return true; //你也可以在这里做其他的操作
		} 

	}
	function del2(id){
		$.messager.confirm('确认', '确定删除数据吗？', function(r) {
			if(r) {
				window.location.href="/xee1810_7_curd/DeptServlet?m=delete&id="+id;
			}});
	}
	//在js中获取当前是第几页
	var nowPage = $("#nowpage").val();
	//	var size = $("#size").val();

	$.jqPaginator('#pagination', {
		totalPages : 100, //一共有多少页  
		visiblePages : 10, //显示有多少页
		currentPage : parseInt(nowPage), //当前是第几页 parseInt String转int
		  first: '<li class="first"><a href="javascript:;">首页</a></li>',
		prev : '<li class="prev"><a href="javascript:;">上一页</a></li>',
		next : '<li class="next"><a href="javascript:;">下一页</a></li>',
		page : '<li class="page"><a href="javascript:;">{{page}}</a></li>',
		last: '<li class="last"><a href="javascript:;">末页</a></li>',
	//当你点击上一页或者下一页的时候会触发这个函数 num是点击以后的第几页
		onPageChange : function(num, type) {
			if (type == 'change') {
				location.href = "http://localhost:8080/xee1810_7_curd/DeptServlet?m=list&nowPage="
						+ num;

			}

		}
	});
</script>
</html>
