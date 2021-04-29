<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
</head>
<body>
	<form action="/write" method="post">
		제목:<input type="text" name="title"><br>
		내용:<textarea rows="15" cols="23" name="ctnt"></textarea><br>
		<button>저장</button>
	</form>
</body>
</html>