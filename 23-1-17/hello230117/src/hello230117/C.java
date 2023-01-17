package hello230117;

public class C {

	// 정적 default 중첩 클래스 B 선언
	static class D{
		int field1 = 1;
		static int field2 = 2;
		
		D(){
			System.out.println("D-생성자 실행");
		}
		//인스턴스 메서드 
		void method1() {
			System.out.println("D-method1 실행");
		}
		static void method2(){
			System.out.println("D-method2 실행");
		}
	}
	
	//정적 defalut 중첩 클래스 B 선언
//	static class D{}
//	D field1 = new D();
//	
//	static D field2 = new D();
//	
//	
//	C(){
//		D d = new D();
//	}
//	void method1() {
//		D d = new D();
//	}
//	
//	static void method2() {
//		D d = new D ();
//	}
//
}
