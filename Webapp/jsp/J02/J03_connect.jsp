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
	<h1>connect</h1>
	<hr>
	<form action="/WEB02/connect.do" method="post">
		<label>작업구분 : 
			<input type="text" name="work_div">
		</label>
		<label>이름 : 
			<input type="text" name="user_name">
		</label>
		<input type="submit" value="전송">
	</form>
</body>
</html>