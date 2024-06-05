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
	<h1>application 내장 객체</h1>
	<hr>
	<%
		Enumeration<String> initParam = application.getInitParameterNames();
		while(initParam.hasMoreElements() == true){
			String initParamName = initParam.nextElement();
			out.print("initParameter : " + initParamName + "<br>");
			out.println("value : " + application.getInitParameter(initParamName) + "<br>");
		}
	%>
</body>
</html>