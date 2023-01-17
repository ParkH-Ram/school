package hello230117;

public class E {
	void useF() {
		class F {
			int field1 = 1;
			
			static int field2 = 2;
			
			F(){
				System.out.println("F-생성자 실행");
			}
			
			void method1() {
				System.out.println("F-method1 실행");
			}
			static void method2() {
				System.out.println("F-method2 실행");
		}
		}
		
		F f = new F();
		System.out.println(f.field1);
		f.method1();
		
		System.out.println(f.field2);
		F.method2();
	}
	


	
	
	
	
	
	
//사용 방법	
	// 생성자 안에서 F 클래스 선언
//	E(){
//		//로컬 클래스 선언
//		class F {}
//		//로컬 객체 생성
//		F f = new F();
//	}
//	// 메서드 안에서 F 클랴스 선언
//	void method() {
//		// 로컬 클래스 선언
//		class F{}
//		
//		//로컬 객체 생성
//		F f = new F();
//		
//	}
}
