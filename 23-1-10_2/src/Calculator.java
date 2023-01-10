
public class Calculator {

	void powerOn() {
		System.out.println("전원을 켠다");
	}
	
	//리턴 값이 없는 메소드 선언 
	void powerOff() {
		System.out.println("전원을 끈다");
	}
	
	// 호출 시 두 정수 값을 전달 받고,
	// 호출한 곳으로 결과 값을 int 형으로 리턴하는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값을 double 형으로 리턴하는 메소드
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;   // 리턴 값
	}
	
}
