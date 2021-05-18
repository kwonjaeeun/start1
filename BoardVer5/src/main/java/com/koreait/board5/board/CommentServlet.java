package com.koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board5.MyUtil;


@WebServlet("/board/cmt")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MyUtil.getUser("loginUser", request)==null) {
			response.sendRedirect("/user/login");
			return;
		}
		
		int iuser=MyUtil.getUser("loginUser", request).getIuser();
		int iboard=MyUtil.ToIntParam("iboard", request);
		int ict=MyUtil.ToIntParam("ict", request);
		
		CommentVO co= new CommentVO();
		co.setCtnt(request.getParameter("comment"));
		co.setIuser(MyUtil.getUser("loginUser", request).getIuser());
		
		if(ict!=0) {
			co.setIct(ict);
			BoardDAO.updcmt(co);
		}else {			
			co.setIboard(MyUtil.ToIntParam("iboard", request));
			BoardDAO.insertComment(co);
		}
		response.sendRedirect("detail?iboard="+MyUtil.ToIntParam("iboard", request));
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iuser=MyUtil.getUser("loginUser", request).getIuser();
		int iboard=MyUtil.ToIntParam("iboard", request);
		int ict=MyUtil.ToIntParam("ict", request);
		CommentVO param= new CommentVO();
		param.setIct(ict);
		param.setIuser(iuser);
		BoardDAO.delCommend(param);
		response.sendRedirect("detail?iboard="+iboard);
	}
}
