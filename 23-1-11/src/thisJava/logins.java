package thisJava;

public class logins {
	boolean login(String id, String password) {   // 블린 타입으로 로그인 메소드 생성
		if (id.equals("hong")&& password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id){
		System.out.println(id + "님이 로그아웃 되었습니다");
			
		}
}
	
			

		
		
		
	

