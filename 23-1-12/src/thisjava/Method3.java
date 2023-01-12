package thisjava;

class Check {
	static int cv = 5;  //  정적 변수 멤버
	int  iv = 4;          // 인스턴스 변수


	static void cm() {  //정적 메소드 
	}
	
	void im() {        //인스턴스 메소드
	}
	
//	static void cm_Imember() {		 // 정적 멤버 메소드에서 인스턴스 멤버 사용
//		System.out.println(iv); 	// 에러  : 인스턴스 멤버 (생성 : 객체선언)
//		im();						// 에러 :  인스턴스 멤버 (생성 : 객체 선언)
//	}
	void im_Cmember() {				//인스턴스 메소드 에서 클래스 변수 사용
		System.out.println(cv);
		cm();
	}
	static void cm_Cmember() {
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		System.out.println(iv);
		im();
	}
	
	
}
public class Method3 {
	public static void main(String[]args) {
		Check check = new Check();
		check.im_Cmember();
		check.im_Imember();
	}

}
