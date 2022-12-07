package _12월_6일;

import java.util.Scanner;

public class 원의넓이를구하는 {
		
		public static void main(String[] args) {
			
			final double PI =3.14;
			double radius;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("원의 반지름을 입력하세요");
			radius = scan.nextDouble();       //next = 다음 입력 대기
			
			System.out.println("원의 반지름은 "+ radius+ "입니다");
			
			System.out.println("원의 면적은" + radius * 2 *3.14);
			

			
		}
		
		

}
