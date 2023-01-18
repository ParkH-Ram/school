import java.util.*;

class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}

}


public class Exception4{
	public static boolean ticketing(int age) throws AgeException{

		if(age<0) {
			throw new AgeException("�Է� �ٽ� �ϼ���");
		}else if(age<20) {
			throw new AgeException("�̼����� ������");
		}
		else
			return false;//�޼��� ����Ÿ���� �Ҹ������� �ϰ� ���γ��̰� ���� ��� false ����
	}
	
	
	
	
	public static void main(String[]args) {
	
		Scanner hi = new Scanner(System.in);
		
		
		boolean flag = true;// ó���� true �ʱⰪ
		
		while(flag) {//ó���� ���
			int age = hi.nextInt();
			try {
				flag = ticketing(age);
			}catch(AgeException e) {
				System.err.println(e.getMessage());
				// ���� �޽����� ǥ���ϴµ� ������ ǥ��
			}
		}
		System.out.println("���� ���� ������ ���� �ϰڽ��ϴ�.");
//		�״ϱ� ����ó���� �ý������� ������ ������ ���� ����ϴ� 
//		�ý������� ������ ����ϰ� ����ϰڴ� ���� �� ���
//		if�� �ý������� ������ �ƴϰ� �׳� 
		
	
		}
	
}
	



