package thisjava7��_���;

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

public class ȫ��_Ŭ�������_test {
	public static void maint(String[]args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;       //A �ʿ��� �Ļ��� �Ȱű� ������ ��� �ڽĵ��� ���� �� ����  
						// �ڵ� Ÿ�� ��ȯ ( ��� ���� )
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e;		// ���� : ��Ӱ��谡 �ƴ϶�
//		C c2 = d;
				
	
				
		
	}
}


