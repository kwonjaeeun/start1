package com.koreait.boardver4.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.boardver4.MyUtil;
import com.koreait.boardver4.user.UserVO;


@WebServlet("/board/write")
public class writeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		UserVO loginSuccess = (UserVO) hs.getAttribute("loginSuccess");
		if (loginSuccess == null) {
			response.sendRedirect("/user/login");
		}
		MyUtil.openJSP("/board/write", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVO user = MyUtil.getUser("loginSuccess", request);
		BoardVO vo= new BoardVO();
		vo.setTitle(request.getParameter("title"));
		vo.setCtnt(request.getParameter("ctnt"));
		vo.setIuser(user.getIuser());
		
		BoardDAO.insert(vo);
		response.sendRedirect("list");
		
	}

}
