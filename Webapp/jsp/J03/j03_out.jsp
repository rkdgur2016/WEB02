<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>out 내장객체</h1>
	<hr>
	<%
		out.print("내일은 쉬는 날");
		out.newLine();
		out.println("Hello, world!");
		out.print("내일은 쉬는 날 <br>");
		//jsp 파일에선 newLine() 안먹힘
		
		//버퍼 크기 출력
		out.println("Buffer Size : " + out.getBufferSize() + "bytes <br>");
		out.println("Remaining Buffer Size : " + out.getRemaining() + "bytes <br>");
		
		//강제 플러시 (강제 버퍼 키우기)
		out.flush();
		out.println("This is flushed content!<br>");
		
		//버퍼 지우기
		out.clearBuffer();
		out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
	%>
</body>
</html>