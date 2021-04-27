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

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String go="WEB-INF/jsp/detail.jsp";
		List<BoardVO> list = Database.list;
		if(list!=null) {
			for(int i=0;i<list.size();i++) {
				BoardVO vo=list.get(i);
				if(vo.getIboard()==Integer.parseInt(request.getParameter("no"))) {
					request.setAttribute("data_vo", vo);
					break;
				}
			}
		}
		RequestDispatcher rd= request.getRequestDispatcher(go);
		rd.forward(request, response);
	}
}
