
public class Calculator {

	void powerOn() {
		System.out.println("������ �Ҵ�");
	}
	
	//���� ���� ���� �޼ҵ� ���� 
	void powerOff() {
		System.out.println("������ ����");
	}
	
	// ȣ�� �� �� ���� ���� ���� �ް�,
	// ȣ���� ������ ��� ���� int ������ �����ϴ� �޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// ȣ�� �� �� ���� ���� ���޹ް�,
	// ȣ���� ������ ������� double ������ �����ϴ� �޼ҵ�
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;   // ���� ��
	}
	
}
