<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외상황처리</title>
</head>
<body>
	<h4>다음과 같은 에러가 발생하였습니다</h4>
	에러타입 :
	<%=exception.getClass().getName()%>
	<br>에러메시지:
	<%=exception.getMessage()%>
</body>
</html>