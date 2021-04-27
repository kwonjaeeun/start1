package com.koreait.board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class BoardListDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String go="WEB-INF/jsp/delete.jsp";
		RequestDispatcher rd= request.getRequestDispatcher(go);
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iboard;
		if(request.getParameter("no")!=null) {
			iboard=request.getParameter("no");
		}else {
			iboard=request.getParameter("iboard");
		}
		BoardVO vo_r = null;
			for(int i=0;i<Database.list.size();i++) {
				BoardVO vo=Database.list.get(i);
				if(vo.getIboard()==Integer.parseInt(iboard)) {
					vo_r=Database.list.remove(i);
					System.out.println("삭제");
					break;
				}
			}
			if(vo_r==null) {
				 request.setAttribute("error", "없는 번호입니다 다시 입력 바랍니다!");
				  request.getRequestDispatcher("WEB-INF/jsp/delete.jsp").forward(request, response); 
				  return;
			}
		response.sendRedirect("/list");
	}

}
