package hello230117;

public class H_outer {
	
	//�ٱ� Ŭ������ �ν��Ͻ� ���
	int field1;
	void method1() {}
	
	//�ٱ� Ŭ������ Ŭ���� ���
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� ��� Ŭ���� : �ٱ� Ŭ������ �ν��Ͻ� ���, Ŭ���� ����� ������ �����ϴ�.
	class I {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			
		}
	}
	
	//Ŭ���� ��� Ŭ���� : �ٱ� Ŭ������ �ν��Ͻ� ��� ����X
	static class J{    // ����ƽ������ �ٷ� ���� ����
		void method() {
			field1 = 10;    //�ν��Ͻ� ����� ��ü ���� �� ��� ����
			method1();
			
			field2 = 10;
			method2();	   
		}
		
	}
}
