package gogo;

import java.util.Scanner;

public class 문제3 {
	
	public static void main (String [] args) {
		
		int i ;              // 변수 생성 
		int sum =0 ;         // 합계 변수 생성 =0 (초기값 입력) 
		int hello;           // 입력 받을 변수 생성.
		
		Scanner hi = new Scanner(System.in);         //스캐너 생성    
		System.out.println("정수를 입력 하세요");	 //정수 입력 문구 생성
		hello = hi.nextInt();						 // 정수 입력 받을 스캐너 생성 
		
		
		for(i=1; i<=hello; i++) {                   // for 문 입력 
			sum += i;								// sum에 관한 조건식 생성
			System.out.println( i+"\t"+sum  );     //  출력 문 생성
			

			}
		
		
		hi.close();
	}

}
