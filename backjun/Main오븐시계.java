package backjun;

import java.util.Scanner;

public class Main오븐시계 {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int h;
		int m;

		int c;     //걸리는 시간
		int min;   // 분이 60넘어 갈때마다 체크



		
		
		h= hi.nextInt();
		m= hi.nextInt();
		c= hi.nextInt();
		
		min = (h*60)+m;
		min += c;
		
		
		h = (min/60)%24;    // 몫을 뺀 나머지를 취한다.  24를 못 넘게 하려고
		m = min % 60;		// 

		
	
			System.out.println(h + " " + m); 
				
			  //24로 나눈 나머지가 입력
			hi.close();
			}
			
		

	

}
