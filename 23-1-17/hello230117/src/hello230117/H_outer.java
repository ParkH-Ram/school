package hello230117;

public class H_outer {
	
	//바깥 클래스의 인스턴스 멤버
	int field1;
	void method1() {}
	
	//바깥 클래스의 클래스 멤버
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스 : 바깥 클래스의 인스턴스 멤버, 클래스 멤버에 접근이 가능하다.
	class I {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			
		}
	}
	
	//클래스 멤버 클래스 : 바깥 클래스의 인스턴스 멤버 접근X
	static class J{    // 스태틱끼리는 바로 접근 가능
		void method() {
			field1 = 10;    //인스턴스 멤버는 객체 생성 후 사용 가능
			method1();
			
			field2 = 10;
			method2();	   
		}
		
	}
}
