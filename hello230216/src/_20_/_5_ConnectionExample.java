package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _5_ConnectionExample {
	public static void main(String[]args) {
		
		try { 
			Class.forName("oracle.jdbc.OracleDriver");
		
		
			try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle")) {
				System.out.println("연결 성공");

				
			}catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("연결 끊김");
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		} 
			
		
		
		
	}
}
