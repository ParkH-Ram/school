package pack1;
import pack2.B;
import pack3.C;
public class A {
	
	//메서드 선언
	public void method() {
		System.out.println("A실행");
		B b = new B();
		b.method();   //B를 직접 못 거치게  막아 놓기. A를 통해서 접속
	}
	public C getC() {
		C c = new C();  /// my_module_b 모듈의 pack3.C 타입 리턴
		return c;
	}

}
