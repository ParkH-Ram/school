package thisJava;

public class loginExam {
	public static void main(String[]args) {
		
		logins newlog = new logins();
		boolean result = newlog.login("hong", "12345");  
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("집에 가라");		}
	}
}
