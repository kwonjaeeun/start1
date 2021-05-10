package com.koreait.boarddb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/write")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/write.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO vo= new BoardVO();
		BoardDao dao=new BoardDao();
		vo.setTitle(request.getParameter("title"));
		vo.setCtnt(request.getParameter("ctnt"));
		MemberVO vv=(MemberVO) request.getSession().getAttribute("user");
		if(vv==null) {
			request.setAttribute("error", "로그인이 필요합니다");
			request.getRequestDispatcher("/WEB-INF/jsp/write.jsp").forward(request, response);
			return;
		}
		vo.setId(vv.getId());
		dao.insert(vo);
		response.sendRedirect("/list");
	}
}
