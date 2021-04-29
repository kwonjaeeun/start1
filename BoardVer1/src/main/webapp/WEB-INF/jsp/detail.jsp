<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="com.koreait.board.BoardVO, java.util.*" %>  
<%	
	String no=request.getParameter("no");
	BoardVO vo= (BoardVO)request.getAttribute("data_vo");
%>     
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/all.css">

<title>Insert title here</title>
</head>
<body>
<h1>디테일</h1>
<div>no:<%=no%></div>
<div>제목:<%=vo.getTitle()%></div>
<div>내용:<%=vo.getCtnt()%></div>
<form action="/delete?no=<%=no%>" method="post">
<input type="submit" value="삭제하기">
</form>

<a href="list">Back to list</a>
</body>
</html>