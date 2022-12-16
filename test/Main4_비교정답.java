package test;

import java.util.Scanner;

public class Main4_비교정답 {
	
	public static void main (String[]args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			System.out.println( ">");
		} else if (A < B) {
			System.out.println( "<");
		} else if ( A == B) {
			System.out.println( "==");
		}
			
		sc.close();
	
		
	}

}
