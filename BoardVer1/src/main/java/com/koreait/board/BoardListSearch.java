package com.koreait.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class BoardListSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String go="WEB-INF/jsp/update.jsp";
		RequestDispatcher rd= request.getRequestDispatcher(go);
		rd.forward(request, response);	
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iboard=request.getParameter("iboard");
		BoardVO vo = null;
		boolean pass=true;
		 if(iboard.isEmpty()) {
			  request.setAttribute("error", "모든항목을 빠짐없이 입력해 주시기 바랍니다!");
			  request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response); 
			  return;
		}
		for(int i=0;i<Database.list.size();i++) {
			vo=Database.list.get(i);
			if(vo.getIboard()==Integer.parseInt(iboard)) {
				pass=false;
				break;
			}
		}
		if(pass) {
			request.setAttribute("error", "없는 번호입니다 다시 입력 바랍니다!");
			request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response); 
			return;
		}
		request.setAttribute("VO", vo);
		System.out.println(vo.getTitle());
		String go="WEB-INF/jsp/update.jsp";
		request.getRequestDispatcher(go).forward(request, response);
	}

}
