package Array;

import java.util.Scanner;

public class class_사칙연산 {
	
	public static void main (String[]args) {
		//사칙연산 메소드
		
		Scanner scan = new Scanner (System.in);
		
		int num1;
		int num2;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println(nPlus(3, 2));
		System.out.println(nPlus(3, 2, 1));
		System.out.println(nPluss(3, 2, 1));
		
		
		nPlus(num1, num2);        //gkq
		nMinus(num1, num2);		  //차
		nMulti(num1, num2);		//곱
		nDivide(num1, num2);	//나
		
	}
	
	public static int nPlus(int a, int b) {
		int sum;
		sum = a+b;
		System.out.println("두 수의 합은  "  + sum );
		return sum;
	}
	
	public static int nPlus(int a, int b, int c) {       // 세개로 갈 때는 두개에서 하나 추가 하면 됨~
		int sum;
		sum = a+b+c;
		System.out.println("두 수의 합은  "  + sum );
		return sum;
	}
	
	public static double nPluss(double a, double b, double c) {       // 소숫점은 double 로~ 
		double sum;
		sum = a+b+c;
		System.out.println("두 수의 합은  "  + sum );
		return sum;
	}
	
	public static void nMinus(int a, int b) {
		int sum;
		sum = a-b;
		System.out.println("두 수의 차는   "  + sum );
}

	public static void nMulti(int a, int b) {
		int sum;
		sum = a*b;
		System.out.println("두 수의 곱은   "  + sum );
}
	public static void nDivide(int a, int b) {
		double sum;
		sum = a/b;
		System.out.println("두 수의 나누기는   "  + sum );
}
}