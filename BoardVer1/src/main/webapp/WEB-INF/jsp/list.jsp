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
<link rel="stylesheet" type="text/css" href="../css/list.css">
<title>LIST</title>
</head>
<body>
	<img src="../css/pic/mylist.jpg">
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