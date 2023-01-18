
public class Exception2 {
	
	public static void main(String[]args) {
		try {
			Exception e = new Exception("고의 예외");
			throw e;   // 고의 예외를 던짐
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}

}


//throw : 예외 발생
//throws : 예외 던지기 호출한 쪽으로 던진다