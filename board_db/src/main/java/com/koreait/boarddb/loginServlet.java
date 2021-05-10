package com.koreait.boarddb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("user")!=null) {
			request.getSession().setAttribute("user",null);
		}
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO vo=MemberDao.Search(id);
		if(vo!=null) {
			if(vo.getPassword().equals(password)) {
				HttpSession session =request.getSession();
				session.setAttribute("user", vo);
				request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
				return;
			}
		}else {
			request.setAttribute("error", "없는 아이디입니다.");
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
			return;
		}
	}
}
