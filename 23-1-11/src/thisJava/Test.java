package thisJava;

public class Test {
	// 인스턴스 멤버와 메소드 선언 << - 객체가 생성되어야지만 메모리에   (public)
	int field1;
	void method1() {
		
	}
	
	
	//정적 멤버와 메소드 선언    << -  클래스 파일만 생성해도 정적 멤버와 메소드가 메모리에 (static)
	static int field2;              
 	static void method2() {
	}
	static {
//	filed1 = 10;
//	method1();
	field2 = 10;
	method2();
	}
	static void method3(){
		field2 =10;
	}
}
