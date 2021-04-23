package com.dev.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;


public class MemberUpdateController implements Controller{
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		
		
		if(id.isEmpty()||passwd.isEmpty()||name.isEmpty()||mail.isEmpty()) {
			request.setAttribute("error", "모든 항목을 빠짐없이 입력해주세요");
			HttpUtill.forward(request, response, "/memberUpdate.jsp");
			return;
		}
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		member.setMail(mail);
		
		MemberService service = MemberService.getInstance();
		service.memberUpdate(member);
		request.setAttribute("id",id);
		HttpUtill.forward(request, response, "/result/memberUpdateOutput.jsp");
	}
}
