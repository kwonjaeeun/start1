package com.koreait.board5.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.koreait.board5.MyUtil;

public class UserDAO {
	public static UserVO selUser(UserVO param){
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		UserVO result=null;
			
		try {
			con=MyUtil.connect();
			ps=con.prepareStatement("Select iuser, uid,upw,unm from t_user where uid=?");
			ps.setString(1, param.getUid());
			rs=ps.executeQuery();
			if(rs.next()) {
				int iuser= rs.getInt("iuser");
				String uid= rs.getString("uid");
				String upw= rs.getString("upw");
				String unm= rs.getString("unm");
				result=new UserVO();
				result.setIuser(iuser);
				result.setUid(uid);
				result.setUpw(upw);
				result.setUnm(unm);
			}
			return result;
		}catch (Exception e) {
			e.printStackTrace();
			return result;
		}
	}
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
}
