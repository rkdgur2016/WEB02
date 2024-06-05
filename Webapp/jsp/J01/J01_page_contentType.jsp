<%@ page language="java" contentType="application/vnd.ms-excel; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setHeader("Content-Disposition", "attachment; filename=diary.xls"); 
	response.setHeader("Content-Description", "JSP Generated Data"); 
	response.setContentType("application/vnd.ms-excel");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>page : contentType: 현 jsp 내용 대한 유형을 결정 (원하는 mime를 기록)</h1>
	<hr>
</body>
</html>