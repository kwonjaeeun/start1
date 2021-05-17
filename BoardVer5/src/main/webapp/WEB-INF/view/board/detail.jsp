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

	<div id="demain">
		<div>NO:${data.iboard}</div>
		<div>TITLE:${data.title}</div>
		<div>CONTENT:${data.ctnt}</div>
		<div>WRITTER:${data.unm}</div>
		<div>REGDT:${data.regdt}</div>
		<div onclick='openComment()'>댓글</div>
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
								<a href="cmt?ict=${co.ict}"><button>수정</button></a>
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
			<input type="submit" value="댓글등록">
		</form>
	</div>
	<script>
		function openComment() {
			var c = document.getElementById("comment");
			c.style.display = "block";
		}
		function delComm(a,b){
			if(confirm("삭제 하시겠습니까?")){
				location.href='cmt?ict='+a+'&iboard='+b;
			}
		}
	</script>
</body>
</html>