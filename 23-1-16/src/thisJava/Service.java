package thisJava;

public interface Service {

	default void defaultMethod1() {
		System.out.println("����Ʈ�޼ҵ�1 �����ڵ�");
	}
	default void defaultMethod2() {
		System.out.println("����Ʈ�޼ҵ�2 �����ڵ�");
	}
		
//	private void defaultCommon() {
//		System.out.println()
//	}
		
//	static void staticMethod1() {
//		System.out.println("�޼ҵ�1 ���� �ڵ�");
//		staticCommon();
//	}
//	private static 
//	}
//	
}
