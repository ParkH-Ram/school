package Array;

import java.util.Scanner;

public class class_재귀짝수_quest {
	
	public static int wkrtn(int n) {
		if(n>0) {
			
			if(n % 2 ==0) {
				return wkrtn(n/10) +1 ;    // true 값을 1 더 해줌
				
			} else { 
				return wkrtn(n/10);
				
			}
		}
		else 
			return 0;
		
	}
	
	public static void main(String []args) {
		int num;
		
		Scanner hi = new Scanner(System.in);
		
		System.out.println("정수 입력");
		num = hi.nextInt();
		
		System.out.println(wkrtn(num));
	}
	

		
		
	
		
	
		
		
		
		
		
		
		
	
}
	
	
