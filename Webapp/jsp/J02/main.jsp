<%@page import="cmn.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = StringUtil.nvl(request.getParameter("name"),"");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1></h1>
	<hr>
	name:<%=name %>
</body>
</html>