package backjun;

import java.util.*;

public class Main_OX퀴즈 {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		//ox 줄 수 파악
		int i = hi.nextInt();      
		hi.nextLine();    // enter  입력
		String score;	 	// 스트링 열 입력
		char [] Ox;        // OX 받을 배열 선언
		int count=0;       //O일때 측정
		int sum=0;         //합계
		for(int j=0; j<i; j++) {
			
			score = hi.nextLine();  // 라인으로 설정을 했을 때는 ENTER도 값으로  취급함
								    // 맨위에 설정 했을 때는 Enter 값으로 안 읽음
			Ox=score.toCharArray(); // 입력 받은 문자열을 캐릭터열로 하나하나 배열 값으로 받아줌
			
			for(int h=0; h<Ox.length; h++) {  //캐릭터 비교 반복문
				if(Ox[h] =='O' ){    //배열 값이 O 일때
					count++;         // 1씩 증가
					sum += count;    // 증가값 전부 더 하기
					// System.out.println(count+ " " + sum);
				} else{
					count =0;   // X 일 때 다시 초기화
				}
			}
			
			System.out.println(sum);
			sum=0;   // sum count 값 초기화
			count=0;
		}

		
		hi.close();
	}
}
