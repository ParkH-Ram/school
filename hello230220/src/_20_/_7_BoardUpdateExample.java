package _20_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _7_BoardUpdateExample {
	public static void main(String[]args) {
		Connection conn = null;
		try { 
			
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
		
			
			//DB와 연결											ip port번호 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle");
			System.out.println("연결 성공");
			
			
			String sql = new StringBuilder()
					.append("update boards set ")
					.append("btitle=? ," )
					.append("bcontent=? ,")
					.append("bfilename=? ,")
					.append("bfiledata=? ")
					.append("where bno=?")
					.toString();
		
	
			PreparedStatement pstmt = conn.prepareStatement(sql,  new String[] {"bno", "btitle"}); // 가져 오고 싶은 칼럼
			
			// 물음표에 대한 순서
			pstmt.setString(1, "비 온다잉");
			pstmt.setString(2, "겨울 비는 시원합니다");
			pstmt.setString(3, "photo2.jpg");
			pstmt.setBlob(4, new FileInputStream("src/_20_/photo2.jpg"));
			pstmt.setInt(5, 21);
			
			
			
			int na = pstmt.executeUpdate();
			System.out.println("수정된 행수" + na);
			
			if (na == 1) {  // 실행한 결과가 1이 나왔는지 조사
				// 추가 된 값들을 불러오는 것
				// 추가 된 값들을 확인 하고 싶어서 밑에 메서드

			}
			
			
			pstmt.close(); 
		}catch (Exception e) {
			e.printStackTrace();
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
