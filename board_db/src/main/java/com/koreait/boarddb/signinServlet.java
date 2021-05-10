package com.koreait.boarddb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.koreait.boarddb.MemberDao;
import java.util.regex.*;
@WebServlet("/signin")
public class signinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/signin.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		int  age=Integer.parseInt(request.getParameter("age"));
		
		if(id.isEmpty()||password.isEmpty()||name.isEmpty()) {
			request.setAttribute("error", "모든항목을 빠짐없이 입력해 주시기 바랍니다!");
			request.getRequestDispatcher("/WEB-INF/jsp/signin.jsp").forward(request, response);
			return;
		}
		if(MemberDao.Search(id)!=null) {
			request.setAttribute("error", "이미 존재하는 아이디입니다!");
			request.getRequestDispatcher("/WEB-INF/jsp/signin.jsp").forward(request, response);
			return;
		}
		String s= "([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])";
		String a= "([a-z].*[A-Z])|([A-Z].*[a-z])";
		Pattern p_s = Pattern.compile(s);
		Pattern p_a = Pattern.compile(a);
		Matcher m_s=p_s.matcher(password);
		Matcher m_a=p_a.matcher(password);
		if(!(m_s.find()&&m_a.find())) {
			request.setAttribute("error", "비밀번호는 숫자,특수문자를 포함하고 영대소문자가 적어도 하나씩은 포함되어야합니다!");
			request.getRequestDispatcher("/WEB-INF/jsp/signin.jsp").forward(request, response);
			return;
		}
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		MemberDao.insert(member);
		request.setAttribute("member", member);
		request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	}
}
