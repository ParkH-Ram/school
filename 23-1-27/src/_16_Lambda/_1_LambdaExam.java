package _16_Lambda;

//자바는 람다식을 익명 구현 객체로 변환
public class _1_LambdaExam{
	public static void main(String[]args) {
		action((x, y) -> {  // 액션 메서드를 호출하는데 매개변수로 함수가 들어가는데 
							// 그 함수가 인터페이스에 선언 되어 있는 추상 메서드
							// 추상 메서드는 바로 못쓰니 인터페이스를 구현해서 (익명구현 객체)
							// 인터페이스에서  메서드를 보장을 한다. 이름이 없이 자동으로 넣으면  그인터페이스 안에 있는 메서드를 구현할거라는 걸 자동으로 인식을 한다. 
			int result = x+y;
			System.out.println("result: " + result);
		}, 10, 4);
		//인터페이스 구현
		//구현된 객체를 생성
		
		action((x, y) -> {
			int result = x*y;
			System.out.println("result: " + result);
		}, 10, 4);
	}
	
	//action 이라는 메서드 안에 인터페이스 객체를 생성 후 추상 메서드를 호출해서 현재 메서드에서 적용
	public static void action(_1_Calculable calcu, int x, int y) {
		//인터페이스를 구현 후 바로 적용
		
	
		//데이터
		
		calcu.calculate(x, y);
		
	}

}
