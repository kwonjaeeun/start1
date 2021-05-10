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
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtil.openJSP("user/login", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			UserVO param=new UserVO();
			param.setUid(request.getParameter("uid"));
			param.setUpw(request.getParameter("upw"));
			switch(UserDao.Search(param)) {
			case 0:
				
				break;
			case 1:
				HttpSession session =request.getSession();
				session.setAttribute("user", param);
				request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
				break;
			case 2:
				request.setAttribute("error", "없는 아이디입니다.");
				request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
				break;
			case 3:
				request.setAttribute("error", "비밀번호가 잘 못 입력 되었습니다.");
				
				break;
				
			}
	
	}

}
