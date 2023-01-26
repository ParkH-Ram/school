import java.io.IOException;
import java.util.Properties;

public class Hash_PropertiesExam {
	public static void main(String[]args) {
		
		//Properties 컬렉션 생성
		Properties proper = new Properties(); 
		
		//PropertiesExam.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		try {  //예외 발생 트라이 캐치 써주는게 좋은 방식
			proper.load(Hash_PropertiesExam.class.getResourceAsStream("database.properties"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		//주어진 키에 대한 값 읽기
		String driver = proper.getProperty("driver");
		String url = proper.getProperty("url");
		String username = proper.getProperty("username");
		String password = proper.getProperty("password");
		String admin = proper.getProperty("admin");
		
		//값 출력
		System.out.println(driver + " " + url + " " + username + " " + password + " " + admin);
	}
	


}
