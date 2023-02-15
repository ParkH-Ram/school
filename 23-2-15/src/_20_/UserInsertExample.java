package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
   public static void main(String[] args) {
      Connection conn = null;
      try {
         //jdbc Driver 등록
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  
    	  //연결
          conn = DriverManager.getConnection(
	               "jdbc:mysql://192.168.111.32:3306/thisisjava",
	        		"java",
	        		"mysql"
	               );
	         
          //SQL문 작성
          String sql = "" + 
          "Insert into users (userid, username, userpassword, userage, useremail)" +
          "Values(?,?,?,?,?)";
          
          // PreparedStatement 값 넣기
          PreparedStatement pstmt = conn.prepareStatement(sql);
          pstmt.setString(1, "PHR");
          pstmt.setString(2, "heeram");
          pstmt.setString(3, "secret");
          pstmt.setInt(4, 30);   // 인트형태기 때문
          pstmt.setString(5, "secret");
          
          
          //SQL 실행  하고 rows에 값을 넣는다
          int rows = pstmt.executeUpdate();   
          System.out.println("저장된 행 수 : "  + rows);
        		 
         
      }catch(SQLException e) {
         e.printStackTrace();
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }finally {
         if(conn != null) {
            try {
               conn.close();
               System.out.println("연결 끊기");
            }catch(SQLException e) {}
         }
      }
   }
}