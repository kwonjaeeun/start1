package com.koreait.boarddb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int iboard=Integer.parseInt(request.getParameter("no"));
		BoardVO vo= BoardDao.Search(iboard);
		request.setAttribute("data",vo );
		BoardDao.cntUp(iboard, vo.getCnt());
		request.getRequestDispatcher("WEB-INF/jsp/detail.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
