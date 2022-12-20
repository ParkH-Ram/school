package backjun;

import java.util.Scanner;

public class Main전체합 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	int n = hi.nextInt();
	int sum=0;
	
	for(int i=1; i<=n; i++) {
		 sum += i;       //i 로 출력 되는 값을 sum하고 더해준다.
		
	}
	 System.out.println(sum);
	}

}
