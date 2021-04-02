<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<% 
String day= String.format("%tF",Calendar.getInstance());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>sss</li>
		<li>sss</li>
		<li>sss</li>
		<li>sss</li>
		<%=day %>
	</ul>
</body>
</html>