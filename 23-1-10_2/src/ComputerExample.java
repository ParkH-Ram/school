import java.util.Scanner;

public class ComputerExample {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		Computer myCom = new Computer();
		int result1 = myCom.sum(1, 2, 3);
		
		System.out.println(result1);
		
		int [] values = {1,2,3,4,5};
		int result2 = myCom.sum(values);
		System.out.println(result2);
		
		int result3 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println(result3);
		
		int result4 = myCom.sum(new int[] {55,44,33,22,11});
		System.out.println(result4);
		System.out.println((result4/5));
		
		
	}
}
