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

	<div>${loginSuccess.uid}님환영합니다.</div>
	<form>
		<div>NO:${data.iboard}</div>
		<div>TITLE:${data.title}</div>
		<div>CONTENT:${data.ctnt}</div>
		<div>WRITTER:${data.unm}</div>
		<div>REGDT:${data.regdt}</div>
	<c:if test="${loginSuccess.iuser == data.iuser }">
		<div>
			<a href="del?iboard=${data.iboard}">삭제</a> 
			<a href="mod?iboard=${data.iboard}">수정</a>
		</div>
	</c:if>
	</form>
</body>
</html>