package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _9_UserExam {
	public static void main(String[]args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.111.32:1521/orcl",
					"java",
					"oracle"
					);
			
			String sql="" +
					"SELECT userid, username, userage, useremail " + 
					"FROM users " +
					"WHERE userid=?";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"Winter");
		
			
			
			//SQL 문 실행 후, ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {   // 1개의 데이터 행을 가져왔을 경우
				_9_User user = new _9_User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt(4));			//컬럼 순번을 이용
				user.setUserEmail(rs.getString(5));		//컬럼 순번을 이용
				System.out.println(user);
			}else {
				System.out.println("사용자 아이디 존재 x");
			}
			rs.close();
			
			//PreparedStatement 닫기
			pstmt.close();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			if(conn != null) {
				try {
					//연결 끊
					conn.close();
				}catch (SQLException e) {}
			}
		}
	}
}
