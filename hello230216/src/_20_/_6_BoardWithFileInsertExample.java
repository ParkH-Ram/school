package _20_;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _6_BoardWithFileInsertExample {
	public static void main(String[]args) {
		Connection conn = null;
		try { 
			
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
		
			
			//DB와 연결											ip port번호 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle");
			System.out.println("연결 성공");
			
			
			String sql = "insert into users( bno, btilte, bcontent, bwriter, bdate, bfilename, bfiledata)values(seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";  //valuse를 pstmt를 이용해서 세팅
						//시퀀스에서 값 하나를 받아서 여기다 넣겠다 seq_bno.nextval
			
	
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "하얀눈이 내려 오니");
			pstmt.setString(2, "디스이즈 함박눈");
			pstmt.setString(3, "winter");
			pstmt.setString(4, null);
			Blob blob = null;
			pstmt.setBlob(5, blob);
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
