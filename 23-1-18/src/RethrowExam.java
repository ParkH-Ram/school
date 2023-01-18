
public class RethrowExam {

	public static void main(String[] args) {
		try {
			System.out.println("외부 try....");
			try {
				System.out.println("내부 try....");
				Exception e = new Exception();
				throw e;
			}catch (Exception e) {    //내 트라이 캐치 먼저 실행
				System.out.println("내부트라이캐치 익셉션" + e);
				System.out.println("예외 던지기 원 모어");
				throw e;
			}finally {
				System.out.println("finally 구문출력");
			}
		}catch (Exception e) {
			System.out.println("외부 트라이 캐치 익셉션 : " + e);
		}
		System.out.println("둘다");

	}

}
