package thisjava;

public class Anno_Service {
	
	@Anno_PrintAnnotation
	public void method1() {
		System.out.println("���೻��1");
	}
	
	@Anno_PrintAnnotation("*")
	public void method2() {
		System.out.println("���೻��2");
	}
	@Anno_PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���೻��3");
	}

}
