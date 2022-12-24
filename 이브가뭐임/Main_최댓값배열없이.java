package 이브가뭐임;

import java.util.Scanner;

public class Main_최댓값배열없이 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	// 최댓값을 구하려면 일단 수를 입력 받을 때마다 값을 비교 해주면 
	// 필요한 변수 
	// 최댓값 담을 max 변수
	// 정수 수를 담을 a 변수
	// 입력한 정수 중 최댓값이 몇 번째 있는지 확인 할 b변수
	
	int a;        	//정수 담을 변수 
	int b=0; 		// 위치 찾기 위해 필요한 변수
	int h=0;			// 최댓값 위치 찾을 변수
	int c;		 	// for 돌려 줄 변수
	int max=-1;     //최댓값 
	
	for(c=1; c<10; c++) {      //c 가 10보다 작을때 c가 1씩 증가
		a = hi.nextInt();		//a= 입력 받을 정수
				// b 증가 ( 입력 받은 정수 전부 개수 체크 )
		  if(max<a) {				// max 가 a보다 작으면 
			  max = a;			// max는 a 
			  h = c;				// h = 위치 찾을 변수 
			//총 9번 도는 동안 h에 몇번 도는지를 체크 해줘야 밑에서 찾을 수 있음
			//이게 왜 갑자기 생각났는지 모름;;
		
			
		}
		
		
	}
	System.out.println(max + "\n" + h);
	hi.close();
	
	
	
	}
	
	
	
}
