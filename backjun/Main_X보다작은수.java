package backjun;

import java.util.Scanner;

public class Main_X보다작은수 {
	
	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	int[] i;            //배열 선언 i[]
	int j;            // 배열 안에 들어갈 배열 수 (인덱스 수 )
	j = hi.nextInt();
	i= new int[j];
	int x = hi.nextInt();    // 주어지는 정수 값 (비교할 정수 값) 
 	int count=0;
 	int f;
 	for(f=0; f<i.length; f++) {    //인덱스라 0부터 시작
 		i[f] = hi.nextInt();
		
	}
 	
	for(int k=0; k<i.length; k++) {    //인덱스라 0부터 시작
		if(i[k]<x ) {
			System.out.print(i[k]+" ");
		}
		
	}
	

		
	}

}
