package app;

//모듈 A에서 가져옴
import pack1.A;
//import pack2.B;
//모듈 B에서 가져옴
import pack3.C;
import pack4.D;

public class Menu {
	public static void main(String[]args) {
		
		//my모듈A 패키지에 포함된 A 클래스 이용
		A a = new A();
		a.method();  
		
		//a에 B를 넣어서 같이 실행

		//my모듈A 패키지에 포함된 B 클래스 이용
//		B b = new B();
//		b.method();
		
		
		//my모듈A 패키지에 포함된 C 클래스 이용
		C c = new C();
		c.method();
		
		D d = new D();
		d.method();
		
		C resualt = a.getC();
		resualt.method();
	
	}
	


}
