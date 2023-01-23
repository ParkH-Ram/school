package thisjava;

public class Exception_Exception1 {
	public static void main(String[]args) {
		try {
			int[]a = {2,0};
			int b=4;
			int c = b/a[2];  // 인덱스 2번이 없으므로 에러
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("산술오류");
			System.err.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열길이 오류");
			System.err.println(e.getMessage() + " " +e.getStackTrace());
		}
	}

}
