package thisJava;

public class Car_Exam {

	public static void main(String[] args) {
		Car_ myCar = new Car_();    //������ �������̽��ε� ����
		myCar.run();
		
		myCar.tire1 = new Car_HankookTire();
		myCar.tire2 = new Car_HankookTire();
		
		myCar.run();

	}

}
