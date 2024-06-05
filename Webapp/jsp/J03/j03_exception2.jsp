<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>예외처리</h1>
	<hr>
	<% try{ %>
		age : <%= request.getParameter("age").toLowerCase() %>
	<% }catch(NullPointerException e){ %>
		age파라미터가 올바르지 않습니다.
	<% }	%>
</body>
</html>