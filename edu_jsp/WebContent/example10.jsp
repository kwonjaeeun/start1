<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AAA</title>
</head>
<body>
	<% if(request.getMethod().equals("POST")){ %>
	<%
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
		
		//유효성 체크
		if(id.isEmpty()||pwd.isEmpty()){
			request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요!");
			RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
			rd.forward(request, response);
			return;
		}
		//로그인 처리
		if(session.isNew()||session.getAttribute("id")==null){
			session.setAttribute("id", id);
			out.print("로그인 완료!");
		}else{
			out.print("이미 로그인!!");
		}	
	%>
	<%=id %>/<%=pwd %>
	<%
	}else if(request.getMethod().equals("GET")){
		if(session!=null&&session.getAttribute("id")!=null){
			session.invalidate();
			out.print("로그아웃 완료!");
		}else{
			out.print("로그인상태가 아닙니다.");
		}
	}
	%>
	<%RequestDispatcher rd= request.getRequestDispatcher("logInOut.jsp");
	rd.forward(request, response);
	%>
</body>
</html>