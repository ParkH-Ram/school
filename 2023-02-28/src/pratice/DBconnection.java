package pratice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {
	
	private Connection conn;
	private static final String USERNAME = "root";  // mysql 접속 아이디
	private static final String PASSWORD = "phr8615973";	// 비밀번호
	private static final String URL = "jdbc:mysql://localhost:3306/testTB";  // 끝에 접속할 db명
	
	public void DBconn() {
		try {
			System.out.println("생성자");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("db 연결 성공");
		} catch(Exception e) {
			System.out.println("DB 연결 오류"+e.getMessage());
			 try {
				 conn.close();
			 } catch (SQLException e1) { }
		}
	}

}
