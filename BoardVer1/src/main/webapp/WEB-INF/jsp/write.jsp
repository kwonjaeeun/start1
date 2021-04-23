<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>write</div>
<form action="/write" method="post">
i-num:<input type="text" name="iboard">
제목:<input type="text" name="title">
내용:<textarea name="ctnt" rows="10" cols="10"></textarea>
<input type="submit" value="글쓰기">
</form>
${error}<br>
<a href="list">리스트로~!</a>
</body>
</html>