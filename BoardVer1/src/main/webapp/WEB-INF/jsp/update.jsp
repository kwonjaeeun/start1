<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="com.koreait.board.BoardVO, java.util.*" %>   
<%
	BoardVO vo = (BoardVO)request.getAttribute("VO");
	String no= (String)request.getAttribute("no");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/all.css">

<title>Insert title here</title>
</head>
<body>
<h1>update</h1>
<form action="/search" method="post">
no:<input type="text" name="iboard">
<input type="submit" value="찾기">
</form>
<%
	if(vo!=null){%>
	<form action="/update" method="post">
	no:<input type="text" name="iboard" value="<%=vo.getIboard() %>">
	제목:<input type="text" name="title" value="<%=vo.getTitle() %>">
	내용:<textarea name="ctnt" rows="10" cols="10"><%=vo.getCtnt()%></textarea>
	<input type="submit" value="수정하기">
	</form>
<%}%>
${error}<br>
<a href="list">Back to list</a>
</body>
</html>