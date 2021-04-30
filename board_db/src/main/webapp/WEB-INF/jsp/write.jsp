<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
</head>
<body>
	<h1>Write page</h1>
	<form action="/write" method="post">
		Title:<input type="text" name="title"><br>
		Ctnt:<textarea name="ctnt"></textarea>
		<button>Save</button>		
	</form>

</body>
</html>