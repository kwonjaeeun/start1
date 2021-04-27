<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/all.css">
</head>
<body>
<h1>delete</h1>
<form action="/delete" method="post">
no:<input type="text" name="iboard">
<input type="submit" value="삭제하기">
</form>
${error}<br>
<a href="list">Back to list</a>

</body>
</html>