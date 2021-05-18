<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
<link rel="stylesheet" href="../css/form.css">
</head>
<body>
	<div class="center_board">
		<div class="b_title">
			<strong><a href="list">Board ver.04</a></strong>
		</div>
		<div class="navi_container">
			<div>
				<a href="/user/join"> Join </a>
			</div>
			<div>
				<a href="/user/login" id="log_tag"> Logout </a>
			</div>
		</div>
	</div>
	<div>${loginUser.uid}님환영합니다.</div>
	<button type="button" id="like_btn"onclick="like(${data.iboard})">
		<img id="like" width="100%" src="/css/22.png">
	</button>
	<div id="demain">
		<div>NO:${data.iboard}</div>
		<div>TITLE:${data.title}</div>
		<div>CONTENT:${data.ctnt}</div>
		<div>WRITTER:${data.unm}</div>
		<div>REGDT:${data.regdt}</div>
		<div onclick="openComment('upcform','commform')">댓글</div>
		<c:if test="${loginUser.iuser == data.iuser}">
			<div>
				<button>
					<a href="del?iboard=${data.iboard}">삭제</a>
				</button>
				<button>
					<a href="mod?iboard=${data.iboard}">수정</a>
				</button>
			</div>
		</c:if>
		<hr size="2px" width="99%">
		<div style="height: 60%; overflow: auto">
			<table>
				<c:forEach var="co" items="${comments}">
					<tr id="tarow">
						<td>┌( ಠ_ಠ)┘</td>
						<td>${co.unm}</td>
						<td>${co.ctnt}</td>
						<td>${co.regdt}</td>

						<td><c:if test="${loginUser.iuser ==co.iuser}">
								<button onclick="openupComment(${co.ict},'${co.ctnt.trim()}')">수정</button>
								<button onclick="delComm(${co.ict},${data.iboard})">삭제</button>
							</c:if></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div id="comment">
		<form id="commform" action="cmt" method="post">
			<input type="hidden" name="iboard" value="${data.iboard}">
			<textarea name="comment"></textarea>
			<input type="submit" value="댓글등록"> <input type="button"
				onclick="closeComment()" value="닫기">
		</form>
		<form id="upcform" action="cmt" method="post" class="hidden">
			<input type="hidden" name="ict" value="0"> <input
				type="hidden" name="iboard" value="${data.iboard}">
			<textarea name="comment"></textarea>
			<input type="submit" value="댓글수정"> <input type="button"
				onclick="closeComment()" value="수정취소">
		</form>
	</div>
	<script>
	var comment=document.querySelector('#comment');
	var commform=document.querySelector('#commform');
	var upcform=document.querySelector('#upcform');
		function openComment(x,y) {
			upcform.style.display = "none";
			commform.style.display="flex"
			comment.style.display = "block";
		}
		function closeComment() {
			upcform.style.display = "none";
			commform.style.display="none"
			comment.style.display = "none";
		}
		function openupComment(y,z) {
			upcform.ict.value=y;
			upcform.comment.value=z;
			
			commform.style.display="none"
			upcform.style.display = "flex";
			comment.style.display = "block";
		}
		function delComm(a,b){
			if(confirm("삭제 하시겠습니까?")){
				location.href='cmt?ict='+a+'&iboard='+b;
			}
		}
		function likedp(a) {
			console.log(a);
			if(a===1){
				document.querySelector('#like').src="/css/223.png";				
				return;
			}else{				
				document.querySelector('#like').src="/css/22.png";				
			}
		}
		function like(a) {
			location.href="like?likeck="+a;				
		}
	window.onload=likedp(${likeck});

	</script>
</body>
</html>