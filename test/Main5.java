package test;

import java.util.Scanner;

public class Main5 {
	
	public static void main (String[]args) {
		int A;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		
		
		
		if ( A<=100) {
		} else if(90 >= 100) {
			System.out.println( "A");
		} else if (80 >= 89) {
			System.out.println( "B");
		} else if ( 70>=79) {
			System.out.println( "C");
		} else if ( 60>=69) {
			System.out.println( "D");
		} else  {
			System.out.println( "F");
		}
		sc.close();
	}
		
	
		
	

}

