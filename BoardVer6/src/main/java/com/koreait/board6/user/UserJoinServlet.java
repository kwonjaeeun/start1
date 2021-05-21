package com.koreait.board6.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board6.MyUtil;

@WebServlet("/user/join")
public class UserJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtil.openJSP("join", "user/userjoin", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uid=request.getParameter("uid");
		String upw=request.getParameter("upw");
		String unm=request.getParameter("unm");
		int gender=MyUtil.ToIntParam("gender", request);
		
		System.out.println(uid);
		System.out.println(upw);
		System.out.println(unm);
		System.out.println(gender);
		//int result= UserDAO.join();
		int result=1;
		PrintWriter pw = response.getWriter();
		pw.append(String.format("{\"result\":%d}",result));
	
	}

}
