package com.koreait.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class BoardListUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String go="WEB-INF/jsp/update.jsp";
		RequestDispatcher rd= request.getRequestDispatcher(go);
		rd.forward(request, response);	
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String iboard=request.getParameter("iboard");
		String title=request.getParameter("title");
		String ctnt=request.getParameter("ctnt");
		  if(iboard.isEmpty()||title.isEmpty()||ctnt.isEmpty()) {
			  request.setAttribute("error", "모든항목을 빠짐없이 입력해 주시기 바랍니다!");
			  request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response); 
			  return;
		}
		boolean isNumeric = iboard.chars().allMatch(Character::isDigit);
		if(isNumeric==false) {
			 request.setAttribute("error", "no에는 숫자값을 입력해주시기 바랍니다!");
			  request.getRequestDispatcher("WEB-INF/jsp/update.jsp").forward(request, response); 
			  return;
		} 
	
		for(int i=0;i<Database.list.size();i++) {
			BoardVO vo=Database.list.get(i);
			if(vo.getIboard()==Integer.parseInt(iboard)) {
				vo.setIboard(Integer.parseInt(iboard));
				vo.setTitle(title);
				vo.setCtnt(ctnt);
				Database.list.set(i,vo);
				break;
			}
		}
		response.sendRedirect("/list");
		
	}
}
