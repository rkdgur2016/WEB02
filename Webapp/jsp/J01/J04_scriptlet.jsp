<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//지역 변수
	int sum = 0;
	
	for(int i = 1; i<= 100; i++){
		sum +=i;
	}
%>
<%!
	//전역 변수
	String[] str = {"jsp가", "재미", "있다."};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동가홍상</title>
</head>
<body>
	<h1>스크립 요소</h1>
	<hr>
	<div>
		<p>합계 : <%= sum	 %></p>
	</div>
	<div>
		<%
			for(String strArr : str ){
				out.print("<p>"+strArr+"</p>");
			}
		%>
	</div>
</body>
</html>