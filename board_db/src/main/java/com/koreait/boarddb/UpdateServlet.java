package com.koreait.boarddb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao=new BoardDao();
		request.setAttribute("data", dao.Search(Integer.parseInt(request.getParameter("no"))));
		request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BoardDao dao=new BoardDao();
		BoardVO vo= new BoardVO();
		vo.setIboard(Integer.parseInt(request.getParameter("iboard")));
		vo.setCtnt(request.getParameter("ctnt"));
		vo.setTitle(request.getParameter("title"));
		dao.update(vo);	
		response.sendRedirect("/list");
	}
}
