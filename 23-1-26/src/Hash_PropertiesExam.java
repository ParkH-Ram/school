import java.io.IOException;
import java.util.Properties;

public class Hash_PropertiesExam {
	public static void main(String[]args) {
		
		//Properties �÷��� ����
		Properties proper = new Properties(); 
		
		//PropertiesExam.class�� ������ ClassPath�� �ִ� database.properties ���� �ε�
		try {  //���� �߻� Ʈ���� ĳġ ���ִ°� ���� ���
			proper.load(Hash_PropertiesExam.class.getResourceAsStream("database.properties"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		//�־��� Ű�� ���� �� �б�
		String driver = proper.getProperty("driver");
		String url = proper.getProperty("url");
		String username = proper.getProperty("username");
		String password = proper.getProperty("password");
		String admin = proper.getProperty("admin");
		
		//�� ���
		System.out.println(driver + " " + url + " " + username + " " + password + " " + admin);
	}
	


}
