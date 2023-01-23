package thisjava;

public class Exception_RethrowExam {
	
	//메인 메소드
	public static void main(String[]args) {
		
		//try some code
		try {
			System.out.println("외부 try");
			try {
				System.out.println("내부 try");
				Exception e = new Exception();
				throw e;
			}catch (Exception e) {
				System.out.println("내부 트라이 캐치 " + e);
				System.out.println("한번 더");
				throw e;
				
			}
			finally {
				System.out.println("finally 출력");
			}
		}catch(Exception e) {
			System.out.println("외부 캐치" + e);
		}
		System.out.println("종료");
	}

}
