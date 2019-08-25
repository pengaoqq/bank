<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	//获取项目名字  getContextPath() 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:if test="${list == null}">

	<c:redirect url="/a/yongh/getList"></c:redirect>
</c:if>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>用户管理</title>
<link rel="stylesheet" href="/web_system/common/css/sccl.css">
<link rel="stylesheet" href="/web_system/common/css/layui.css">
<link rel="stylesheet"
	href="/web_system/common/css/healthmanagement.css" />
<script type="text/javascript"
	src="/web_system/common/lib/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="/web_system/common/layui/layui.js"></script>
<script src="/web_system/common/js/sccl-util.js"></script>

<script type="text/javascript">
	$(function() {
		layui
				.use(
						[ 'layer', 'laypage' ],
						function() {
							var layer = layui.layer;
							var laypage = layui.laypage;
							var meid = -1;
							var open = 1;
							var str = 2;
							getlis();
							function getlis() {

							}

							function lis(data) {

								var html = '';
								for (var i = 0; i < data.lists.length; i++) {
									html += '<tr name="';
						html+=data.lists[i].columnid;
						html+='"><td>';
									html += data.lists[i].columnname;
									html += '</td><td class="mysort">';
									html += data.lists[i].sort;
									html += '</td><td>';
									html += data.lists[i].createtime;
									html += '</td><td name="';
						html+=data.lists[i].columnid;
						html+='">';
									html += '<button class="layui-btn layui-btn-danger layui-btn-small rem_btn">删除栏目</button>';
									html += '<button class="layui-btn layui-btn-danger layui-btn-small txt_btn">编辑栏目</button>';
									if (i != 0) {
										html += '<button class="layui-btn layui-btn-small top_btn"><i class="icon-font">&#xe619;</i>上移</button>';
									}
									;
									if (i != data.lists.length - 1) {
										html += '<button class="layui-btn layui-btn-small bom_btn"><i class="icon-font">&#xe61a;</i>下移</button>';
									}
									;

									html += '</td></tr>';
								}
								;
								$("#listbody").append(html);

								//删除
								$(".rem_btn").click(
										function() {
											var columnid = $(this).parent("td")
													.attr("name");
											// /admin/column/delete/{id}
											var url = myurl()
													+ "/admin/column/delete/"
													+ columnid;
											ajaxget(url, "", "json", function(
													data) {
												if (data.code == 1) {
													layer.msg('删除成功');
													getlis();
												} else {
													layer.msg('删除失败,code:'
															+ data.code);
												}
											});
										});
								//上移
								$(".top_btn")
										.click(
												function() {
													var topsort = $(this)
															.parents("tr")
															.prev("tr").attr(
																	"name");
													var mysort = $(this)
															.parents("tr")
															.attr("name");
													//console.log(topsort+"----"+mysort);
													//http://192.168.1.115:8080/health/admin/column/changePlace/4/8
													var url = myurl()
															+ "/admin/column/changePlace/"
															+ topsort + "/"
															+ mysort;
													ajaxget(
															url,
															"",
															"json",
															function(data) {
																if (data.code == 1) {
																	layer
																			.msg('移动成功');
																	getlis();
																} else {
																	layer
																			.msg('移动成功,code:'
																					+ data.code);
																}
																;
															})
												});
								//下移
								$(".bom_btn")
										.click(
												function() {
													var nextsort = $(this)
															.parents("tr")
															.next("tr").attr(
																	"name");
													var mysort = $(this)
															.parents("tr")
															.attr("name");
													//console.log(nextsort+"----"+mysort);
													var url = myurl()
															+ "/admin/column/changePlace/"
															+ nextsort + "/"
															+ mysort;
													ajaxget(
															url,
															"",
															"json",
															function(data) {
																if (data.code == 1) {
																	layer
																			.msg('移动成功');
																	getlis();
																} else {
																	layer
																			.msg('移动成功,code:'
																					+ data.code);
																}
																;
															})
												});
								//编辑
								$(".txt_btn")
										.click(
												function() {
													var columnid = $(this)
															.parent("td").attr(
																	"name");
													var url = myurl()
															+ "/admin/column/getById/"
															+ columnid
													ajaxget(
															url,
															"",
															"json",
															function(data) {
																if (data.code == 1) {
																	$(
																			"#namement")
																			.val(
																					data.pojo.columnname);
																	$(
																			"#txtmore")
																			.val(
																					data.pojo.remark);
																	$(
																			"#sortnum")
																			.val(
																					data.pojo.sort);
																	console
																			.log($(
																					"#namement")
																					.val());
																	addopen.cd = columnid;
																	addopen.pojo = data;
																	console
																			.log(addopen.pojo)
																	layui
																			.use(
																					'layer',
																					addopen);
																} else {
																	layer
																			.msg('获取栏目信息失败，code:'
																					+ data.code);
																}
															});

												});
							}
							;
							//弹出输出框
							$("#addbtn").click(function() {
								addopen.cd = -1;
								layui.use('layer', addopen);
							});

							var addopen = function() {

								if (addopen.cd == -1) {
									var title = "添加栏目";
								} else {
									var title = "编辑栏目";
								}
								;
								layer
										.open({
											title : title,
											type : 1,
											content : document
													.getElementById('code-temp').innerHTML,
											btn : [ '确定' ],
											/* success:function(layero, index){
												console.log(layero)
												console.log(index)
												console.log(addopen.pojo)
												console.log(addopen.cd)
												if(addopen.cd!=-1){
													$("#namement").val(addopen.pojo.pojo.columnname);
													$("#txtmore").val(addopen.pojo.pojo.remark);
													$("#sortnum").val(addopen.pojo.pojo.sort);
												};
											}, */
											yes : function(index, layero) {
												var $namement = $('#namement');
												var $txtmore = $('#txtmore');
												var $sortnum = $("#sortnum");
												if ($namement.val() === '') {
													layer.msg('栏目名称为必填项');
													isCheck = false;
												} else if ($sortnum.val() < 1) {
													layer.msg('请正确填写栏目顺序');
													isCheck = false;
												} else {
													//-1新建
													if (addopen.cd == -1) {
														var url = myurl()
																+ "/admin/column/save";
														var params = {
															"parentid" : meid,
															"sort" : $sortnum
																	.val(),
															"remark" : $txtmore
																	.val(),
															"columnname" : $namement
																	.val()
														};
														ajax(
																url,
																params,
																"json",
																function(data) {

																	if (data.code == 1) {
																		layer
																				.msg('提交成功');
																		layer
																				.close(index);
																		getlis();
																	} else {
																		layer
																				.msg('提交失败，code：'
																						+ data.code);
																	}
																	;
																});
													} else {
														var url = myurl()
																+ "/admin/column/update";
														var params = {
															"columnid" : addopen.cd,
															"parentid" : meid,
															"sort" : $sortnum
																	.val(),
															"remark" : $txtmore
																	.val(),
															"columnname" : $namement
																	.val()
														};
														ajax(
																url,
																params,
																"json",
																function(data) {

																	if (data.code == 1) {
																		layer
																				.msg('编辑成功');
																		layer
																				.close(index);
																		getlis();
																	} else {
																		layer
																				.msg('编辑失败，code：'
																						+ data.code);
																	}
																	;
																});
													}
													;

												}
											},
											area : [ '500px', '360px' ]
										})
							};

						})
	})
</script>
</head>
<body>

	<p style="padding-top: 10px;">
		<span class="layui-breadcrumb" style="visibility: visible;"> <a><cite>系统管理</cite><span
				class="layui-box">></span></a> <a href="#">用户管理</a>
		</span>
	</p>
	<div style="padding-top: 10px;">
		<button id="addbtn" class="layui-btn">
			<i class="icon-font">&#xe654;</i>添加用户 
		</button>
	</div>
	<table class="layui-table">
		<thead>
			<tr>
				<th>用户账号</th>
				<th>用户名字</th>
				<th>用户备注</th>
				<th>用户最后登录时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="listbody">
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.yonghzh}</td>

					<td>${item.yonghxm}</td>
					<td>${item.yonghbz}</td>
					<td><fmt:formatDate value="${item.yonghdlzhsj}" pattern="yyyy-MM-dd"/></td>

					<td>
						<button class="layui-btn layui-btn-danger layui-btn-small">删除权限组</button>
						<button class="layui-btn layui-btn-small">编辑</button>
					</td>
				</tr>

			</c:forEach>


		</tbody>
	</table>
	<div id="pagbox"></div>
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
</body>
</html>
