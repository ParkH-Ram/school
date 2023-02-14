package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _5_ConnectionExample {

   public static void main(String[] args) {
      Connection conn = null;
      
      try {
         Class.forName("oracle.jdbc.OracleDriver");
         
         conn = DriverManager.getConnection(
               "jdbc:oracle:thin:@192.168.111.32:1521/orcl",
               "java",
               "oracle"
               );
         System.out.println("연결 성공");
//         String sql = ""+"INSERT INTO users (userid, username, userpassword, userage,"
//               +"useremail)"+"values(?, ?, ?, ?, ?)";
//         
//         PreparedStatement pstmt = conn.prepareStatement(sql);
//         
//         pstmt.setString(1, "winter");
//         pstmt.setString(2, "한겨울");
//         pstmt.setString(3, "12345");
//         pstmt.setInt(4, 25);
//         pstmt.setString(5, "winter@mycompany.com");
//         
//         int rows = pstmt.executeUpdate();
//         System.out.println("저장된 행 수 : " + rows);
         
//         pstmt.close();
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if(conn != null) {
            try {
               conn.close();
               System.out.println("연결 끊기");
            } catch (SQLException e) {}
         }
      }

   }

}