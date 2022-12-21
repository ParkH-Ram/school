package backjun;

import java.util.Scanner;

public class Main_ApBm4 {

	public static void main(String[]args) {
		int a, b;
		Scanner hi =new Scanner(System.in);
		a = hi.nextInt();
		b = hi.nextInt();

		while (a<10 && a<10) { // 둘다 0이 아닐 때 들어와서 반복 마지막 입력은 0 0
			System.out.println(a+b);
			
			

			
			a = hi.nextInt();
			b = hi.nextInt();
		}		
		hi.close();

	}
}
