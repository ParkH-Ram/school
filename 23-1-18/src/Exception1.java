
public class Exception1 {
	public static void main(String[]args) {
		int a =0;
		int b =0;
	
		try {
			System.out.println("�ܺη� ����");
			int c = b/a;
			System.out.println("��������");
			
	} catch (ArithmeticException e) {
		System.out.println("���� �߻�");
		
	}finally {							//�ݵ�� ���� ���� 
		System.out.println("��������");
	}
	
	}
}
