package _16_Lambda;

public class _4_Person {
	public void action(_4_Calculable cal, int a, int b) {
		
		// _4_Calculable �������̽����� cal ��ü�� ������� 
		//cal �ȿ� �ִ� calc �޼��忡 10, 4�� ���� �־���
		int result = cal.calc(a, b);
		System.out.println("��� : " + result);
	}

}
