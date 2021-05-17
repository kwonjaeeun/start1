<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user login</title>
<link rel="stylesheet" href="../css/form.css">
</head>
<body>
<div class="center_board">
		<div class="b_title"><strong><a href="home">Board ver.04</a></strong></div>
		<div class="navi_container">
			<div>
				<a href="join"> Join </a>
			</div>
			<div>
				<a href="login" id="log_tag"> Login </a>
			</div>
		</div>
	</div>

	<form id="listform2" action="login" method="post">
		<div><div class="ibox">Id:</div><input type="text" name="uid"> </div>
		<div><div class="ibox">Password:</div><input type="password" name="upw"></div>
		<div>
			<input type="submit" id="log_button" value="Login" > <input type="reset"
				value="Reset">
		</div>
	</form>
	${errmsg}<br>
<script>
	function aaa(text) {
		const t= text;
		const a = document.getElementById('log_tag')	;
		a.innerText=t;
		a=document.getElementById('log_button')	;
		a.value=t;
	}
	

	if(!${empty user.uid }){
		aaa('Logout');
	}else{
		aaa('Login');
	}
</body>
</html>