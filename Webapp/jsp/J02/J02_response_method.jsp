<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Method</title>
</head>
<body>
	<h1>Response Method</h1>
	<hr>
	
	<%
		//ContentType설정
		response.setContentType("text.html; charset=UTF-8");
	
		//Character Encoding
		response.setCharacterEncoding("UTF-8");
		
		//Status 설정
		response.setStatus(HttpServletResponse.SC_OK);
		
		//Header 설정
		response.setHeader("PCWK-Header","화요일");
		
		//Cookie 생성
		Cookie cookie = new Cookie("username","Goodman");
		
		//Cookie 추가, 유효시간 설정
		cookie.setMaxAge(60*60); //1시간
		response.addCookie(cookie);
		
		//에러 전송
//		response.sendError(HttpServletResponse.SC_NOT_FOUND, "Resource not found! 파일을 찾을 수 없습니다.");
		
		//리다이렉트
//		response.sendRedirect("https://cafe.daum.net/pcwk");
		
		//응답 본문 작성
		PrintWriter wrt = response.getWriter();
		wrt.println("<p>오늘은 화요일입니다.</p>");
	%>
</body>
</html>