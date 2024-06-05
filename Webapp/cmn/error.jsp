<%@ page language="java" contentType="text/html; charset=UTF-8"
	isErrorPage = "true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	<h1>Error 404</h1>
	<hr>
	<p>요청 처리 과젱에 에러가 발생했습니다. <br>빠른 시간 내에 처리하도록 하겠습니다.</p>
	에러 타입 : <%= exception.getClass().getName() %><br>
	애러 메세지 : <%= exception.getMessage() %><br>
</body>
</html>