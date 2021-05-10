<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
	<h1>Detail page</h1>
	NO   :${data.iboard}<br>
	Title:${data.title}<br>
	Ctnt:${data.ctnt}<br>
	count:${data.cnt}<br>
	writer:${data.id}<br>
	<a href="delete?no=${data.iboard}"><button>Delete</button></a>		
	<a href="update?no=${data.iboard}"><button>Update</button></a>		
	<a href="/home"><button>home</button></a>
</body>
</html>