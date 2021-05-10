<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>

<c:choose>
	<c:when test="${empty user}">
		<a href="/login"><button>login</button></a><br>	
	</c:when>
	<c:otherwise>
		Current user: <Strong>${user.id}</Strong><br>
		<a href="/login"><button>logout</button></a><br>
	</c:otherwise>
</c:choose>
<a href="/signin"><button>sign in</button></a><br>
<a href="/list"><button>list</button></a>
</body>
</html>