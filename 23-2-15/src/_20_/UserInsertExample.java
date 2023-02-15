package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
   public static void main(String[] args) {
      Connection conn = null;
      try {
         //jdbc Driver ���
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  
    	  //����
          conn = DriverManager.getConnection(
	               "jdbc:mysql://192.168.111.32:3306/thisisjava",
	        		"java",
	        		"mysql"
	               );
	         
          //SQL�� �ۼ�
          String sql = "" + 
          "Insert into users (userid, username, userpassword, userage, useremail)" +
          "Values(?,?,?,?,?)";
          
          // PreparedStatement �� �ֱ�
          PreparedStatement pstmt = conn.prepareStatement(sql);
          pstmt.setString(1, "PHR");
          pstmt.setString(2, "heeram");
          pstmt.setString(3, "secret");
          pstmt.setInt(4, 30);   // ��Ʈ���±� ����
          pstmt.setString(5, "secret");
          
          
          //SQL ����  �ϰ� rows�� ���� �ִ´�
          int rows = pstmt.executeUpdate();   
          System.out.println("����� �� �� : "  + rows);
        		 
         
      }catch(SQLException e) {
         e.printStackTrace();
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }finally {
         if(conn != null) {
            try {
               conn.close();
               System.out.println("���� ����");
            }catch(SQLException e) {}
         }
      }
   }
}