package thisjava;

public class Exception_thorw {
	public static void main(String[]args) {
		try {
			Exception e = new Exception("고의예외"); // e객체 생성
			throw e;
		} catch(Exception e) {
			System.out.println("예외");
			System.out.println(e.getMessage()); // 예외 발생한 이유 출력
		}
	}

}
