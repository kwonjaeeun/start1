<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.koreait.board2.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
<div>제목:${vo.title}</div>
<div>내용:${vo.ctnt}</div>
<a href="/list"><button>List</button></a>
<a href="/delete?no=${param.no}"><button>Delete</button></a>
<a href="/update?no=${param.no}"><button>Update</button></a>

</body>
</html>