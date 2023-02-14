package _20_;


	import java.io.FileInputStream;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class _8_Board {

	   public static void main(String[] args) {
	      Connection conn = null;
	      try {
	         Class.forName("oracle.jdbc.OracleDriver");
	         
	         conn = DriverManager.getConnection(
	               "jdbc:oracle:thin:@192.168.111.32:1521/orcl",
	               "java",
	               "oracle"
	               );
	         
	         String sql = ""+
	               "insert into boards (bno, btitle, bcontent, bwriter, bdate,"
	               + "bfilename, bfiledat) "
	               + "values (seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";
	         
	         PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
	         pstmt.setString(1, "农府胶付胶");
	         pstmt.setString(2, "皋府农府胶付胶");
	         pstmt.setString(3, "winter");
	         pstmt.setString(4, "chrismas.jpg");
	         pstmt.setBlob(5, new FileInputStream("src/spring.jpg"));
	         
	         int rows = pstmt.executeUpdate();
	         System.out.println("历厘等 青 荐 : " + rows);
	         
	         if(rows ==1 ) {
	            ResultSet rs = pstmt.getGeneratedKeys();
	            if(rs.next()) {
	               int bno = rs.getInt(1);
	               System.out.println("历厘等 bno : " + bno);
	            }
	            rs.close();
	            pstmt.close();
	         }
	         } catch(Exception e) {
	        	 System.err.println(e.getMessage());
	         } finally {
	            if(conn != null) {
	               try {
	                  conn.close();
	               }catch (SQLException e) {System.err.println(e.getMessage());}
	            }
	      }
	   }

	

}
