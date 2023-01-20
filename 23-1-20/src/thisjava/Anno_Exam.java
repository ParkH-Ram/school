package thisjava;
import java.lang.reflect.Method;

public class Anno_Exam {
	public static void main(String[]args) throws Exception {
		Method[] declaredMethods = Anno_Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			
			Anno_PrintAnnotation printAnno = method.getAnnotation
					(Anno_PrintAnnotation.class);
			printLine(printAnno);
			
			method.invoke(new Anno_Service());
			
			printLine(printAnno);
		}
	}
	public static void printLine(Anno_PrintAnnotation printAnno) {
		if(printAnno != null) {
			int number = printAnno.number();
			for (int i=0; i<number; i++) {
				String value = printAnno.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
