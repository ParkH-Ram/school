package _12월_6일;

import java.util.Scanner;

public class 합차계산 {

		public static void main(String[] args) {        
			int i, j;
			
			
			Scanner scan = new Scanner (System.in);		//클래스를 scan 객체로 변환
			
			System.out.println("1번 숫자 입력 ");       // 1번 숫자 입력 하세요 이라인
			i = scan.nextInt();				//          i는 입력 받은 숫자 
			System.out.println("2번 숫자 입력 ");
			j = scan.nextInt();				//숫자 입력
			
			System.out.println((i+j) + "\t" + (i-j) + "\t" + (i*j)); // 문자열이랑 숫자열을 더할 때는 ( ) 해주기


			
	 
 }
}
