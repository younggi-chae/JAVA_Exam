<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script>
	$(document).on('click', '#btnWriteForm', function(e) {
		e.preventDefault();
		location.href = "insertBoard.jsp";
	});
	//이전 버튼 이벤트
	function fn_prev(page, range, rangeSize, searchType, keyword) {
	var page = ((range - 2) * rangeSize) + 1;
	var range = range - 1;

	var url = "getBoardList.do";
	url = url + "?page=" + page;
	url = url + "&range=" + range;
	url = url + "&searchType=" + $('#searchType').val();
	url = url + "&keyword=" + keyword;
	location.href = encodeURI(url);
	}

	//페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
	var url = "getBoardList.do";
	url = url + "?page=" + page;
	url = url + "&range=" + range;
	url = url + "&searchType=" + $('#searchType').val();
	url = url + "&keyword=" + keyword;
	location.href = encodeURI(url);
	}

	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize, searchType, keyword) {
	var page = parseInt((range * rangeSize)) + 1;
	var range = parseInt(range) + 1;

	var url = "getBoardList.do";
	url = url + "?page=" + page;
	url = url + "&range=" + range;
	url = url + "&searchType=" + $('#searchType').val();
	url = url + "&keyword=" + keyword;
	location.href = encodeURI(url);
	}
	
	$(document).on('click', '#btnSearch', function(e){
	e.preventDefault();
	var url = "getBoardList.do";
	url = url + "?searchType=" + $('#searchType').val();
	url = url + "&keyword=" + $('#keyword').val();
	location.href = encodeURI(url);	
	});		
</script>
<title><spring:message code="message.board.list.mainTitle" /></title>
</head>
<body>
	<div class="container">
		<div class="table-responsive">
			<center>
				<h1>
					<spring:message code="message.board.list.mainTitle" />
				</h1>
				<br>
				<h3>
					${userName}
					<spring:message code="message.board.list.welcomeMsg" />
					<a href="logout.do">Log-out</a>
				</h3>
				<br>
				<div>
					<button type="button" class="btn btn-sm btn-primary"
						id="btnWriteForm">
						<spring:message code="message.board.list.link.insertBoard" />
					</button>
				</div>
				<br>
				<table border="1" cellpadding="0" cellspacing="0" width="700">
					<tr>
						<th bgcolor="green" width="100"><spring:message
								code="message.board.list.table.head.seq" /></th>
						<th bgcolor="green" width="200"><spring:message
								code="message.board.list.table.head.title" /></th>
						<th bgcolor="green" width="150"><spring:message
								code="message.board.list.table.head.writer" /></th>
						<th bgcolor="green" width="150"><spring:message
								code="message.board.list.table.head.regDate" /></th>
						<th bgcolor="green" width="100"><spring:message
								code="message.board.list.table.head.cnt" /></th>
					</tr>

					<c:forEach items="${boardList }" var="board">
						<tr>
							<td>${board.seq }</td>
							<td align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
							<td>${board.writer }</td>
							<td>${board.regDate }</td>
							<td><c:out value="${board.cnt }" /></td>
						</tr>
					</c:forEach>

				</table>
				<br>
				<!-- pagination{s} -->
				<div id="paginationBox">
					<ul class="pagination">
						<c:if test="${pagination.prev}">
							<li class="page-item"><a class="page-link" href="#"
								onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}', '${search.searchType }', '${search.keyword }' )">Previous</a></li>
						</c:if>
						<c:forEach begin="${pagination.startPage}"
							end="${pagination.endPage}" var="idx">
							<li
								class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a
								class="page-link" href="#"
								onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}', '${search.searchType }', '${search.keyword }')">	${idx} </a></li>
						</c:forEach>
						<c:if test="${pagination.next}">
							<li class="page-item"><a class="page-link" href="#"
								onClick="fn_next('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}', '${search.searchType }', '${search.keyword }')">Next</a></li>
						</c:if>
					</ul>
				</div>
				<!-- pagination{e} -->
				<div>
					<!-- search{s} -->
					<div class="form-group row justify-content-center">
						<div class="w100" style="padding-right: 10px">
							<select class="form-control form-control-sm" name="searchType"
								id="searchType">
								<option value="TITLE">제목</option>
								<option value="CONTENT">본문</option>
								<option value="WRITER">작성자</option>
							</select>
						</div>
						<div class="w300" style="padding-right: 10px">
							<input type="text" class="form-control form-control-sm" 
								   name="keyword" id="keyword">
						</div>
						<div>
							<button class="btn btn-sm btn-primary" name="btnSearch"
								id="btnSearch">검색</button>
						</div>
					</div>
					<!-- search{e} -->
				</div>
			</center>
		</div>
	</div>
</body>
</html>