package backjun;

import java.util.Scanner;

public class Main_별찍기_기본 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	
	int a;		     // 초기 입력 값
	
	a = hi.nextInt(); 
		
			//이중 for 문을 활용해 
	
	 for(int i=1; i<=a; i++){
		 
		 for(int j=1; j<=i; j++)
			 //i = 1일 때 j = 1 을 용해서 끝날 때 다시 i로 돌아가서 내려 와서 2개 받고 2개 출력하고 이런식
		 System.out.print("★");
		 System.out.print("\n");

	 }
	 hi.close();
		 
	}
}
