package backjun;

import java.util.Scanner;

public class Main_평균값복습 {

	public static void main(String[]args) {

	Scanner hi = new Scanner(System.in);

	double max=0 ;     //입력 받은 값 중 최댓값  // 초기값은 0을 넣으면 동작이 오류 나는 경우가 있었는데 이 경우는 0을 넣어야 됐음.. 왜? ...
	int i;           // for 문 돌릴 변수  

 	double avg=0;         // 평균 변수

	double [] score  = new double[hi.nextInt()];  
	// double 스코어 = 뉴 더블 [ 입력]  첫 번째 입력 값이 배열 몇개를 정하는 거니

 	for(i=0; i<score.length; i++) {     //위에서 입력받은 랭스 만큼 돌려줌..
 		score[i]=hi.nextInt();      // 스코어 [i] <-- 0~ 랭스 수만큼 인덱스 수 생성 및 값 넣음.... 시발 .. 존나 쉽네... 
 		
 		if(max<score[i]) {   // max 보다 score[i]가 크면 값 교환
 			max = score[i];
 		}
 	}

 	for(i=0; i<score.length; i++) {
 		avg += (score[i]/max)*100;
 	}


 		System.out.println(avg/score.length);
 		hi.close();
 	}


}