package hello230117;

public class A {
	//�ν��Ͻ� ��� Ŭ����
	class B{
		//�ν��Ͻ� ����
		int field1 = 1;
		
		//Ŭ���� ���� 
		static int field2 = 2;
		
		B(){
			System.out.println("B-������ ����");	
		}
		//�ν��Ͻ� �޼���
		void method1() {
			System.out.println("B-method1 ����");
		}
		//Ŭ���� �޼ҵ�(JAVA 17 ���� ���)
		static void method2() {
			System.out.println("B-method2 ����");
		}		
	}
	
	void useB() {
		
		// AŬ���� �ȿ� ��ø�� B Ŭ������ ��ü
		B b =new B();
		
		//�ν��Ͻ� ��� ���
		System.out.println(b.field1);   // �ν��Ͻ� ����
		b.method1();					// �ν��Ͻ� �޼���
		
		System.out.println(B.field2);	// Ŭ���� ����
		B.method2();					// Ŭ���� �޼���
	}
	
//	//�ν��Ͻ� �ʵ� ���� B��ü ����
//	B field = new B();
//	
//	//������
//	A (){
//		B b = new B();
//	}
//	
//	void method() {
//		B b = new B();
//	}
//

}
