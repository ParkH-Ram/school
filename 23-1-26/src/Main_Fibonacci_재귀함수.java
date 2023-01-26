import java.util.Scanner;


public class Main_Fibonacci_Àç±ÍÇÔ¼ö {
	static Scanner hi = new Scanner(System.in);

	static int Fibona(int num) {
		if(num==0) return 0;
		if(num==1) return 1;
		
		return Fibona(num-2)+Fibona(num-1); 
		
	}
	public static void main(String[]args) {
		
		int num=hi.nextInt();
		System.out.println(Fibona(num));
		hi.close();
	}


}
