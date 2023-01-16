package thisJava;

public class Drive_Exam {

	public static void main(String[] args) {
		
		Drive_Vehicle veh = new Drive_Bus(); // veh가 큰  형태 
		Drive_Vehicle vh2 = new Drive_taxi();   // 택시 소환
		
		veh.run();

		
		Drive_Bus bus = (Drive_Bus)veh; // Drive_Bus 형태로 
//		bus.checkFare();                     //형변환 할때는 이렇게 참고
		
		Drive_taxi taxi = (Drive_taxi)vh2;
		taxi.run();
		taxi.checkFare();
	}

}
