<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link rel="stylesheet" href="../css/form.css">
</head>
<body>
	<div class="center_board">
		<div class="b_title"><strong><a href="home">Board ver.04</a></strong></div>
		<div class="navi_container">
			<div><a href="join">Join</a> </div>
			<div><a href="login">Login</a> </div>
		</div>
	</div>
	<form action="join" method="post">
		<div>
			<input type="text" name="uid" placeholder="id">
		</div>
		<div>
			<input type="password" name="upw" placeholder="password">
		</div>
		<div>
			<input type="text" name="unm" placeholder="name">
		</div>
		<div>
			Gender: <label>Female<input type="radio" name="gender"
				value="0" checked="checked"></label> <label>Male<input
				type="radio" name="gender" value="1"></label>
		</div>
		<div>
			<input type="submit" value="Join">
		</div>
	</form>

</body>
</html>