package thisjava7¿Â_ªÛº”;

public class DriverExam {
	public static void main(String[]args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
