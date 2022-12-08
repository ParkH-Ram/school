package gogo;

import java.util.Scanner;

public class 문제 {
	
	public static void main (String[] args ) {
		
		String i;
		int j;
		int count = 0;
		
		
		Scanner hi = new Scanner(System.in);
		System.out.println("글자 입력");
		i = hi.nextLine();
		
		
		for(j=0; j<i.length(); j++ ) {
			if( i.charAt(j) != ' ' &&  i.charAt(j) != '\t' && i.charAt(j) != '\n') {
				// i.charAt i의 몇번째 문자를 가져올까
				//i에 입력된 글자를 계속 돌리면서 if 문 안에 있는 조건들을 읽어줌.
				count++;		
				// if가 i !=  같지 않으면 따라서 띄어쓰기, 탭, 줄바꾸기가 아니면
				// 글자를 카운팅 
			
			}
	
			
		}
		
		System.out.println("글자수 " + count);
		hi.close();
	}
}
