package _class;

import java.util.Scanner;

public class ���_���丮�� {
	
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
		System.out.println("������ �Է� �ϼ���");
		n = hi.nextLong();
		System.out.println(factorial(n));
		
		
		
	}


}
