package thisJava;

public class InstanceOfExample {

	public static void main(String[] args) {
		Drive_taxi taxi = new Drive_taxi();
		Drive_Bus bus = new Drive_Bus();
		
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
		
	public static void ride(Drive_Vehicle vehicle) {
		if(vehicle instanceof Drive_Bus) {
			Drive_Bus bus = (Drive_Bus)vehicle;
			bus.checkFare();		
			}
		vehicle.run();
		}

	

}
