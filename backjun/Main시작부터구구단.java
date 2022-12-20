package backjun;

import java.util.Scanner;

public class Main시작부터구구단 {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		int i, j;
		
		j = hi.nextInt();
		
		for(i=1; i<10; i++) {
		System.out.println(j+" * " + i+" = " + i*j);
		}
		
		hi.close();

	}

}
