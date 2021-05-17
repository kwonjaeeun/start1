package com.koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.koreait.board5.MyUtil;


@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MyUtil.getUser("loginUser", request)==null) {
			response.sendRedirect("/user/login");
			return;
		}
		request.setAttribute("data",BoardDAO.printdetail(MyUtil.ToIntParam("iboard", request)));
		request.setAttribute("comments",BoardDAO.printComments(MyUtil.ToIntParam("iboard", request)));
		MyUtil.openJSP("/board/detail", request, response);
	}
}
