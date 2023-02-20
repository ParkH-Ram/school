package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 4개다 java.sql에 있고 sql에 있는걸 총칭 해서 jdbc라 부른다 (framwork)안에 있는 클래스 와 인터페이스

public class _6_UserInserExample {
	public static void main(String[]args) {
		Connection conn = null;
		try { 
			
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
		
			
			//DB와 연결											ip port번호 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle");
			System.out.println("연결 성공");
			
			//DB 작업
			// 매개 변수화 된 sql 문 
			String sql = "insert into users( userid, username, userpassword, userage, useremail)values(?, ?, ?, ?, ?)";  //valuse를 pstmt를 이용해서 세팅
			
			// 인터페이스 타입의 변수를 선언 해서 
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "fall");
			pstmt.setString(2, "fall");
			pstmt.setString(3, "fall");
			pstmt.setInt(4, 40);
			pstmt.setString(5, "fall");
			int na = pstmt.executeUpdate();
			System.out.println(na);
				
		}catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}finally{
			if(conn != null) {
				//DB 연결 끊기
				try {
					conn.close();
				}catch (SQLException e) {
					System.out.println("연결 끊김");
				}
				
			}
		} 
			
		
	}

}
