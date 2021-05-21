package com.koreait.board6.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.koreait.board6.MyUtil;


@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtil.openJSP("디테일", "board/detail", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard=MyUtil.ToIntParam("iboard", request);
		System.out.println("iboard:"+iboard);
		BoardVO param = new BoardVO();
		param.setIboard(iboard);
		BoardVO result= BoardDAO.selBoard(param);
		PrintWriter pw =response.getWriter();
		Gson gson= new Gson();
		String json = gson.toJson(result);
		pw.append(json);
		
				/*
		 * pw.append("{\"iboard\":") .append(String.valueOf(result.getIboard()))
		 * .append(",\"title\":") .append("\"") .append(result.getTitle())
		 * .append("\",\"ctnt\":\"") .append(result.getCtnt()) .append("\"}");
		 */
		
	}

}
