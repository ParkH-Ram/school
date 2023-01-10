
public class CalculatorExample {

	public static void main(String[]args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();   // 클래스 에서  선언해준 그대로 출력 ~~ 호출 최고
		myCalc.powerOff();
		
		int result1 = myCalc.plus(100, 600);  // 리턴 된 값이 result1 에 저장 
		double result2 = myCalc.divide(600,500); // 리턴이 되는 메소드는 리턴 값을 저장할 변수가 필요
		System.out.println(result1);
		System.out.println(result2);
		System.out.println((int)(result1/result2));
	}
}
