package Array;

import java.util.Scanner;

public class class_사칙연산_quest2 {

public static int nplus(int a, int b) {
		
		int	sum = a + b;

		return sum;
	}
	public static int nplus(int a, int b, int c) {
		
		int	sum = a + b + c;
	
		return sum;
		
	}
	public static int nMin(int a, int b) {
		
		int	sum = a - b;
	
		return sum;
	}
	public static int nMin(int a, int b, int c) {
		
		int	sum = a - b - c;

		return sum;
	}
	public static int nMulti(int a, int b) {
		
		int	sum = a * b;

		return sum;
	}
	public static int nMulti(int a, int b, int c) {
		
		int	sum = a * b * c;

		return sum;
	}
	public static double nDiv(double a, double b) {
		
		double	sum = a / b;

		return sum;
	}
	public static double nDiv(double a, double b, double c) {
		
		double	sum = a / b / c;

		return sum;
	}
	
	
	public static void main (String[]args) {
		//사칙연산 메소드
		
		Scanner scan = new Scanner (System.in);
		
		int num = 0; 
		
		System.out.println("2 or 3 선택해주세요");
		num = scan.nextInt();
		
		switch(num) {
			case 2 :
				int a;
				int b;
				
				System.out.println("정수를 입력 해 주 세 요 ");
				a = scan.nextInt();
				b = scan.nextInt();
				
				System.out.println("입력한 정수의 합은 "  + nplus(a, b));
				System.out.println("입력한 정수의 차는 " + nMin(a,b));
				System.out.println("입력한 정수의 곱은 " + nMulti(a,b));
				System.out.println("입력한 정수의 나눗셈은" + nDiv(a,b));
				
				
			
			break;
			
			
			case 3  :
				int c;
				int d;
				int e;
				System.out.println("정수를 입력 해 주 세 요 ");
				c = scan.nextInt();
				d = scan.nextInt();
				e = scan.nextInt();
				
				System.out.println("입력한 정수의 합은 "  + nplus(c, d, e));
				System.out.println("입력한 정수의 차는 " + nMin(c, d, e));
				System.out.println("입력한 정수의 곱은 " + nMulti(c, d, e));
				System.out.println("입력한 정수의 나눗셈은" + nDiv(c, d, e));
				
				
				
			
			break;
		}

		

		
		
		
}
}

