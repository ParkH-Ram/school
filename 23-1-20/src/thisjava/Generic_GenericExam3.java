package thisjava;

public class Generic_GenericExam3 {
	public static void main(String[]args) {
		Generic_HomeAgency homeA = new Generic_HomeAgency();
		Generic_Home home = homeA.rent();
		home.turnOnLight();

		Generic_CarAgency CarA = new Generic_CarAgency();
		Generic_Car2 car = CarA.rent();
		car.run();
		
	}

}
