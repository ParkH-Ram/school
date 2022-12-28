package 공부;

import java.util.Scanner;

public class Main_사칙연산 {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		
		int A, B;
		A=hi.nextInt();
		B=hi.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		hi.close();
		
	}
	
}
