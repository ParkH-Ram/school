package thisJava;

public class CalculatorExample_static {

	public static void main(String[]args) {
		
//		Calculator calr = new Calculator();   객체 생성.   static은 객체 생성 안해도 바로 사용 가능  
		
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(150, 340);
		
		
		System.out.println(result1 + " " + result2 + " " +result3 );
	}
}
