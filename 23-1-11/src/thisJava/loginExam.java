package thisJava;

public class loginExam {
	public static void main(String[]args) {
		
		logins newlog = new logins();
		boolean result = newlog.login("hong", "12345");  
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}else {
			System.out.println("���� ����");		}
	}
}
