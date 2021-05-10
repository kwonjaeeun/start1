package com.dev.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberInsertController implements Controller {
	public void execute(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		String id=request.getParameter("id");
		String password=request.getParameter("passwd");
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		
		if(id.isEmpty()||password.isEmpty()||name.isEmpty()||mail.isEmpty()) {
			request.setAttribute("error", "紐⑤뱺�빆紐⑹쓣 鍮좎쭚�뾾�씠 �엯�젰�빐 二쇱떆湲� 諛붾엻�땲�떎!");
			HttpUtill.forward(request, response, "/memberInsert.jsp");
			return;
		}
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPasswd(password);
		member.setName(name);
		member.setMail(mail);
		MemberService service = MemberService.getInstance();
		service.memberInsert(member);
		request.setAttribute("id", id);
		HttpUtill.forward(request, response, "/result/memberInsertOutput.jsp");
	}
}
