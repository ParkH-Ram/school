package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _9_UserSelectExample {

	public static void main(String[]args) {
		Connection conn = null;
		try { 
			
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
		
			
			//DB와 연결											ip port번호 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.32:1521/orcl","java","oracle");
			System.out.println("연결 성공");
			
			
			String sql = "select userid, username, userpassword, userage, useremail from users where userid=?"; 
						//시퀀스에서 값 하나를 받아서 여기다 넣겠다 seq_bno.nextval
				
			PreparedStatement pstmt = conn.prepareStatement(sql); // 가져 오고 싶은 칼럼
			
			// 물음표에 대한 순서
			pstmt.setString(1, "liar");
			
			
			//excuteQuery에 대한 리턴 값 ResultSet
			ResultSet rs = pstmt.executeQuery();
;			
			// 출력 방법 2개
			if(rs.next()) {
				/*String userId= rs.getString("userid");  // 인덱스 이므로  0번ㅉ ㅐ부터 시작
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt(4);
				String userEmail = rs.getString(5);
				System.out.println(userId);
				System.out.println(userName);
				System.out.println(userPassword);
				System.out.println(userAge);
				System.out.println(userEmail);*/
				
				
				// 불러오는 방법 두가지 또 추가
				_9_User user = new _9_User();  // 해당 메서드에 모든 값을 넣음
				// 여기 있는 데이터를 메서드로 전달 , 데이터 전달개체
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("userName"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserAge(rs.getInt("userAge"));
				user.setUserEmail(rs.getString("userEmail"));
				printUser(user);  // 불러오는 방법 두가지 또 추가  DTO : 필요한 포맷으로 만들어 값을 가져오는?
				System.out.println(user);
				// 자동으로 toString이 들어가니 toString을 굳이 할 필요가 없다
				
			}else {
				System.out.println("사용자 아디 존재 x");
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
	public static void  printUser(String userId, String userName, String userPassword, int userAge, String userEmail) {
		System.out.println("userId : " + userId);
		System.out.println("userName : " + userName);
		System.out.println("userpassword : " + userPassword);
		System.out.println("userAge : " + userAge);
		System.out.println("userEmail : " + userEmail);
	}
	 
	public static void printUser(_9_User user) {
		System.out.println("userId: " + user.getUserId());
		System.out.println("userName: " + user.getUserName());
		System.out.println("userPassword: " + user.getUserPassword());
		System.out.println("userAge: " + user.getUserAge());
		System.out.println("userEmail: " + user.getUserEmail());
	}
	
}

