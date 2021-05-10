<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>login page</h1>
	<form action="/login" method="post">
		ID:<input type="text" name="id"><br>
		Password:<input type="password" name="password"><br>
		<button>login</button>		
	</form>
	<a href="/home"><button>home</button></a>
	${error}
</body>
</html>