package thisJava;

public class ServiceExam {

	public static void main(String[]args) {
		//�������̽� ���� ����� ���� ��ü ����
		Service ser = new ServiceImpl(); // �������̽��� ��ü�� �� ���� 
										// ��ü�� ���� Ŭ������ ��������
		
		// ����Ʈ �޼ҵ� ȣ��
		ser.defaultMethod1();
		System.out.println();
		ser.defaultMethod2();
		
	}
}
