<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/update" method="post">
		<input type="hidden" name="no" value="${param.no}">
		제목:<input type="text" name="title" value="${vo.title}"><br>
		내용:<textarea rows="15" cols="23" name="ctnt">${vo.ctnt}</textarea><br>
		<button>저장</button>
	</form>
<a href="/list"><button>List</button></a>

</body>
</html>