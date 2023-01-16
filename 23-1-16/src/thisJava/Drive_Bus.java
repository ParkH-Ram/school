package thisJava;

public class Drive_Bus implements Drive_Vehicle {

	@Override
	public void run() {
		System.out.println("버스 달림");
		
	}
	
	public void checkFare() {
		System.out.println("승차 요금 체크");
	}

	
	
}
