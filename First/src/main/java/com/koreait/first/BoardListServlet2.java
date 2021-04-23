package com.koreait.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/list2")
public class BoardListServlet2 extends HttpServlet{
	private static final long serialVersionUID=1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String jsp = "WEB-INF/jsp/list2.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(jsp);
		rd.forward(req, resp);
		
	}

}
