package com.koreait.board5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.koreait.board5.user.UserVO;



public class MyUtil{
	public static void openJSP(String nm,HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		req.getRequestDispatcher("/WEB-INF/view/"+nm+".jsp").forward(req, res);
	}
	
	public static Connection connect() {
		Connection conn =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mariadb://localhost:3308/boardver4","root","koreait");
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

	
	public static int ToInt(String str) {
		return Integer.parseInt(str);
	}
	public static int ToIntParam(String str,HttpServletRequest req) {
		return Integer.parseInt(req.getParameter(str));
	}
	public static UserVO getUser(String str,HttpServletRequest req) {
		UserVO user= (UserVO)req.getSession().getAttribute(str);
		return user;
	}
	
	
}