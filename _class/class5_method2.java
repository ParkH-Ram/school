package _class;

class  Check {
	 //instanceVariable : iv
	 //classVariable : cv
	 // instanceMethod: im
	// classMathod : cm
	
	static int cv = 5;  // 클래스 변수
	int iv = 4 ;    // 인스턴스 변수
	
	static void cm () { // 클래스 메서드
		
	}
	void im() {	//인스턴스 메서드 
		
	}
	static void cm_Imember() {
		
		//클래스 메서드가 인스턴스 멤버에 접근
		// System.out.println(iv); // 에러 발생
		// im(); // 에러 발생
	}
	void im_Cmember() {
		//인스턴스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmember() {
		//클래스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
	//인스턴스 메서드가 인스턴스 멤버에 접근
	System.out.println(iv);
	im();
	}
	
	
}

public class class5_method2 {

	
	
	public static void main (String[] args) {
		Check.cm_Imember(); // 실행불가 클래서 멤버에가 인스턴스 멤버에 접근
		Check.cm_Cmember();   // 클래스 멤버가 클래스 멤버에 접근
		
		Check myinstance = new Check();
		myinstance.im_Cmember();   // 인스턴스 멤버가 클래스 멤버에 접근
		myinstance.im_Imember();   // 인스턴스 멤버가 인스턴스 멤버에 접근
		
		
	}
}
