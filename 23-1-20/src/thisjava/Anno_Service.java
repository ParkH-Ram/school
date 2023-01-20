package thisjava;

public class Anno_Service {
	
	@Anno_PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	
	@Anno_PrintAnnotation("*")
	public void method2() {
		System.out.println("실행내용2");
	}
	@Anno_PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}

}
