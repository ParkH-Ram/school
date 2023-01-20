package thisjava;

public class Car_GetResourceExam2 {
	public static void main(String[]args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		System.out.println(photo1Path);
	}

}
