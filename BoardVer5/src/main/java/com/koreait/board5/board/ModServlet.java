package com.koreait.board5.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.koreait.board5.MyUtil;


@WebServlet("/board/mod")
public class ModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (MyUtil.getUser("loginUser", request)==null) {
			response.sendRedirect("/user/login");
			return;
		}
		BoardVO vv=BoardDAO.printdetail(MyUtil.ToIntParam("iboard", request));
		if(MyUtil.getUser("loginUser", request).getIuser()!=vv.getIuser()) {
			response.sendRedirect("/board/list");
			return;
		}
		request.setAttribute("data",vv);
		MyUtil.openJSP("/board/mod", request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardVO vo= new BoardVO();
		vo.setTitle(request.getParameter("title"));
		vo.setCtnt(request.getParameter("ctnt"));
		vo.setIboard(MyUtil.ToIntParam("iboard", request));
		vo.setIuser(MyUtil.getUser("loginUser", request).getIuser());
		BoardDAO.modBoard(vo);
		response.sendRedirect("detail?iboard="+MyUtil.ToIntParam("iboard", request));
	}

}
