package thisjava;

public class Computer extends Calculator {
	//�޼ҵ� �������̵�
	@Override // �����Ͻ� ��Ȯ�� �������̵� �Ǿ��ִ��� üũ���� (���� ���� )
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI * r * r;
	}

}
