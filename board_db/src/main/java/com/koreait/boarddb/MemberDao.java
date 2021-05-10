package com.koreait.boarddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import com.koreait.boarddb.BoardVO;

public class MemberDao {

	public static Connection connect() {
		Connection conn =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mariadb://localhost:3308/boardver","root","koreait");
		}catch (ClassNotFoundException e) {
			System.out.println("cnf-e");
		} catch (SQLException e) {
			System.out.println("sql-e");
		}
		return conn;
	}
	public static void close(Connection conn, PreparedStatement ps) {
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
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch (Exception e) {
				System.out.println("오류발생"+e);
			}
		}
		close(conn,ps);
	}
	public static void insert(MemberVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("insert into member(id,passwd,username,age) values(?,?,?,?)");
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}
	public static void delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("delete from member where Id=?");
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}

	}
	public static MemberVO Search(String id) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberVO vo=null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo= new MemberVO();
				vo.setId(rs.getString(1));
				vo.setPassword(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setAge(rs.getInt(4));
				return vo;
			}
		}catch (Exception e) {
			System.out.println("오류발생"+e);
		}finally {
			close(conn,pstmt,rs);
		}
		return vo;
	}
	public static void update(MemberVO vo) {
		
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("update t_board set passwd=?,username=?,age=? where Iboard=?");
			pstmt.setString(1, vo.getPassword());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}
}
