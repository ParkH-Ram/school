package thisjava;

public class Exception_Exception1 {
	public static void main(String[]args) {
		try {
			int[]a = {2,0};
			int b=4;
			int c = b/a[2];  // �ε��� 2���� �����Ƿ� ����
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("�������");
			System.err.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� ����");
			System.err.println(e.getMessage() + " " +e.getStackTrace());
		}
	}

}
