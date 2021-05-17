<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<link rel="stylesheet" href="../css/form.css">
</head>
<body>
	<div class="center_board">
		<div class="b_title">
			<strong><a href="home">Board ver.04</a></strong>
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
	<form id="listform">
		<table>
			<c:forEach var="vo" items="${data}" varStatus="status">
				<c:if test="${status.first}">
					<tr id="tHead">
						<th>NO</th>
						<th>TITLE</th>
						<th>CTNT</th>
						<th>WRITTER</th>
					</tr>
				</c:if>
				<tr class="ctr" onclick="togodetail(${vo.iboard})">
					<td>${vo.iboard}</td>
					<td>${vo.title}</td>
					<td>${vo.ctnt}</td>
					<td>${vo.unm}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	<div>
		<button><a href="write">Write</a></button>
	</div>
	<script>
		function togodetail(iboard) {
			location.href="detail?iboard="+iboard;
		}
	</script>
</body>
</html>