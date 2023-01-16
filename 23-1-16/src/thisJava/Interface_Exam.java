package thisJava;

public class Interface_Exam {
	
	public static void main(String[]args) {
		
		
		// 리모트 컨트롤 인터페이스 변수 선언 및 구현 객체 대입
		Interface_RemoteControl rc = new Interface_Smart();
		
		rc.turnOn3();
		rc.turnOff3();
		
		 Interface_Search search5 = new Interface_Smart();
		 
		 search5.search("https://www.youtube.com");
		 
		
	}

}
