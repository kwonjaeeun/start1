package com.koreait.boardver4.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.boardver4.MyUtil;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getSession().getAttribute("loginSuccess")!=null) {
			request.getSession().setAttribute("loginSuccess", null);
		}
		MyUtil.openJSP("user/login", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserVO param = new UserVO();
		param.setUid(request.getParameter("uid"));
		param.setUpw(request.getParameter("upw"));
		String errmsg = null;
		int result = UserDao.Search(param);
		if (result == 1) {
			HttpSession session = request.getSession();			
			session.setAttribute("loginSuccess", param);
			response.sendRedirect("/board/list");
			return;
		}
		switch (result) {
		case 0:
			errmsg = "에러가 발생 하였습니다.";
			break;
		case 2:
			errmsg = "아이디를 확인해 주세요.";
			break;
		case 3:
			errmsg = "비밀번호를 확인해 주세요.";
			break;
		}
		request.setAttribute("errmsg", errmsg);
		doGet(request, response);
	}

}
