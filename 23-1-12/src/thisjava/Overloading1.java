package thisjava;

public class Overloading1 {

	static int sum(int a, int b) {
		System.out.println("인자가 둘일 경우 호출");
		return a+b;
	}
	
	static int sum(int a, int b, int c) {     //생성자 없이 바로 사용 가능  스태틱 변수는 같은 클래스 에서 바로 사용 가능
		System.out.println("인자가 셋일 경우 호출");
		return a+b+c;
	}
	
	static double sum(double a, double b, double c) {     //생성자 없이 바로 사용 가능  스태틱 메소드는 같은 클래스 에서 바로 사용 가능
		System.out.println("인자가 셋일 경우 호출");
		return a+b+c;
	}
	
	public static void main(String[]args) {
		
		System.out.println(sum(3,2));
		System.out.println(sum(3,2,3));
		System.out.println(sum(2.5,2.4,2.8));
		
	}
}
