<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
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
			<a href="<%=path%>/DeptServletUrl">部门列表</a> &gt;&nbsp;查看部门信息
		</div>

		<div class="line">部门编号:${deptBean.deptno}</div>
		<div class="line">部门名称:${deptBean.dname}</div>
		<div class="line">部门位置:${deptBean.loc}</div>
		<div class="line">
			&nbsp;<input type="button" value="返回列表"
				onclick="window.history.back();" class="button" />&nbsp;
		</div>

	</div>
</body>
</html>
