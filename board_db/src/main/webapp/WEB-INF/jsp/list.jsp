<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<h1>List page</h1>
	<table>
		<c:forEach var="vo" items="${data}" varStatus="status" >
			<c:if test="${status.first}">
				<tr>
					<th>NO</th>
					<th>TITLE</th>
				</tr>
			</c:if>
			<tr>
				<td><a href="detail?no=${status.index}">${vo.iboard}</a></td>
				<td><a href="detail?no=${status.index}">${vo.title}</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/write"><button>Write page</button></a>
	
</body>
</html>