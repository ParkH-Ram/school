package thisjava;

public class Car_GetResourceExam {
	public static void main(String[]args) {
		Class clazz = Car.class;
		
		//how2
//		Class clazz = class.forName("thisjava.Car")
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("��Ű�� : " + clazz.getPackage().getName());
				
		
	}

}
