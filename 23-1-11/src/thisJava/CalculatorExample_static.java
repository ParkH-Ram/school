package thisJava;

public class CalculatorExample_static {

	public static void main(String[]args) {
		
//		Calculator calr = new Calculator();   ��ü ����.   static�� ��ü ���� ���ص� �ٷ� ��� ����  
		
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(150, 340);
		
		
		System.out.println(result1 + " " + result2 + " " +result3 );
	}
}
