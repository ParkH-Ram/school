package backjun;

import java.util.Scanner;

public class Main_ApBm4 {

	public static void main(String[]args) {
		int a, b;
		Scanner hi =new Scanner(System.in);
		a = hi.nextInt();
		b = hi.nextInt();

		while (a<10 && a<10) { // �Ѵ� 0�� �ƴ� �� ���ͼ� �ݺ� ������ �Է��� 0 0
			System.out.println(a+b);
			
			

			
			a = hi.nextInt();
			b = hi.nextInt();
		}		
		hi.close();

	}
}
