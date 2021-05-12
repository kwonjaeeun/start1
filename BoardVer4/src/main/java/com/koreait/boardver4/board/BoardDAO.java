package com.koreait.boardver4.board;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.koreait.boardver4.MyUtil;

public class BoardDAO {
	public static int insert(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =MyUtil.connect();
			pstmt =conn.prepareStatement("insert into t_board(title,ctnt,iuser) values(?,?,?)");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setInt(3, vo.getIuser());
		
			return pstmt.executeUpdate();
		}catch (Exception ex) { 
			System.out.println("오류발생:"+ex);
			return 0;
		}finally {
			MyUtil.close(conn,pstmt);
		}
	}

	public static ArrayList<BoardVO> printlist() {
		ArrayList<BoardVO> list= new ArrayList<BoardVO>();
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		BoardVO vo=null;
		try { 
			conn=MyUtil.connect();
			pstmt=conn.prepareStatement("select A.iboard,A.title,A.ctnt,B.unm from t_board A LEFT JOIN t_user B ON A.iuser=B.iuser order by a.iboard desc");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				vo=new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setUnm(rs.getString(4));
				list.add(vo);
			}
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			MyUtil.close(conn,pstmt,rs);
		}
		return list;
	}

	public static BoardVO printdetail(int iboard) {
		BoardVO vo=null;
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		try {
			conn=MyUtil.connect();
			pstmt=conn.prepareStatement("select A.iboard,A.title,A.ctnt,B.unm,A.Regdt,A.iuser from t_board A LEFT JOIN t_user B ON A.iuser=B.iuser where iboard=?");
			pstmt.setInt(1, iboard);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				vo=new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setUnm(rs.getString(4));
				vo.setRegdt(rs.getString(5));
				vo.setIuser(rs.getInt(6));
			}
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
		}finally {
			MyUtil.close(conn,pstmt,rs);
		}
		return vo;
	}

	public static int delBoard(BoardVO vo) {
		Connection conn=null;
		PreparedStatement pstmt =null;
		try {
			conn=MyUtil.connect();
			pstmt=conn.prepareStatement("delete from t_board where iboard=? and iuser=? ");
			pstmt.setInt(1, vo.getIboard());
			pstmt.setInt(2, vo.getIuser());
			return pstmt.executeUpdate();
		}catch (Exception ex) {
			System.out.println("오류발생:"+ex);
			return 0;
		}finally {
			MyUtil.close(conn,pstmt);
		}
	}

	public static int modBoard(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =MyUtil.connect();
			pstmt =conn.prepareStatement("update t_board set title=?,ctnt=? where iboard=? and iuser=?");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setInt(3, vo.getIboard());
			pstmt.setInt(4, vo.getIuser());
			return pstmt.executeUpdate();
		}catch (Exception ex) { 
			System.out.println("오류발생:"+ex);
			return 0;
		}finally {
			MyUtil.close(conn,pstmt);
		}
		
	}
}
