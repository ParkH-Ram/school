import java.util.Scanner;


public class Main_Fibonacci {
	static Scanner hi = new Scanner(System.in);

	static int Fibona(int num) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=1; i<=num; i++ ) {
			c = a+b;  
			a = b;
			b = c;
		}
		return a;
	}
	public static void main(String[]args) {
		
		int num=hi.nextInt();
		System.out.println(Fibona(num));
		hi.close();
	}


}
