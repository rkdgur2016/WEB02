<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cPath = request.getContextPath();
	out.print("cPath : " + cPath);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>form 요청</h1>
	<hr>
	<form action="<%=cPath%>/jsp/J02_request.jsp" method="get">
		<label for="user_name">이름</label>
		<input type="text" name="user_name" id="user_name" size="10"><br>
		<label for="user_tel">전화번호</label>
		<input type="text" name="user_tel" id="user_tel" size="10"><br>
		<label>		
			<input type="checkbox" name="lang" value="10">java
		</label>
		<label>		
			<input type="checkbox" name="lang" value="20">html
		</label>
		<label>		
			<input type="checkbox" name="lang" value="30">css
		</label>
		<label>		
			<input type="checkbox" name="lang" value="40">js
		</label>
		<input type="submit" value="전송">
	</form>
</body>
</html>