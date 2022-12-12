package Array;

import java.util.Scanner;

public class class_사칙연산_quest {
	// 매개 변수
	
public static int nplus(int a, int b) {
		
		int	sum = a + b;
		System.out.println("2개 더하기는" + sum );
		return sum;
	}
	public static int nplus(int a, int b, int c) {
		
		int	sum = a + b + c;
		System.out.println("3개 더하기는" + sum );
		return sum;
		
	}
	public static int nMin(int a, int b) {
		
		int	sum = a - b;
		System.out.println("2개 빼기는" + sum );
		return sum;
	}
	public static int nMin(int a, int b, int c) {
		
		int	sum = a - b - c;
		System.out.println("3개 빼기는" + sum);
		return sum;
	}
	public static int nMulti(int a, int b) {
		
		int	sum = a * b;
		System.out.println("2개 곱하기는" + sum );
		return sum;
	}
	public static int nMulti(int a, int b, int c) {
		
		int	sum = a * b * c;
		System.out.println("3개 곱하기는" + sum);
		return sum;
	}
	public static double nDiv(double a, double b) {
		
		double	sum = a / b;
		System.out.println("2개 나누기는" + sum );
		return sum;
	}
	public static double nDiv(double a, double b, double c) {
		
		double	sum = a / b / c;
		System.out.println("3개 나누기는" + sum);
		return sum;
	}
	
	
	public static void main (String[]args) {
		//사칙연산 메소드
		
		Scanner scan = new Scanner (System.in);
		
		
		
		int num1;
		int num2;
		int num3;
		
		

		
		System.out.println("정수 입력 하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		
		nplus(num1, num2);
		nplus(num1, num2, num3);
		nMin(num1, num2);
		nMin(num1, num2, num3);
		nMulti(num1, num2);
		nMulti(num1, num2, num3);
		nDiv(num1,num2);
		nDiv(num1,num2,num3);
		

		
		
	}
	

}

