<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>์กฐํ</title>
</head>
<body>
${error}
<form action="memberSearch.do" method="post">
ID:<input type="text" name="id"/>
<input type="hidden" name="job" value="search"/>
<input type="submit" value="๊ฒ์"/>
</form>
</body>
</html>