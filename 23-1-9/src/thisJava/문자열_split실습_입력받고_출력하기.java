package thisJava;

import java.util.Scanner;

public class 문자열_split실습_입력받고_출력하기 {

	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("이름 학번 학과 입력하세요 ( 이름/학번/학과)");
		String name = hi.nextLine();
		String [] tokens = name.split("/");    //  /이걸로 구분 되는 구간을 자르겄다.
		
		System.out.println("이름: " + tokens[0]);
		System.out.println("학번: " + tokens[1]);
		System.out.println("컴퓨터공학과: " + tokens[2]);
	
	
		System.out.println("이름 입력");
		String str = hi.nextLine();
		System.out.println("생년월일 입력 (mm/dd/yy)");
		String birth = hi.nextLine();
		String [] test = birth.split("/");
		
		System.out.println("이름 : " + str);
		System.out.println("생년월일: " + test[2]+"년 "+test[0]+"월 " + test[1]+"일");
		
		
		
		
//
//		이름 학번 학과 입력 했을 때 
//		이름 : 홍길동
//		학번 :
//		학과 : 
//		
//		이름 입력 : 홍길동
//		생년월일 (mmddyy)읍력 :
//			
//		이름
//		생년월일 
//			
//			
			
			
			
			
			
			
		

	}

}
