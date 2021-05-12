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


@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MyUtil.getUser("loginSuccess", request)==null) {
			response.sendRedirect("/user/login");
		}
		request.setAttribute("data",BoardDAO.printdetail(MyUtil.ToIntParam("iboard", request)));
		MyUtil.openJSP("/board/detail", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
