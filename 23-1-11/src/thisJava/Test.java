package thisJava;

public class Test {
	// �ν��Ͻ� ����� �޼ҵ� ���� << - ��ü�� �����Ǿ������ �޸𸮿�   (public)
	int field1;
	void method1() {
		
	}
	
	
	//���� ����� �޼ҵ� ����    << -  Ŭ���� ���ϸ� �����ص� ���� ����� �޼ҵ尡 �޸𸮿� (static)
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
