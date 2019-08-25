<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addDept.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="<%=path%>/css/main.css">


</head>

<body>
	<div class="main">
		<div class="title">
			<a href="<%=path%>/DeptServletUrl">部门列表</a> &gt;&nbsp;添加部门
		</div>
		<form action="/web_18_ssm/save" method="post">
			
			<div class="line">
				部门名称:<input type="text" name="sname" value="" class="text" />
			</div>
			<div class="line">
				部门描述:<input type="text" name="sdes" value="" class="text" />
			</div>
			<div class="line">
				<input type="submit" value="添加部门" class="button" />&nbsp;<input
					type="button" value="返回列表" onclick="window.history.back();"
					class="button" />&nbsp;
			</div>
		</form>
	</div>
</body>
</html>
