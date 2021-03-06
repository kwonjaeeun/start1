package com.koreait.boarddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import com.koreait.boarddb.BoardVO;

public class BoardDao {

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

	public static void insert(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("insert into t_board(title,ctnt,id) values(?,?,?)");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setString(3, vo.getId());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}
	public static void delete(int iboard) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("delete from t_board where Iboard=?");
			pstmt.setInt(1,iboard);
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}

	}
	public static BoardVO Search(int iboard) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardVO vo=null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("select * from t_board where iboard=?");
			pstmt.setInt(1,iboard);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setRegdt(rs.getString(4));
				vo.setCnt(rs.getInt(5));
				vo.setId(rs.getString(6));
				return vo;
			}
		}catch (Exception e) {
			System.out.println("오류발생"+e);
		}finally {
			close(conn,pstmt,rs);
		}
		return vo;
	}
	public static void cntUp(int iboard,int cnt) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("update t_board set cnt=? where Iboard=?");
			pstmt.setInt(1,++cnt);
			pstmt.setInt(2, iboard);
			pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("오류발생"+e);
		}finally {
			close(conn,pstmt);
		}	
	}
	public static void update(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =connect();
			pstmt =conn.prepareStatement("update t_board set Title=?,ctnt=? where Iboard=?");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setInt(3, vo.getIboard());
			pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt);
		}
	}
	

	public static ArrayList<BoardVO> BoardList(){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		BoardVO vo=null;
		try {
			conn=connect();
			pstmt=conn.prepareStatement("select * from t_board");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				vo=new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setRegdt(rs.getString(4));
				vo.setCnt(rs.getInt(5));
				vo.setId(rs.getString(6));
				
				list.add(vo);
			}
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			close(conn,pstmt,rs);
		}
		return list;
	}
	
}
