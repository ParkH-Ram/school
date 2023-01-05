package git_test;

import java.util.Scanner;

public class Main_더하기사이클복습 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
		int value;      // 입력 값 
		int count=0;    // 사이클 횟수 카운트
		int a,b;        // a는 10의 자리 b는 1의 자리
		int sum;        // 나머지 자리들을 더한
		int first;
		value = hi.nextInt();    // 초기값을 입력
		first=value;   // 초기값을 받아줌
		do {
			a = value/10;
			b = value%10;
			sum = a+b;
			value = (b*10)+(sum%10);  // 밸류 값을 초기화 ... 흠 ..
			count ++;
		}while(value!=first);
		
		//true 면 반복 false 면 나옴 
		// do while 식 
		

		
		System.out.println(count);
	
	
	}
	
}
