package com.dev.controller;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;

public class MemberDeleteController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String id =request.getParameter("id") ;
		MemberService service=MemberService.getInstance();
		service.memberDelete(id);
		HttpUtill.forward(request, response, "/result/memberDeleteOutput.jsp");
	}
}
