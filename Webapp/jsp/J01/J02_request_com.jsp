<%@page import="cmn.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String user_name = StringUtil.nvl(request.getParameter("user_name"), "Anonnymous");
	String user_tel = StringUtil.nvl(request.getParameter("user_tel"), "00000000000");
	String[] langArr = request.getParameterValues("lang");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>form 출력</h1>
	<hr>
	이름 : <%=user_name %><br>
	전화번호 : <% out.print(user_tel);%>
	
	<%
		for(String str : langArr){
			out.print(str + ",");
		}
	%>
</body>
</html>