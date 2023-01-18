
public class 예외실습3 {
	public static void main(String[]args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String클래스가 존재");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2클래스가 존재");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
