<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>Request Header Information</h1>
	<hr>
	<%
		Enumeration<String> headerEnum = request.getHeaderNames();
		while(headerEnum.hasMoreElements() == true){
			String headerName = headerEnum.nextElement();
			
			String headerValue = request.getHeader(headerName);
			
			out.print("<p>" + headerName + "," + headerValue + "</p>");
		}
	%>
</body>
</html>