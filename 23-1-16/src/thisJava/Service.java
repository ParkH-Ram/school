package thisJava;

public interface Service {

	default void defaultMethod1() {
		System.out.println("디폴트메소드1 종속코드");
	}
	default void defaultMethod2() {
		System.out.println("디폴트메소드2 종속코드");
	}
		
//	private void defaultCommon() {
//		System.out.println()
//	}
		
//	static void staticMethod1() {
//		System.out.println("메소드1 종속 코드");
//		staticCommon();
//	}
//	private static 
//	}
//	
}
