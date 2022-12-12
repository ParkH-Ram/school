package Array;

import java.util.Scanner;

public class ques_5점수입력받고정렬 {




public static void main (String[]args) {
	int temp = 0;
	int i, j;                 //i,j ,k 는 전역 변수로 지정 해야함
	int k;
	int stu = 0;
	int [] score = null;       //전역변수로  배열 설정 했을 때 오류 생긴 이유 확인 
	
	Scanner hi = new Scanner(System.in);
	System.out.printf("학생 수를 입력 하세요 > ");
	stu = hi.nextInt();
	score = new int[stu];  // 배열 지역 변수
	for(i = 0; i<stu; i++) {
	
		System.out.printf((i+1) +"번째 학생의 점수를 입력 하세요 > \t" );
		score[i] = hi.nextInt();
		
	}
	
	for(j=0; j<score.length;j++) {
		for (k=0;  k < score.length;k++){         //j 첫번째 배열을 입력 받아서 k의 수를 돌린다
  			if (score[j] < score[k]){             // 크기 비교
				temp = score[j];                   // 순서 바꿔주기
				score[j] = score[k];
				score[k] = temp;
			}
		}
	}
	for(i = 0; i<stu; i++) {
		System.out.print(score[i] + " ");
	}

	}	
}
	


	
	

