package com.edu.test;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out =resp.getWriter();
		out.print("<html><head><title>Query문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET방식으로 요청되었습니다</h1>");
		
		String name =req.getParameter("name");
		out.print("이름: "+name + "<br/>");
		out.print("</body></html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out =resp.getWriter();
		out.print("<html><head><title>질의 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST방식으로 요청되었습니다</h1>");
		req.setCharacterEncoding("UTF-8");
		String name =req.getParameter("name");
		out.print("이름: "+name + "<br/>");
		out.print("</body></html>");
		out.close();
	
	}
}