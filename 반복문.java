package gogo;

import java.util.Scanner;
	
public class 반복문 {
	
	public static void main (String[]args) {
		//시험점수 0~ 100
		
		int score;  //시험 점수
		
		//시험 점수 읽음
		Scanner hi = new Scanner(System.in);
		System.out.println("시험점수를 입력하세(0~100");
		score = hi.nextInt();
		
		//사용자가 유요한 시험 점수를 입력 할 때 까지
		while(score <0 || score > 100) {
			System.out.println("범위를 벗어난 시험 점수 입력");
			System.out.println("시험 점수 (0과 100 사이의 정수) 입력");
			score = hi.nextInt();
		}
	 System.out.println("시험점수는 " + score);
	 hi.close();
	}
}