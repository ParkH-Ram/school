package backjun;

import java.util.Scanner;

public class Main_별찍기2 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	
	int a; 		     // 초기 입력 값
	a = hi.nextInt(); 
		
			//이중 for 문을 활용해 
	
	 for (int k=1; k<=a; k++) {    // 큰 포만 안에 작은 포문 두개를 넣어서 두개를 중복포문 돌림
		 
	
		 for(int i=1; i<=a-k; i++){  //입력 받은 값에서 - 시작점을 빼야  빈칸을 채우고 시작.
		 System.out.printf(" ");}
		 
		 for(int j=1; j<=k; j++) {
			 //i = 1일 때 j = 1 을 용해서 끝날 때 다시 i로 돌아가서 내려 와서 2개 받고 2개 출력하고 이런식
		 System.out.printf("*");
		 
		 }
		 System.out.printf("\n");
	 
	 
	 
		 
	}
	 hi.close();
}
}
