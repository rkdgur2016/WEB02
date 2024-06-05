<%@page import="java.util.List"%>
<%@page import="board.BoardDTO"%>
<%@page import="board.SearchDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/cmn/common.jsp" %>
   <%
   List<BoardDTO> list = (List<BoardDTO>)request.getAttribute("list");   
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>0524</title>
<link rel="stylesheet" href="/WEB02/css/poster.css">
</head>
<body>
<h3>게시판 목록</h3> 
<div>
	<div>
		<!-- 버튼 -->
		<input type="button" value="조회" onclick="javascript:doRetrieve();">
		<input type="button" value="등록" id="moveToReg">
	</div>
	<form action="<%=cPath %>/board/board.do" name="board_frm" method="get" id="board_frm">
		<input type="text" name="work_div" id="work_div">
		<input type="text" name="page_no" id="page_no" placeholder="페이지 번호">
		<div>
			<label for="">구분</label>
			<select name="search_div" id="search_div">
				<option value="">전체</option>
				<option value="10">제목</option>
				<option value="20">내용</option>
				<option value="30">아이디</option>
				<option value="40">제목 + 내용</option>
				<option value="50">SEQ</option>
			</select>
			<input type="search" name="search_word" id="search_word" placeholder="검색어">
			<select name="page_size" id="page_size">
				<option value="10">10페이지</option>
				<option value="20">20페이지</option>
				<option value="50">50페이지</option>
				<option value="100">100페이지</option>
				<option value="200">200페이지</option>
			</select>
		</div>
	</form>
	<table>
		<thead>
  			<tr>
    			<th>no</th> <th>제목</th> <th>등록자</th> <th>등록일</th> <th>조회수</th>
  			</tr>
		</thead>
		<tbody>
   			<%for(BoardDTO vo :list){ %>
  			<tr>
   				<td><%=vo.getSeq()%></td> 
			   	<td><%=vo.getTitle()%></td> 
			   	<td><%=vo.getReadCnt()%></td>
			   	<td><%=vo.getModId()%></td> 
			   	<td><%=vo.getModDate()%></td> 
  			</tr>
  			<% } %>
		</tbody>
	</table>
</div>
<script>
	function doRetrieve(){
		console.log("doRetrieve()");
	}
</script>
</body>
</html>