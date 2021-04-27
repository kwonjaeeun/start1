<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.koreait.board.BoardVO, java.util.*" %>   
<%
	List<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style type="text/css">
*{margin:0; paddin:0;}
html,body{width:100%; height: 100%;}
table,th,td{
    border: 1px solid black;
    border-collapse: collapse;
}
h1,th,td{text-align: center;}
.table_container{
	margin-left:auto;
	margin-right:auto;
	width:90%;
	display:flex;
	justify-content: center; 
}
table{
	width: 100%;
}
.acontainer>a,a:checked{
	color: white;
	background-color:blue;
	text-decoration: none;
	width: auto;
}
.acontainer{
	display: flex;
	flex-direction: row;
	justify-content: space-around;
}
</style>
</head>
<body>
	<h1>리스트</h1>
	<div class="table_container">
	
	<%
	if(list!=null){
	for(int i=0;i<list.size();i++){
		if(i==0){
			%><table>
			<tr>
			<th>no</th>
			<th>제목</th>
			</tr>
		<%	
		}
	BoardVO vo= list.get(i);
	%>
	<tr>
		<td><%=""+vo.getIboard()%></td>
		<td><a href="detail?no=<%=vo.getIboard()%>"><%=vo.getTitle()%></a></td>
	</tr>
	<%}}%>
	</table>
	</div>
	<div class="acontainer">
		<a href="write">글쓰기</a>
		<a href="delete">삭제하기</a>
		<a href="update">글수정</a>
	</div>
	
	
	
</body>
</html>