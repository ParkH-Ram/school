
public class CalculatorExample {

	public static void main(String[]args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();   // Ŭ���� ����  �������� �״�� ��� ~~ ȣ�� �ְ�
		myCalc.powerOff();
		
		int result1 = myCalc.plus(100, 600);  // ���� �� ���� result1 �� ���� 
		double result2 = myCalc.divide(600,500); // ������ �Ǵ� �޼ҵ�� ���� ���� ������ ������ �ʿ�
		System.out.println(result1);
		System.out.println(result2);
		System.out.println((int)(result1/result2));
	}
}
