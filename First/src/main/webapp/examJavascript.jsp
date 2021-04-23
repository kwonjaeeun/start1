<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type ="text" id="num1">
		<input type ="text" id="num2">
		<button onclick="sum()">더하기</button>
		<button onclick="minus()">빼기</button>
	</div>
	<div>
		<input type ="text" id="result">
	</div>
	<script>
		var num1E = document.getElementById('num1');
		var num2E = document.querySelector('#num2');
		var resultE = document.querySelector('#result');
		function sum(){
			var num1=num1E.value;
			var num2=num2E.value;
			var result=parseInt(num1)+parseInt(num2);
			resultE.value=result;
		}
		function minus(){
			var num1=num1E.value;
			var num2=num2E.value;
			var result=parseInt(num1)-parseInt(num2);
			resultE.value=result;
		}
		
		
	</script>
</body>
</html>