package pack1;
import pack2.B;
import pack3.C;
public class A {
	
	//�޼��� ����
	public void method() {
		System.out.println("A����");
		B b = new B();
		b.method();   //B�� ���� �� ��ġ��  ���� ����. A�� ���ؼ� ����
	}
	public C getC() {
		C c = new C();  /// my_module_b ����� pack3.C Ÿ�� ����
		return c;
	}

}
