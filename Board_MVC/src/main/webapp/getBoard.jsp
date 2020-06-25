<%@ page import="mvc.board.impl.BoardDAOSpring" %>
<%@ page import="mvc.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script>
	$(document).on('click', '#btnWriteForm', function(e){
		e.preventDefault();
		location.href = "insertBoard.jsp";
	});
	$(document).on('click', '#btnDeleteForm', function(e){
		e.preventDefault();
		location.href = "deleteBoard.do?seq=${board.seq }";
	});
	$(document).on('click', '#btnListForm', function(e){
		e.preventDefault();
		location.href = "getBoardList.do";
	});	
</script>

<title>글 상세</title>
</head>
<body>
<center>
	<h1>글 상세</h1>
	<a href="logout.do">Log-out</a>
	<hr>
	<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="${board.seq }"/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td class="title" bgcolor="green" width="70">제목</td>
			<td align="left"><input name="title" type="text" value="${board.title }"/></td>
		</tr>
		<tr>
			<td class="writer" bgcolor="green">작성자</td>
			<td align="left">${board.writer }</td>
		</tr>
		<tr>
			<td class="content" bgcolor="green">내용</td>
			<td align="left"><textarea name="content" rows="10" cols="40">${board.content }</textarea></td>
		</tr>
		<tr>
			<td class="regDate" bgcolor="green">등록일</td>
			<td align="left">${board.regDate }</td>
		</tr>
		<tr>
			<td class="cnt" bgcolor="green">조회수</td>
			<td align="left">${board.cnt }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="글 수정"/>
			</td>
		</tr>	
	</table>
	</form> 
	<hr>
	<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm">글등록</button>&nbsp;&nbsp;&nbsp;
	<button type="button" class="btn btn-sm btn-primary" id="btnDeleteForm">글삭제</button>&nbsp;&nbsp;&nbsp;
	<button type="button" class="btn btn-sm btn-primary" id="btnListForm">글목록</button>	
</center>
</body>
</html>