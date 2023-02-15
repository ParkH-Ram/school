package _20_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExam {
	
	public static void main(String[]args) {
		Connection conn = null;
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection(
	               "jdbc:mysql://192.168.111.32:3306/thisisjava",
	        		"java",
	        		"mysql"
	               );
	         
	         System.out.println("¿¬°á ±»");
	         
	      }catch(SQLException e) {
	    	  System.err.println(e.getMessage());
	      }catch(ClassNotFoundException e) {
	         e.printStackTrace();
	      }finally {
	         if(conn != null) {
	            try {
	               conn.close();
	               System.out.println("¿¬°á ²÷±â");
	            }catch(SQLException e) {}
	         }
	      }

	   

	}

}
