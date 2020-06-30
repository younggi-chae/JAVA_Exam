<%@ page import="mvc.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:url var="saveReplyURL" value="/restBoard/saveReply"></c:url>
<c:url var="updateReplyURL" value="/restBoard/updateReply"></c:url>
<c:url var="deleteReplyURL" value="/restBoard/deleteReply"></c:url>

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
	
	
	$(document).ready(function(){
		showReplyList();
	});
	
	function showReplyList(){
		var url = "${pageContext.request.contextPath}/restBoard/getReplyList.do";
		var paramData = {"seq" : "${getBoard.seq}"};
		$.ajax({
            type: 'POST',
            url: url,
            data: paramData,
            dataType: 'json',
            success: function(result) {
               	var htmls = "";
			if(result.length < 1){
				htmls.push("등록된 댓글이 없습니다.");
			} else {
	                    $(result).each(function(){
	                     htmls += '<div class="media text-muted pt-3" id="rid' + this.rid + '">';
	                     htmls += '<svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder:32x32">';
	                     htmls += '<title>Placeholder</title>';
	                     htmls += '<rect width="100%" height="100%" fill="#007bff"></rect>';
	                     htmls += '<text x="50%" fill="#007bff" dy=".3em">32x32</text>';
	                     htmls += '</svg>';
	                     htmls += '<p class="media-body pb-3 mb-0 small lh-125 border-bottom horder-gray">';
	                     htmls += '<span class="d-block">';
	                     htmls += '<strong class="text-gray-dark">' + this.reg_id + '</strong>';
	                     htmls += '<span style="padding-left: 7px; font-size: 9pt">';
	                     htmls += '<a href="javascript:void(0)" onclick="fn_editReply(' + this.rid + ', \'' + this.reg_id + '\', \'' + this.content + '\' )" style="padding-right:5px">수정</a>';
	                     htmls += '<a href="javascript:void(0)" onclick="fn_deleteReply(' + this.rid + ')" >삭제</a>';
	                     htmls += '</span>';
	                     htmls += '</span>';
	                     htmls += this.content;
	                     htmls += '</p>';
	                     htmls += '</div>';
	                });	//each end
			}
			$("#replyList").html(htmls);        
            }  // Ajax success end
		});	// Ajax end
	}
	
	$(document).on('click', '#btnReplySave', function(){
		var replyContent = $('#content').val();
		var replyReg_id = $('#reg_id').val();
		var paramData = JSON.stringify({"content": replyContent
				, "reg_id": replyReg_id
				, "seq":'${getBoard.seq}'
		});		

		var headers = {"Content-Type" : "application/json"
				, "X-HTTP-Method-Override" : "POST"};
		$.ajax({
			url: "${saveReplyURL}"
			, headers : headers
			, data : paramData
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
				showReplyList();
				$('#content').val('');
				$('#reg_id').val('');
			}
			, error: function(error){
				console.log("에러 : " + error);
			}
		});
	});
	
	function fn_editReply(rid, reg_id, content){
		var htmls = "";
		htmls += '<div class="media text-muted pt-3" id="rid' + rid + '">';
		htmls += '<svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder:32x32">';
		htmls += '<title>Placeholder</title>';
		htmls += '<rect width="100%" height="100%" fill="#007bff"></rect>';
		htmls += '<text x="50%" fill="#007bff" dy=".3em">32x32</text>';
		htmls += '</svg>';
		htmls += '<p class="media-body pb-3 mb-0 small lh-125 border-bottom horder-gray">';
		htmls += '<span class="d-block">';
		htmls += '<strong class="text-gray-dark">' + reg_id + '</strong>';
		htmls += '<span style="padding-left: 7px; font-size: 9pt">';
		htmls += '<a href="javascript:void(0)" onclick="fn_updateReply(' + rid + ', \'' + reg_id + '\')" style="padding-right:5px">저장</a>';
		htmls += '<a href="javascript:void(0)" onClick="showReplyList()">취소<a>';
		htmls += '</span>';
		htmls += '</span>';		
		htmls += '<textarea name="editContent" id="editContent" class="form-control" rows="3">';
		htmls += content;
		htmls += '</textarea>';
		htmls += '</p>';
		htmls += '</div>';
		$('#rid' + rid).replaceWith(htmls);
		$('#rid' + rid + ' #editContent').focus();
	}
	
	function fn_updateReply(rid, reg_id){
		var replyEditContent = $('#editContent').val();
		var paramData = JSON.stringify({"content": replyEditContent
				, "rid": rid
		});		

		var headers = {"Content-Type" : "application/json"
				, "X-HTTP-Method-Override" : "POST"};
		$.ajax({
			url: "${updateReplyURL}"
			, headers : headers
			, data : paramData
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
                                console.log(result);
				showReplyList();
			}
			, error: function(error){
				console.log("에러 : " + error);
			}
		});
	}
	
	function fn_deleteReply(rid){
		var paramData = {"rid": rid};
		$.ajax({
			url: "${deleteReplyURL}"
			, data : paramData
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
				showReplyList();
			}
			, error: function(error){
				console.log("에러 : " + error);
			}
		});
		location.reload();
	}
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
	
	<!-- Reply Form {s} -->
			<div class="my-3 p-3 bg-white rounded shadow-sm" style="padding-top: 10px">
				<form:form name="form" id="form" role="form" modelAttribute="replyDTO" method="post">
				<form:hidden path="seq" id="seq" value=""/>
				<div class="row">
					<div class="col-sm-10">
						<form:textarea path="content" id="content" class="form-control" rows="3" placeholder="댓글을 입력해 주세요"></form:textarea>
					</div>
					<div class="col-sm-2">
						<form:input path="reg_id" class="form-control" id="reg_id" placeholder="댓글 작성자"></form:input>
						<button type="button" class="btn btn-sm btn-primary" id="btnReplySave" style="width: 100%; margin-top: 10px"> 저 장 </button>
					</div>
				</div>
				</form:form>
			</div>
			<!-- Reply Form {e} -->			

			<!-- Reply List {s}-->
			<div class="my-3 p-3 bg-white rounded shadow-sm" style="padding-top: 10px">
				<h6 class="border-bottom pb-2 mb-0">Reply list</h6>
				<div id="replyList"></div>
			</div> 
			<!-- Reply List {e}-->		
</center>
</body>
</html>