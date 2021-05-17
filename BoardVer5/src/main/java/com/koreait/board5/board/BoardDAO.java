package com.koreait.board5.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.koreait.board5.MyUtil;

public class BoardDAO {
	public static int insert(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("insert into t_board(title,ctnt,iuser) values(?,?,?)");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setInt(3, vo.getIuser());

			return pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
			return 0;
		} finally {
			MyUtil.close(conn, pstmt);
		}
	}

	public static int insertComment(CommentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("insert into comment_table(ctnt,iuser,iboard) values(?,?,?)");
			pstmt.setString(1, vo.getCtnt());
			pstmt.setInt(2, vo.getIuser());
			pstmt.setInt(3, vo.getIboard());
			return pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
			return 0;
		} finally {
			MyUtil.close(conn, pstmt);
		}
	}

	public static ArrayList<BoardVO> printlist() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement(
					"select A.iboard,A.title,A.ctnt,B.unm from t_board A LEFT JOIN t_user B ON A.iuser=B.iuser order by a.iboard desc");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setIboard(rs.getInt(1));
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

	public static ArrayList<CommentVO> printComments(int iboard) {

		ArrayList<CommentVO> list = new ArrayList<CommentVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CommentVO vo = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("select A.ict, A.ctnt ,A. iuser, A.iboard, A.regdt ,B.unm from comment_table A LEFT JOIN t_user B ON A.iuser=B.iuser where iboard=?");
			pstmt.setInt(1,iboard);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new CommentVO();
				vo.setIct(rs.getInt(1));
				vo.setCtnt(rs.getString(2));
				vo.setIuser(rs.getInt(3));
				vo.setIboard(rs.getInt(4));
				vo.setRegdt(rs.getString(5));
				vo.setUnm(rs.getString(6));
				list.add(vo);
			}
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
		} finally {
			MyUtil.close(conn, pstmt, rs);
		}
		return list;
	}

	public static BoardVO printdetail(int iboard) {
		BoardVO vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement(
					"select A.iboard,A.title,A.ctnt,B.unm,A.Regdt,A.iuser from t_board A LEFT JOIN t_user B ON A.iuser=B.iuser where iboard=?");
			pstmt.setInt(1, iboard);
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

	public static int delBoard(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("delete from t_board where iboard=? and iuser=?");
			pstmt.setInt(1, vo.getIboard());
			pstmt.setInt(2, vo.getIuser());
			return pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
			return 0;
		} finally {
			MyUtil.close(conn, pstmt);
		}
	}

	public static int modBoard(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("update t_board set title=?,ctnt=? where iboard=? and iuser=?");
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setInt(3, vo.getIboard());
			pstmt.setInt(4, vo.getIuser());
			return pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
			return 0;
		} finally {
			MyUtil.close(conn, pstmt);
		}

	}

	public static int delCommend(CommentVO param) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = MyUtil.connect();
			pstmt = conn.prepareStatement("delete from comment_table where ict=? and iuser=?");
			pstmt.setInt(1, param.getIct());
			pstmt.setInt(2, param.getIuser());
			return pstmt.executeUpdate();
		} catch (Exception ex) {
			System.out.println("오류발생:" + ex);
			return 0;
		} finally {
			MyUtil.close(conn, pstmt);
		}
		
	}

}
