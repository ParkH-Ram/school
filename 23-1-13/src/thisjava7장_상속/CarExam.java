package thisjava7장_상속;

public class CarExam {
	
	public static void main(String[]args) {
		
		//myCar 인스턴스 생성
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run(); 		// 타티어 롤 실행
		
		
		//한국타이어 객체 장착
		myCar.tire = new HankookTire();
		myCar.run(); 		// 타티어 롤 실행
		
		myCar.tire = new KumhoTire();
		myCar.run(); 		// 타티어 롤 실행
	}

}
