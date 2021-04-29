<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.koreait.board2.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<a href="/write">글쓰기</a>
	
	<table>
		<tr>
			<td>NO</td>
			<td>제목</td>
		</tr>
		<c:forEach var="item" items="${data}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td><a href="/detail?no=${status.index}">${item.title}</a></td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>