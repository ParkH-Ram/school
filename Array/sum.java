package Array;
import java.util.Scanner;
public class sum {
	
	public static int totalsum(int i) {

		int sum=0;
		
		sum = i + totalsum(i-1); 
		// i를 입력  totalsum(i-1)값으로  i를 다시 호출
		  
		 return i;
	}
	
		
		
		

		

	
		
		
	public static void main (String[]args) {
		
		int add;
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자 입력 > ");
		add = totalsum(scan.nextInt());
				

		System.out.print(add);
		
		
	}

}
