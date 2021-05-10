<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<h1>Update page</h1>
	<form action="/update?no=${param.no}" method="post">
		Iboard  :<input type="text" name="iboard" value="${data.iboard}"><br>
		Title:<input type="text" name="title" value="${data.title}"><br>
		Ctnt:<textarea name="ctnt">${data.ctnt}</textarea>
		<button>Save</button>		
	</form>
<a href="/home"><button>home</button></a>
</body>
</html>