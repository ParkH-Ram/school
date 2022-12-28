package 공부;

import java.util.Scanner;

public class Main_나머지는얼마인가 {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int A,B,C;
	
	A=hi.nextInt();
	B=hi.nextInt();
	C=hi.nextInt();
	System.out.println((A+B)%C);
	System.out.println(((A%C)+(B%C))%C);
	System.out.println((A*B)%C);
	System.out.println(((A%C)*(B%C))%C);

	hi.close();
	}
	
}
