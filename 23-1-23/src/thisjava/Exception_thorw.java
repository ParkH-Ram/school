package thisjava;

public class Exception_thorw {
	public static void main(String[]args) {
		try {
			Exception e = new Exception("���ǿ���"); // e��ü ����
			throw e;
		} catch(Exception e) {
			System.out.println("����");
			System.out.println(e.getMessage()); // ���� �߻��� ���� ���
		}
	}

}
