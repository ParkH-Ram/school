package backjun;

import java.util.Scanner;

public class Main영수증 {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		int x, n, a, b;
		int sum=0;
		
		x = hi.nextInt();       //총 금액
		n = hi.nextInt();		//물건 종류 파악
	
		for(int i=1; i<=n; i++) {
			
			a = hi.nextInt();		// 물건 마다 가격
			b = hi.nextInt();		// 물건 마다 개수 
			
			sum += a*b;
		}
		
		System.out.println((x==sum)? "Yes" : "No");  
				
		hi.close();
		
	}

}
