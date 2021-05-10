<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="../css/form.css">
</head>
<body>

	<div class="center_board">
		<div class="b_title"><strong>Board ver.04</strong></div>
		<div class="navi_container">
			<div>
				<a href="join"> Join </a>
			</div>
			<div>
				<a href="login"> Login </a>
			</div>
			<div>
				<a href="home"> Home </a>
			</div>
		</div>
	</div>

	<form action="login" method="post">
		<div><div class="ibox">Id:</div><input type="text" name="uid"> </div>
		<div><div class="ibox">Password:</div><input type="password" name="upw"></div>
		<div>
			<input type="submit" value="login"> <input type="reset"
				value="reset">
		</div>
	</form>

</body>
</html>
