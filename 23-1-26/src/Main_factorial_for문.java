import java.util.Scanner;
public class Main_factorial_for�� {
	public static int fact(int num) {
		int sum=1;
		for(int i=1; i<=num; i++) {
			sum *=i;
			
		}
		return sum;     //��� ���� �� �����Ѵ�
	}
	static Scanner hi = new Scanner(System.in);
	public static void main(String[]args) {
		int num = hi.nextInt();
		
		System.out.println(fact(num));
	
	hi.close();
	}
	

}
