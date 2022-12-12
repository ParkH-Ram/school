package Array;

import java.util.Scanner;

public class class_재귀_반복문_비교 {
	
	public static void main (String[]args) {
		
		int number; // 양의 정수
		Scanner hi = new Scanner(System.in);
		
		
		
		System.out.println("정수를 입력하세요");
		number = hi.nextInt();
			// 코드 삽입
		
		
		
		
		//getNumberOfzerosIter 메소드를 호출하여 양의 정수내에 있는 숫자
		
		
		//0의 개수를 구함
		System.out.println("반복결과 : " + getNumberOfzerosIter(number)+"개");
		
		//getNumberOfzerosRecur 메소드를 호출하여 양의 정수내에 있는 숫자
		System.out.println("재귀결과 : " + getNumberOfzerosRecur(number)+"개");
		
		
	}
	
	/* 
	 *  (n > 0) 내에 있는 숫자 0의 개수를 반환한다.
	 *  매개변수 : n - 넘겨 받은 양의 정수
	 *  반환 값 : n(> 0)내에 있는 숫자 0의 개수
	 *  지역변수 : count - 숫자 0의 개수
	 */
	
	public static int getNumberOfzerosIter(int n) {
		int count = 0; // 숫자 0의 개수
		
		
		//n이 두자리 이상의 숫자인 동안 다음을 반복한다
		while ( n >=10 ) {
			if(n % 10 ==0)
			count ++;
			
			
			//마지막 숫자를 제거한 나머지 정수를 구하는
			n = n / 10;
			
		}
		
		// 코드 입력
		
		return count;
	}
	/* 
	 *  (n > 0) 내에 있는 숫자 0의 개수를 반환한다.
	 *  매개변수 : n - 넘겨 받은 양의 정수
	 *  반환 값 : n(> 0)내에 있는 숫자 0의 개수
	 *  지역변수 : 없음
	 */
	
	public static int getNumberOfzerosRecur(int n) {
		if(n<10)
			return 0;      		// 마지막 숫자가 0이 아니다
		else if (n % 10 == 0 ) 
			//마지막 숫자가 0이면 마지막 숫자를 제거한 나머지 정수내역 숫자 0의 개수에 1을 더한다
			//count++같은 효과
			return getNumberOfzerosRecur(n / 10)+1 ;
		else 
			//마지막 숫자가 0이 아니면 마지막 숫자를 제거한 나머지 정수내의 숫자 0의 개수를 구한다.
			return getNumberOfzerosRecur(n / 10) ;
	
			
			
			//코드 삽입
		
	}
	
	
	
	
}
