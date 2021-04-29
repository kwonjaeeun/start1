package com.koreait.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class BoardUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO vo= Database.db.get(Integer.parseInt(request.getParameter("no")));
		request.setAttribute("vo", vo);
		request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO vo= Database.db.get(Integer.parseInt(request.getParameter("no")));
		vo.setTitle(request.getParameter("title"));
		vo.setCtnt(request.getParameter("ctnt"));
		response.sendRedirect("/detail?no="+request.getParameter("no"));
	}

}
