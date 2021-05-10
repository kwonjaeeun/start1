<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<script>
	function todetail(i) {
		location.href="/detail?no="+i;
	}
</script>
</head>
<body>
	<h1>List page</h1>
	Current user: ${user.id}
	<table>
		<c:forEach var="vo" items="${data}" varStatus="status">
			<c:if test="${status.first}">
				<tr>
					<th>NO</th>
					<th>TITLE</th>
					<th>COUNT</th>
				</tr>
			</c:if>
			<tr onclick="todetail(${vo.iboard});">
				<td>${vo.iboard}</td>
				<td>${vo.title}</td>
				<td>${vo.cnt}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/write"><button>Write page</button></a>
	<a href="/home"><button>home</button></a>
</body>

</html>