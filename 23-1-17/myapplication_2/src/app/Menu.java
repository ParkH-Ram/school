package app;

//��� A���� ������
import pack1.A;
//import pack2.B;
//��� B���� ������
import pack3.C;
import pack4.D;

public class Menu {
	public static void main(String[]args) {
		
		//my���A ��Ű���� ���Ե� A Ŭ���� �̿�
		A a = new A();
		a.method();  
		
		//a�� B�� �־ ���� ����

		//my���A ��Ű���� ���Ե� B Ŭ���� �̿�
//		B b = new B();
//		b.method();
		
		
		//my���A ��Ű���� ���Ե� C Ŭ���� �̿�
		C c = new C();
		c.method();
		
		D d = new D();
		d.method();
		
		C resualt = a.getC();
		resualt.method();
	
	}
	


}
