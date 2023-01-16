package thisJava;

public class Car_Exam {

	public static void main(String[] args) {
		Car_ myCar = new Car_();    //다형성 인터페이스로도 가능
		myCar.run();
		
		myCar.tire1 = new Car_HankookTire();
		myCar.tire2 = new Car_HankookTire();
		
		myCar.run();

	}

}
