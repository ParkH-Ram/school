package 공부;

import java.util.Scanner;

public class Main_숫자의합 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int sum=0;

	String b;				//스트링 받을 b 선언

	int a = hi.nextInt();   // 처음 입력 받을 숫자 선언	
	hi.nextLine();			// 엔터 값 입력
	b = hi.nextLine();		// 숫자열 입력
	for (int i=0; i<a; i++) {		// 입력한 만큼 숫자를 
		sum += (int)b.charAt(i)-48;
		// 아스키코드로 하나씩 쪼개줌  []인덱스 번호로 받아줌  값 하나씩 다 더해줌 
		// 48이 0이라 빼줌 인덱스 0번으로 받기 위해 0을 빼줌
	}
	System.out.println(sum);             
	
	hi.close();
	}

}
