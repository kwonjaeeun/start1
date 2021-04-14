package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DbUtils {
	private static DbUtils util= new DbUtils();
	private DbUtils() {}
	public static DbUtils getInstance() {
		return util;
	}
	
	public Connection getcon() throws Exception{
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url,"root","koreait");
		return con;
	}
	public void closeCon(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) {try{rs.close();}catch (Exception e) {}}
		if(ps!=null) {try{ps.close();}catch (Exception e) {}}
		if(con!=null) {try{con.close();}catch (Exception e) {}}
	}  
	
}
