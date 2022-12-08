package gogo;

import java.util.Scanner;

public class 점수입력카운트 {

	public static void main (String [] agrs) {
		// 90점 이상, 80점 이상, 70점 이상, 60점 이상, 60 미만
		// 점수를 입력  ( 종료 하려면 -1 ):
		
		int score, total=0;    //입력 받는 점수 , 몇 번 입력 되었는지;
		
		int Ac = 0;   //A ~ F 까지 몇명
		int Bc = 0;
		int Cc = 0;
		int Dc = 0;
		int Fc = 0;
		
		
		
		Scanner hi = new Scanner(System.in);
		System.out.printf("점수 입력 하세요. (종료 하려면 -1 입력) : ");
		score = hi.nextInt();
		
		//-1이 들어갈 때까지 반복 do while? //점수가 양수 일 동안 반복문 계속 한다.
		while (score >= 0) {
			//점수 들의 총수
			total++;
			
			//점수에 해당하는 학점을 1만큼 증가
			if (score >= 90) Ac++;
			else if (score >=80) Bc++;
			else if (score >=70) Cc++;
			else if (score >=60) Dc++;
			else Fc++;
			
			//다음 점수 입력 
			System.out.print("점수 입력 (종료하려면 -1 입력");
			score = hi.nextInt();
		}
		// 점수들의 총수 
		System.out.println();
		System.out.println("점수들의 총수 = " + total );
		System.out.println("A 학점 수 총수 = "+ Ac);
		System.out.println("B 학점 총수 = " + Bc);
		System.out.println("C 학점 총수 = " + Cc);
		System.out.println("D 학점 총수 = " + Dc);
		System.out.println("F 학점 총수 = " + Fc);
		
		
		
		
		
		hi.close();
	}
	
		
	
	
}
