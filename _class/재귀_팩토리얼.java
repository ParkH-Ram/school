package _class;

import java.util.Scanner;

public class 재귀_팩토리얼 {
	
	public static long factorial(long n) {
		if (n <= 1) {        

			return 1;

		}

		else {

			return factorial(n-1) * n;
		
	}
	}	

	
	
	public static void main (String[]args) {
		
		long n;
		
		Scanner hi = new Scanner(System.in);
		System.out.println("정수를 입력 하세요");
		n = hi.nextLong();
		System.out.println(factorial(n));
		
		
		
	}


}
