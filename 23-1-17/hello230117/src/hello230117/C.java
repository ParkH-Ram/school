package hello230117;

public class C {

	// ���� default ��ø Ŭ���� B ����
	static class D{
		int field1 = 1;
		static int field2 = 2;
		
		D(){
			System.out.println("D-������ ����");
		}
		//�ν��Ͻ� �޼��� 
		void method1() {
			System.out.println("D-method1 ����");
		}
		static void method2(){
			System.out.println("D-method2 ����");
		}
	}
	
	//���� defalut ��ø Ŭ���� B ����
//	static class D{}
//	D field1 = new D();
//	
//	static D field2 = new D();
//	
//	
//	C(){
//		D d = new D();
//	}
//	void method1() {
//		D d = new D();
//	}
//	
//	static void method2() {
//		D d = new D ();
//	}
//
}
