package com.koreait.board6.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.koreait.board6.MyUtil;
import com.koreait.board6.board.BoardVO;

public class BoardDAO {
	public static ArrayList<BoardVO> printlist(BoardVO param) {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement(
					"select A.iboard,A.title,A.ctnt,B.unm from t_board A inner JOIN t_user B ON A.iuser=B.iuser where title like ? order by A.iboard desc limit ? , ? ");
			pstmt.setString(1, "%"+param.getSearch()+"%");
			pstmt.setInt(2, param.getsIdx());
			pstmt.setInt(3, param.getPage());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setIboard(rs.getInt("a.iboard"));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setUnm(rs.getString(4));
				list.add(vo);
			}
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
		} finally {
			MyUtil.close(conn, pstmt, rs);
		}
		return list;
	}

	public static int getAllPage(BoardVO param) {

		int result=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement(
					"select ceil(count(*)/?) from t_board where title like ?");
			pstmt.setInt(1, param.getPage());
			pstmt.setString(2, "%"+param.getSearch()+"%");
			rs = pstmt.executeQuery();
			rs.next();
			result=rs.getInt(1);
			System.out.println(result);
			return result;
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
		} finally {
			MyUtil.close(conn, pstmt, rs);
		}
		return result;
	}

	public static BoardVO selBoard(BoardVO param) {
		BoardVO vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement(
					"select A.iboard,A.title,A.ctnt,B.unm,A.Regdt,A.iuser from t_board A LEFT JOIN t_user B ON A.iuser=B.iuser where iboard=?");
			pstmt.setInt(1, param.getIboard());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setUnm(rs.getString(4));
				vo.setRegdt(rs.getString(5));
				vo.setIuser(rs.getInt(6));
			}
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
		} finally {
			MyUtil.close(conn, pstmt, rs);
		}
		return vo;
	}
	
}
