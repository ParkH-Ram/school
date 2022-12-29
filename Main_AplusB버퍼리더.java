package 공부;

import java.util.Scanner;

public class Main_AplusB버퍼리더 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int a,b,c;
	
	a=hi.nextInt();
	for(int i=1; i<=a; i++) {
		b=hi.nextInt();
		c=hi.nextInt();
		
		
	System.out.println(b+c);
	}
	
	
	hi.close();
		
	}

}
