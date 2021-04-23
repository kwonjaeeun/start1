package com.dev.dao;

import java.sql.*;
import java.util.ArrayList;

import com.dev.vo.MemberVO;

public class MemberDAO {

	private static MemberDAO dao=new MemberDAO();
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		return dao;
	}
	public Connection connect() {
		Connection conn =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3308/java","root","koreait");
		}catch (Exception ex) {
			System.out.println("오류발생1:"+ex);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch (Exception e) {
				System.out.println("오류발생"+e);
			}
		}
		close(conn,pstmt);
		
	}
	public void close(Connection conn, PreparedStatement ps) {
		if(ps!=null) {
			try {
				ps.close();
			}catch (Exception ex) {
				System.out.println("오류발생:"+ex);
			}
		}
		if(conn!=null) {
			try {
			conn.close();
			}catch (Exception ex) {
				System.out.println("오류발생:"+ex);
			}
		}
		
	}
	public void  memberInsert(MemberVO member) {

		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("insert into member values(?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getMail());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}	
	
	public MemberVO memberSearch(String id) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberVO member=null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				member=new MemberVO();
				member.setId(rs.getString(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setMail(rs.getString(4));
			}
		}catch (Exception e) {
			System.out.println("오류발생"+e);
		}finally {
			close(conn,pstmt,rs);
		}
		return member;
	}

	public void  memberUpdate(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("update member set passwd=?,name=?,mail=? where id=?)");
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getMail());
			pstmt.setString(4, member.getId());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}	
	
	

	public void  memberDelete(String id) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("delete from member where id=?)");
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}	
	
	public ArrayList<MemberVO> memberList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		MemberVO member=null;
		try {
			conn=connect();
			pstmt=conn.prepareStatement("select * from member");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				member=new MemberVO();
				member.setId(rs.getString(1));	
				member.setPasswd(rs.getString(2));	
				member.setName(rs.getString(3));	
				member.setMail(rs.getString(4));	
				list.add(member);
			}
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt,rs);
		}
		return list;
	}
	
}
