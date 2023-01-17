package app;

import pack1.A;
import pack2.B;
import pack3.C;
import pack4.D;

public class Main {

	public static void main(String[] args) {
		
		//my_module_A 패키지에 포함된 A 클래스 이용
		
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
		
		C c = new C();
		c.method();
		D d = new D();
		d.method();
		a.method();
	}

}
