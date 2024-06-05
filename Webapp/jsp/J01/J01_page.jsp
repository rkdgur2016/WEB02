<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%
	Date d = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>주석(comment)</h1>
	<hr>
	날짜=<%=d %>
	<%
		//java code
		for(int i=1; i<= 10; i++){
			
	%>
		<p><%=i %></p>
	
	<%
		}
	%>
</body>
</html>