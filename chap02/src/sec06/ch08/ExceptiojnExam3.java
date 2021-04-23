package sec06.ch08;

import java.sql.*;

public class ExceptiojnExam3 {

	public static void main(String[] args) {
		//싱글톤:객체 1개만 만들어지도록 유도
		DbUtils du = DbUtils.getInstance();
		Connection con=du.getCon();
	}

}
class DbUtils{
	private DbUtils(){}
	private static DbUtils dbutils;
	public static DbUtils getInstance() {
		if(dbutils==null) {
			dbutils=new DbUtils();
		}
		return dbutils;
	}
	Connection getCon() {
		Connection con=null;
		try {
			final String driver="com.mysql.cj.jdbc.Driver";
			final String URL="jdbc:mysql://localhost:3308/java";
			final String USERNAME="root";
			final String PASSWORD="koreait";
			
			Class.forName(driver);
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("접속성공~!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	};
}