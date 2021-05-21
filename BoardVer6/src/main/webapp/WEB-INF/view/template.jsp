<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${requestScope.title}</title>
<style>
body, html, ul {
	padding: 0;
	margin: 0;
}

ul {
	display: flex;
	flex-direction: row;
	justify-content:flex-end;
	list-style: none;
}

li {
	color: white;
	margin-left: 5%;
}
</style>
</head>
<body>
	<header style="background-color: #000000">
		<ul>
			<li>메뉴1</li>
			<li>메뉴2</li>
			<li>메뉴3</li>
		</ul>
	</header>
	<section>
		<jsp:include page="/WEB-INF/view/${requestScope.page}.jsp"></jsp:include>
	</section>
</body>
</html>