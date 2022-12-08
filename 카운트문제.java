package gogo;

import java.util.Scanner;

public class 카운트문제 {
	
	public static void main(String[]args) {
		
		int hak;//학생 점수
		int stu = 0;// 학생 수
		int pass = 0;// 통과 학생 수
		int re = 0; // 낙제 학생 수
		
		//키보드 입력
		Scanner hi = new Scanner(System.in);
		
		
		//첫 번째 점수를 읽고  
		System.out.printf("점수(종료하려면 음수)를 입력 하세요 : ");
		hak = hi.nextInt();
		
		//정수가 음수가 아닌 동안 반복
		while (hak >= 0) {
		  stu++;// 학생수를 1만큼 증가
		 	// 여기에 코드 삽입
			
		  if(hak>=60 ) pass++;// 점수가 60점 이상이면 통과 학생 1 증가
		  else re++;// 아니면 낙제 학생 1 증가
		  
			System.out.printf("점수(종료하려면 음수)를 입력 하세요 : ");
			hak = hi.nextInt();//다음 점수 읽고
			//여기에 코드 삽입 
			
		}
          System.out.println("학생 들의 수 " + stu);
		  System.out.println("통과 학생 수 " + pass);
		  System.out.println("낙제 학생 수 " + re);
		  
		  hi.close();
	}

}
