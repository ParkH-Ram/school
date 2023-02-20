package _20_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			
			
			String sql = "insert into boards( bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata ) values(seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";  //valuse를 pstmt를 이용해서 세팅
						//시퀀스에서 값 하나를 받아서 여기다 넣겠다 seq_bno.nextval
				
	
			PreparedStatement pstmt = conn.prepareStatement(sql,  new String[] {"bno", "btitle"}); // 가져 오고 싶은 칼럼
			
			// 물음표에 대한 순서
			pstmt.setString(1, "하얀눈이 내려 오니7");
			pstmt.setString(2, "디스이즈 함박눈6");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "photo1.jpg");
			pstmt.setBlob(5, new FileInputStream("src/_20_/photo1.jpg"));
			
			
			int na = pstmt.executeUpdate();
			System.out.println(na);
			
			if (na == 1) {  // 실행한 결과가 1이 나왔는지 조사
				// 추가 된 값들을 불러오는 것
				// 추가 된 값들을 확인 하고 싶어서 밑에 메서드
				
				//getGeneratedKeys 가 ResultSet을 리턴함
				ResultSet rs = pstmt.getGeneratedKeys();  // 생성 되어진 키들을 가져 와란 뜻 getGeneratedKeys
				if(rs.next()) { // next()메서드가 행을 한칸 내려 주는 메서드
					int bno = rs.getInt(1);
					System.out.println(bno);
					
					String btitle = rs.getString(2);
					System.out.println("저장된 btitle" + btitle);
				
				}
				
				rs.close();
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
