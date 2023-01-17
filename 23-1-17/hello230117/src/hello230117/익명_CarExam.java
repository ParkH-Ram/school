package hello230117;

public class 익명_CarExam {

	public static void main(String[] args) {
		익명_Car car = new 익명_Car();
		
		
		//익명 자식 객체가 대입된 필드 사용
		car.run1();
		
		//익명 자식 객체가 대입된 로컬 클래스
		car.run2();
		
		//익명 자식 객체가 대입된 매개변수 사용
		
		car.run3(new 익명_Tire(){       //익명 자식 객체
		@Override
		public void roll() {
			System.out.println("익명 자식 객체 3이 굴러가유"); 
		}
	});

	}
}
