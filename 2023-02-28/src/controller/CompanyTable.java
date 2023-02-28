package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Company;


public class CompanyTable {

	// 컨트롤러 db랑 뷰를 연결
	Connection conn = null;
	
	
	// 어레이리스트로 컴퍼니 값을 받아올 걸 만드는 공간  	
    ArrayList<Company> companyList = new ArrayList<Company>();
    
    
    public CompanyTable() {
    	String dbinfo = "jdbc:mysql://localhost:3306/testTB"; // 데이터베이스 접속 URL"
		String dbId = "root";
		String dbPW = "phr8615973";  // 로그인 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(dbinfo,dbId,dbPW);
		}catch(Exception e) {
			System.out.println("connection error : " + e);
		} // db연결 끗 
		// 서버랑 연결하는 생성자 끗 
    }
    
    
    // 만들어 놨던 제네릭 타임 company select 메서드를 이용해 값들을 하나씩 넣어줌 
    public ArrayList<Company> select() {
    	String sql = "select * from CompanyTable";  // 쿼리문 companyTable 내용을 전ㅂ ㅜ불러옴
        try {
           PreparedStatement pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           
           while(rs.next()) {
              Company cp = new Company();
              cp.setCompanyCode(rs.getString(1));  // 한 로우에 칼럼을 인덱스로 받는 것
              cp.setCompanyName(rs.getString(2)); 
              cp.setCompanyList(rs.getString(3)); 
              cp.setCompanyBirth(rs.getString(4)); 
              cp.setCompanyTotal(rs.getString(5)); 
              companyList.add(cp);   // 한열 받아서  리스트를 꽉 채운 다음에 
           }
           
           if ( rs != null ) rs.close();
           if ( pstmt != null ) pstmt.close();
           if ( conn != null ) conn.close();
           
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        return companyList;  // 반환
    }
    
    public void delete(String code){  // 삭제할 녀석의 코드를 담은 매개변수
    	// 값을 삭제만 할 거니까 allay도 필요 없음
    	//딜리트는 생성자 만들필요 없음
    	String sql = "DELETE FROM CompanyTable WHERE CompanyCode = ?";
    	System.out.println(sql);
    	
    	
    	// 기본 셋팅
    	
    	PreparedStatement pstmt = null;
    		
        try{
        	pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, code);
        	pstmt.executeUpdate(); // 쿼리문 실행 메서드
        	
        	 pstmt.close();
             conn.close();
        }catch (Exception e) {
        	System.out.println("connection error : " + e);
        }
        System.out.println("삭제했다 ㅎㅎㅎ ");
    }
    
    
    
    
    
    
    // insert 삽입
    
    					// 모델을 준다. 모델 타입 클래스
    public void insert(Company com){  //매개변수를 company 타입으로 받아옴
    	// 값을 삭제만 할 거니까 allay도 필요 없음
    	//딜리트는 생성자 만들필요 없음
    	String sql = "insert into CompanyTable values(?,?,?,?,?)";
    	
 
    	
    	
    	// 기본 셋팅
    	
    	PreparedStatement pstmt = null;
    		
        try{
        	pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, com.getCompanyCode()); 
        	pstmt.setString(2, com.getCompanyName());
        	pstmt.setString(3, com.getCompanyList());
        	pstmt.setString(4, com.getCompanyBirth());
        	pstmt.setString(5, com.getCompanyTotal());
        	pstmt.executeUpdate(); // 쿼리문 실행 메서드
        	
        	 pstmt.close();
             conn.close();
        }catch (Exception e) {
        	System.out.println("connection error : " + e);
        }	
    }
    
    
    
    
    // update 
 
    public void update(Company com){ 
        // update할 컬럼들을 제외한 컬럼들의 값을 찾기 위해 CompanyCode를 기준으로 검색
        String searchSql = "SELECT * FROM CompanyTable WHERE CompanyCode = ?";
        String updateSql = "UPDATE CompanyTable SET CompanyName = ?, CompanyList = ?, CompanyBirth = ?, CompanyTotal = ? WHERE CompanyCode = ?";
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            pstmt = conn.prepareStatement(searchSql);
            pstmt.setString(1, com.getCompanyCode());
            rs = pstmt.executeQuery();  // 있을 때만 업데이트 하려고
            
            if(rs.next()) {  // 해당 CompanyCode가 있는 경우에만 update       
                pstmt = conn.prepareStatement(updateSql);
                pstmt.setString(1, com.getCompanyCode());
                pstmt.setString(2, com.getCompanyName());
                pstmt.setString(3, com.getCompanyList());
                pstmt.setString(4, com.getCompanyBirth());
                pstmt.setString(5, com.getCompanyTotal());
                pstmt.executeUpdate();
                
                System.out.println("업데이트 성공");
                
                pstmt.close();
                conn.close();
            } else {
                System.out.println("업데이트 실패");
            }
            
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
            } catch (SQLException e) {
                System.out.println("Closing resources error: " + e.getMessage());
            }
        }
    }
    
    
    
    

    
    
}
