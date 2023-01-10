package this_Java;

import java.util.Scanner;

public class 이것이자바다_5장_9번문제 {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);   
		int button=0;               // 와일문 돌릴
		int [] score = null; 		//  점수 입력 배열 생성 초기값 널 
		int student=0;				// 입력 받을 학생	 
		int max=0;					// 최고 점수
		int sum=0;					// 총 점수
//				new int [hi.nextInt()];
		loop:  // 안에 있는 반복문에서 브레이크 해봤자 한커플 밖에 
				// 완전 나가고 싶을 때 반복문에 이름 :  <<콜론 앞에 이름 
				// break 이름;  해놓으면 이름 break; 밖 까지 무조건 나감
		while(true) {			//5가 아니라면  while문 작동 // 다시 안 들어오게 하려고  
		System.out.println("-------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");  //I Ga rit ㅋㅋㅋ 
		System.out.println("-------------------------------------------");
		System.out.printf("선택 > ");
		button = hi.nextInt();
		switch(button) {
			case 1:
				System.out.printf("학생수 > ");
				student = hi.nextInt();
				score = new int[student];
			break;
			
			case 2:
				for(int i=0; i<student; i++) {
					System.out.printf("score[" + i + "]: ");
					score[i] = hi.nextInt();
				}
				break;
			
			case 3:
				for(int i=0; i<student; i++) {
					System.out.println("score[" + i + "] > " + score[i] );
				}
				break;
			
			case 4:
				for(int i=0; i<student; i++) {
					if(max < score[i]){
						max = score[i];
						sum += score[i];
					}
				}
				System.out.println("총 점수 : " + sum);
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (sum/student));
				break;
			
			case 5:
				System.out.println("종료하삼");
				break loop;
		}
		
		}
		
	}
}
