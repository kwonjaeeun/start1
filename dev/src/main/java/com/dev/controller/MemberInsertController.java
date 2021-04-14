package com.dev.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberInsertController implements Controller {
	public void execute(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		
		if(id.isEmpty()||passwd.isEmpty()||name.isEmpty()||mail.isEmpty()) {
			request.setAttribute("error", "모든항목을 빠짐없이 입력해 주시기 바랍니다!");
			HttpUtill.forward(request, response, "/memberInsert.jsp");
			return;
		}
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		member.setMail(mail);
		MemberService service = MemberService.getInstance();
		service.memberInsert(member);
		request.setAttribute("id", id);
		HttpUtill.forward(request, response, "/result/memberInsertOutput.jsp");
	}
}
