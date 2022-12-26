package backjun;

import java.util.*;

public class Main_한수 {

	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int value; 	//  입렵값
		int h3;      // 100의 자리 
		int h2;		//  10의 자리
		int h1; 	//  1자리
		int temp;
		int count=0;
		value = hi.nextInt();
		int i = 1;
		while(i <= value) {
			h3 = i/100;			// value를 100으로 나눈 
			temp = i% 100;    	//100으로 나눈 나머지 
			h2 = temp/10;          //100으로 나눈 나머지는 10으로 다시 나눔
			h1 = temp%10;          // 10으로 나눈 나머지 값
			
			if(h3>0) {
				if(h3-h2 == h2-h1) count++;
			}else count++;
			i++;
		}
		System.out.println(count);
	}
	
}
