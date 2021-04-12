package com.edu_jsp.biz;

import com.edu_jsp.beans.Member;
import com.edu_jsp.dao.MemberDAO;

public class MemberService {
	MemberDAO dao=new MemberDAO();
	public void memberInsert(Member member) {
		dao.insertMember(member);
	}
}
