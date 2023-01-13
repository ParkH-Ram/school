package thisjava7장_상속;

class A {

}
class B extends A{

}

class C extends A{

}

class D extends B{

}

class E extends C {

}

public class 홍보_클래스상속_test {
	public static void maint(String[]args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;       //A 쪽에서 파생이 된거기 때문에 모든 자식들을 담을 수 있음  
						// 자동 타입 변환 ( 상속 관계 )
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e;		// 에러 : 상속관계가 아니라서
//		C c2 = d;
				
	
				
		
	}
}


