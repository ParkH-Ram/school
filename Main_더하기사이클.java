package backjun;

import java.util.Scanner;

public class Main_더하기사이클 {
	
	public static void main(String[]args) {
		
		int a,					//초기값
			b,					//a / 10  값
			c,					//a % 10 값
			d,					// b+c 값
			sum;
			//b + c를 %10 한 값
		int	summax=0;			// sum + c 한 값
		int	count=0;
	
	
		Scanner hi = new Scanner(System.in);
		a = hi.nextInt();
		summax=a; // 입력값 하고 summax하고 동기화 
		
		do {             //do 조건을 실행 시키고 
						// while로 조건 확인
		
		
			b = summax/10;
			c = summax%10;
			d = b + c;
			sum = d%10;
			summax = sum + c*10;     
			//summax = a 로 설정  그래서 do while을 "써서 무조건 한번 진입 해야 됨
			
		count++;
			
		}while(a!=summax);
	
		System.out.println(count);
	hi.close();
	
	}
}
