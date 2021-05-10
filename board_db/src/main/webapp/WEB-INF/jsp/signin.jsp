<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign in</title>
</head>
<body>
	<h1>sign in page</h1>
	<form action="/signin" method="post">
		ID:<input type="text" name="id"><br>
		Password:<input type="password" name="password"><br>
		name:<input type="text" name="name"><br>
		age:<select name="age"  size=1>
			<c:forEach var="i" begin="1" end="100">
				<option value="${i}">${i}</option>
			</c:forEach>
			</select>
		<br>
		<button>sign in</button>		
	</form>
	${error}
	<a href="/home"><button>home</button></a>
</body>
</html>