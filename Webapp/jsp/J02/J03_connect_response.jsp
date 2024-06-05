<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   	String userName = (String)request.getAttribute("userName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>jsp/J02/J03_connect_response.jsp</h1>
	<hr>
	userName : <%=userName %>
</body>
</html>