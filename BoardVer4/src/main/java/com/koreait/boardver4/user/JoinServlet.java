package com.koreait.boardver4.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.boardver4.MyUtil;


@WebServlet("/user/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtil.openJSP("user/join", request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uid");
		String upw=request.getParameter("upw");
		String unm=request.getParameter("unm");
		String gender=request.getParameter("gender");
		String hashedUpw = BCrypt.hashpw(upw, BCrypt.gensalt());
		UserVO vo= new UserVO();
		vo.setUid(uid);
		vo.setUpw(hashedUpw);
		vo.setUnm(unm);
		vo.setGender(MyUtil.ToInt(gender));
		
		UserDao.insert(vo);
		response.sendRedirect("login");
		
	}

}
