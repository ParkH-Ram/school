package _16_Lambda;

//�ڹٴ� ���ٽ��� �͸� ���� ��ü�� ��ȯ
public class _1_LambdaExam{
	public static void main(String[]args) {
		action((x, y) -> {  // �׼� �޼��带 ȣ���ϴµ� �Ű������� �Լ��� ���µ� 
							// �� �Լ��� �������̽��� ���� �Ǿ� �ִ� �߻� �޼���
							// �߻� �޼���� �ٷ� ������ �������̽��� �����ؼ� (�͸��� ��ü)
							// �������̽�����  �޼��带 ������ �Ѵ�. �̸��� ���� �ڵ����� ������  ���������̽� �ȿ� �ִ� �޼��带 �����ҰŶ�� �� �ڵ����� �ν��� �Ѵ�. 
			int result = x+y;
			System.out.println("result: " + result);
		}, 10, 4);
		//�������̽� ����
		//������ ��ü�� ����
		
		action((x, y) -> {
			int result = x*y;
			System.out.println("result: " + result);
		}, 10, 4);
	}
	
	//action �̶�� �޼��� �ȿ� �������̽� ��ü�� ���� �� �߻� �޼��带 ȣ���ؼ� ���� �޼��忡�� ����
	public static void action(_1_Calculable calcu, int x, int y) {
		//�������̽��� ���� �� �ٷ� ����
		
	
		//������
		
		calcu.calculate(x, y);
		
	}

}
