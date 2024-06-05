<%--
	request
	request 객체는 클리이언트 요청 정보를 포함한다.
	이를 통해 클라이언트가 보낸 파라미터, 헤더, 쿠키 등을 가져올 수 있습니다.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>request 내장객체</h1>
	<hr>
	<p>서버이름 : <%=request.getServerName() %></p>
	<p>서버포트 : <%=request.getServerPort() %></p>
	<p>서버주소 : <%=request.getServletPath() %></p>
	<p>ip : <%=request.getRemoteAddr() %></p>
	<p>protocol : <%= request.getProtocol() %></p> 
	<p>serverURL : <%= request.getRequestURI() %></p>
	<p>서버 컨텍스트 : <%=request.getContextPath() %></p>
</body>
</html>