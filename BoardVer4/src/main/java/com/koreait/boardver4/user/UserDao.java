package com.koreait.boardver4.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.koreait.boardver4.user.*;
import com.koreait.boardver4.MyUtil;
public class UserDao {

	public static void insert(UserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn =MyUtil.connect();
			pstmt =conn.prepareStatement("insert into t_user(uid,upw,unm,gender) values(?,?,?,?)");
			pstmt.setString(1, vo.getUid());
			pstmt.setString(2, vo.getUpw());
			pstmt.setString(3, vo.getUnm());
			pstmt.setInt(4, vo.getGender());
			pstmt.executeUpdate();
		}catch (Exception ex) { 
			System.out.println("오류발생:"+ex);
		}finally {
			MyUtil.close(conn,pstmt);
		}
	}
	//성공:1 없:2 비번: 3 에러:0
	public static int Search(UserVO param) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=MyUtil.connect();
			pstmt = conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1,param.getUid());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				UserVO vo= new UserVO();
				vo.setUid(rs.getString(2));
				vo.setUpw(rs.getString(3));
				if(vo.getUpw().equals(param.getUpw())) {
					return 1;
				}else {
					return 3;
				}
					
			}else {
				return 2;
			}
		}catch (Exception e) {
			System.out.println("오류발생"+e);
			return 0;
		}finally {
			MyUtil.close(conn,pstmt,rs);
		}
	}
}
