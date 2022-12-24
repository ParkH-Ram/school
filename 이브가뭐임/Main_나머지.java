package 이브가뭐임;

import java.util.Scanner;

public class Main_나머지 {

	public static void main(String[] args) {
		// 정수 10개를 입력 받고 그 값을  42로 나눈 나머지 중
		//  다른 값이  몇 개 있는지 파악 하시오
	
	Scanner hi = new Scanner(System.in);
	
	int [] reMain = new int[42];
	int i;
	int h;          // 반복문 돌릴 변수 
	int count=0;    // 나머지 값을 1로 바꾼 애들을 체크 하는 함수
	
	for(h=0; h<10; h++ ) {
		reMain[hi.nextInt() % 42] = 1 ;     
		// 입력 받은 숫자를 42로 나눈 나머지를 구하고
		// 그 인덱스의 값을 1로  입력안한 애들은 0이 됨
	}
	for(i=0; i<42; i++) { 
		if(reMain[i]==1) {      
			// 배열을 돌면서 (인덱스 0~41) 까지 돌면서 1인 애들 개수를 파악
			count++;
		}
	}
	System.out.println(count);
	hi.close();
		
	}

}
