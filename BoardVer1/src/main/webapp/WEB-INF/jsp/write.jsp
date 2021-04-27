<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/all.css">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
<h1>write</h1>
<form action="/write" method="post">
no:<input type="text" name="iboard">
제목:<input type="text" name="title">
내용:<textarea name="ctnt" rows="10" cols="10"></textarea>
<input type="submit" value="글쓰기">
</form>
${error}<br>
<a href="list">Back to list</a>
</body>
</html>
