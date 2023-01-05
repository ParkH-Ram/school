package git_test;

public class Main_오버플로우 {

	public static void main(String[]args) {
		byte a = 125;
		for (int i=0; i<5; i++) {
			a++;
			System.out.println(a);
		}
		
		System.out.println("------------------------");
		
		byte b = -125;
		for (int i=0; i<5; i++) {
			b--;
			System.out.println(b);
		}	
	}
}
