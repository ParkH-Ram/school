import java.util.Scanner;
public class Main_factorial_for문 {
	public static int fact(int num) {
		int sum=1;
		for(int i=1; i<=num; i++) {
			sum *=i;
			
		}
		return sum;     //모두 곱한 뒤 리턴한다
	}
	static Scanner hi = new Scanner(System.in);
	public static void main(String[]args) {
		int num = hi.nextInt();
		
		System.out.println(fact(num));
	
	hi.close();
	}
	

}
