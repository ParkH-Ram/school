package hello230117;

public class E {
	void useF() {
		class F {
			int field1 = 1;
			
			static int field2 = 2;
			
			F(){
				System.out.println("F-������ ����");
			}
			
			void method1() {
				System.out.println("F-method1 ����");
			}
			static void method2() {
				System.out.println("F-method2 ����");
		}
		}
		
		F f = new F();
		System.out.println(f.field1);
		f.method1();
		
		System.out.println(f.field2);
		F.method2();
	}
	


	
	
	
	
	
	
//��� ���	
	// ������ �ȿ��� F Ŭ���� ����
//	E(){
//		//���� Ŭ���� ����
//		class F {}
//		//���� ��ü ����
//		F f = new F();
//	}
//	// �޼��� �ȿ��� F Ŭ���� ����
//	void method() {
//		// ���� Ŭ���� ����
//		class F{}
//		
//		//���� ��ü ����
//		F f = new F();
//		
//	}
}
