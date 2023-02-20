package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _10_UserSelectExample {

	public static void main(String[]args) {
		Connection conn = null;
		try { 
			
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
		
			//DB와 연결											ip port번호 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle");
			System.out.println("연결 성공");
			
			
			String sql = "select bno, btitle, bcontent, bwriter, bfilename, bfiledata from boards where bwriter=?"; 
						//시퀀스에서 값 하나를 받아서 여기다 넣겠다 seq_bno.nextval
				
			PreparedStatement pstmt = conn.prepareStatement(sql); // 가져 오고 싶은 칼럼
			
			// 물음표에 대한 순서
			pstmt.setString(1, "liar");
			
			ResultSet rs = pstmt.excuteQuery();
			while(rs.next()) {
				_10_Boards board = new _10_Boards();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfileName"));
				board.setBfileData(rs.getBlob("bfiledata"));
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

