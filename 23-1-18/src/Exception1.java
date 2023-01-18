
public class Exception1 {
	public static void main(String[]args) {
		int a =0;
		int b =0;
	
		try {
			System.out.println("외부로 접속");
			int c = b/a;
			System.out.println("연결해제");
			
	} catch (ArithmeticException e) {
		System.out.println("오류 발생");
		
	}finally {							//반드시 실행 구문 
		System.out.println("연결해제");
	}
	
	}
}
