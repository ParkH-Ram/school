package _13Generic;

public class _2_GenericExam2 {

	public static void main(String[] args) {
		_2_HomeAgency homeA = new _2_HomeAgency();
		_2_Home2 home = new _2_Home2();  // ���� �����´�?
		home.turnOnLight();
		
		_2_CarAgency carA = new _2_CarAgency();
		_2_Car2 car = carA.rent();   // ī�� �����´�?
		car.run();

	}

}
