package hello230117;

public class A {
	//인스턴스 멤버 클래스
	class B{
		//인스턴스 변수
		int field1 = 1;
		
		//클래스 변수 
		static int field2 = 2;
		
		B(){
			System.out.println("B-생성자 실행");	
		}
		//인스턴스 메서드
		void method1() {
			System.out.println("B-method1 실행");
		}
		//클래스 메소드(JAVA 17 부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
		}		
	}
	
	void useB() {
		
		// A클래스 안에 중첩인 B 클래스의 객체
		B b =new B();
		
		//인스턴스 멤버 사용
		System.out.println(b.field1);   // 인스턴스 변수
		b.method1();					// 인스턴스 메서드
		
		System.out.println(B.field2);	// 클래스 변수
		B.method2();					// 클래스 메서드
	}
	
//	//인스턴스 필드 값을 B객체 대입
//	B field = new B();
//	
//	//생성자
//	A (){
//		B b = new B();
//	}
//	
//	void method() {
//		B b = new B();
//	}
//

}
