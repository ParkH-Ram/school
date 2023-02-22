package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Users;


// 컨트롤러 db랑 뷰를 연결
public class UsersTable {
	Connection conn = null;
	
	
	// 어레이리스트로 Users 값을 받아올 걸 만드는 공간
    ArrayList<Users> userList = new ArrayList<Users>();
    public UsersTable() {
    	String dbinfo = "jdbc:mysql://222.119.100.81:3382/foxy"; // 데이터베이스 접속 URL"
		String dbId = "foxy";
		String dbPW = "gksehdwls";  // 로그인 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(dbinfo,dbId,dbPW);
		}catch(Exception e) {
			System.out.println("connection error : " + e);
		} // db연결 끗 
		// 서버랑 연결하는 생성자 끗 
    }
    
    // 유저 목록 출력
    public ArrayList<Users> select() {  
    	String sql = "select * from users";  // 쿼리문 companyTable 내용을 전ㅂ ㅜ불러옴
        try {
           PreparedStatement pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           
           while(rs.next()) {
              Users us = new Users();
              us.setUserId(rs.getString(1));  // 한 로우에 칼럼을 인덱스로 받는 것
              us.setUserPassword(rs.getString(2)); 
              us.setUserName(rs.getString(3)); 
              us.setUserPhoneNum(rs.getString(4)); 
              userList.add(us);   // 한열 받아서  리스트를 꽉 채운 다음에 
           }
           
           if ( rs != null ) rs.close();
           if ( pstmt != null ) pstmt.close();
           if ( conn != null ) conn.close();
           
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        return userList;  // 유저 정보 반환
    }
    
    public void delete(String code){  // 삭제할 녀석의 코드를 담은 매개변수
    	// 값을 삭제만 할 거니까 allay도 필요 없음
    	//딜리트는 생성자 만들필요 없음
    	String sql = "DELETE FROM users WHERE user_id = ?";
    	System.out.println(sql);
    	
    	
    	// 기본 셋팅
    	
    	PreparedStatement pstmt = null;
    		
        try{
        	pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, code);
        	pstmt.executeUpdate(); // 쿼리문 실행 메서드
            System.out.println("삭제했다 ㅎㅎㅎ ");
            pstmt.close();
            conn.close();
        }catch (Exception e) {
        	System.out.println("connection error : " + e);
        }
      
    
    }
    
    
    
    
    
    
    // insert 삽입
    
    					// 모델을 준다. 모델 타입 클래스
    public void insert(Users us){  //매개변수를 company 타입으로 받아옴
    	// 값을 삭제만 할 거니까 allay도 필요 없음
    	//딜리트는 생성자 만들필요 없음
    	String sql = "insert into users(user_id, user_pwd, user_Name, user_phoneNum) values(?,?,?,?)";
    	
 
    	
    	
    	// 기본 셋팅
    	
    	PreparedStatement pstmt = null;
    		
        try{
        	pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, us.getUserId()); 
        	pstmt.setString(2, us.getUserPassword());
        	pstmt.setString(3, us.getUserName());
        	pstmt.setString(4, us.getUserPhoneNum());
        	pstmt.executeUpdate(); // 쿼리문 실행 메서드
        	
        	pstmt.close();
        	conn.close();
        }catch (Exception e) {
        	System.out.println("connection error : " + e);
        }	
    }
    
    
    
    
    // update 
 
    
	
	public void update(Users us){ 
        // update할 컬럼들을 제외한 컬럼들의 값을 찾기 위해 user_id를 기준으로 검색
        String searchSql = "SELECT * FROM users WHERE user_id = ?";
        String updateSql = "UPDATE users SET user_id = ?, user_pwd = ?, user_name = ?, user_phoneNum = ? WHERE user_id = ?";
        					// 쿼리문에 ?가 있으면 ?에 대한 값을 무조건 넣어 줘야 한다.
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        
        try {
            pstmt = conn.prepareStatement(searchSql);
            pstmt.setString(1, us.getUserId());
            rs = pstmt.executeQuery();  // 있을 때만 업데이트 하려고

            if(rs.next()) {  // 해당 user_id가 있을 경우 수정  
            	pstmt2 = conn.prepareStatement(updateSql);
            	pstmt2.setString(1, us.getUserId());
            	pstmt2.setString(2, us.getUserPassword());
            	pstmt2.setString(3, us.getUserName());
            	pstmt2.setString(4, us.getUserPhoneNum());
            	pstmt2.setString(5, us.getUserId());
            	pstmt2.executeUpdate();
                
                System.out.println("업데이트 성공");
            } else {
                System.out.println("업데이트 실패");
            }
            
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(pstmt2 != null) pstmt2.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Closing resources error: " + e.getMessage());
            }
        }
    }

    
    
}