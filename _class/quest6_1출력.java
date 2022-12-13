package _class;

public class quest6_1출력 {
	public static void main (String []args) {
		
		quest6_1클래스생성 card1 = new quest6_1클래스생성(3, false);   // 지정 값 출력
		//클래스를 불러와서 인스턴스 값 생성 함수 ( 매개변수 ) -> 인스턴스를 만들어줌 (생성자 = 메소드)
		// 메소드 - 입력 받아 출력 주는 모든 것
		quest6_1클래스생성 card2 = new quest6_1클래스생성();           //  class 내에서 출력한 값 출력
		
		System.out.println(card1.info());
		System.out.println(card2.info());		
	}
}
