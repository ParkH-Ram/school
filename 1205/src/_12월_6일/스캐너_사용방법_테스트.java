package _12월_6일;

import java.util.Scanner;      //Scanner 라는 입력 클래스 호출

public class 스캐너_사용방법_테스트 { 
	public static void main(String[] args) {        
	
		Scanner scan = new Scanner (System.in);		//클래스를 scan 객체로 변환
		
		System.out.println("출력할 문자 입력 ");
		String str = scan.nextLine();				//한줄로 문자를 입력 받는다
		
		System.out.print(str); 						// 입력 받은 문자열을 출력
		
	}
}
