package com.koreait.board5.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.board5.MyUtil;

@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtil.openJSP("user/userlogin", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ckpw=request.getParameter("upw");
		
		UserVO vo= new UserVO();
		vo.setUid(request.getParameter("uid"));
		vo=UserDAO.selUser(vo);
		if(vo==null) {
			request.setAttribute("errmsg", "아이디를 확인해 주세요");
			MyUtil.openJSP("user/userlogin", request, response);
			return;
		}else if(BCrypt.checkpw(ckpw, vo.getUpw())) {
			vo.setUpw(null);
			HttpSession hs= request.getSession();
			hs.setAttribute("loginUser", vo);
			response.sendRedirect("/board/list");
			return;
		}else {
			request.setAttribute("errmsg", "비밀번호를 확인해 주세요");
			MyUtil.openJSP("user/userlogin", request, response);
			return;
		}
	

	}
}
