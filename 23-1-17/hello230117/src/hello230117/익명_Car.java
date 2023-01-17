package hello230117;

public class 익명_Car {
	
	private 익명_Tire tire1 = new 익명_Tire();
	
	//필드에 익명 자식 객체 대입
	private 익명_Tire tire2 = new 익명_Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 구름");
		};    // 익명 객체는 중괄호 뒤에다가 세미콜론을 붙여 줘야함
	};
	
	//tire1과 tire2(익명자식객체) 객체안의 roll()메서드 실행
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		// 로컬 변수의 익명 자식 대입
		익명_Tire tire = new 익명_Tire() {
		
		@Override
		public void roll(){
			System.out.println("익명 자식  2가 굴러가유");
		}
	};
	tire.roll();

}

	public void run3(익명_Tire tire) {
		tire.roll();
	}

}
	
