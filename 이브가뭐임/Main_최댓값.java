package 이브가뭐임;

import java.util.Scanner;

public class Main_최댓값 {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i = new int[9];// 인덱스 9개를 가진 배열 선언
	    int j;				// i에 값 지정
	    int max;
	    int maxint=0;

	   
	    
	    for(j=0; j<9; j++) {
	    	  i[j] = hi.nextInt();
	    }
	    max =  i[0];
	    for(j=0; j<9; j++) {
	    	  if(max<i[j]) {
	    		  max = i[j];
	    		  maxint  =j+1;
	    	  }	
	    }
		System.out.println(max + "\n" + maxint);
	}
	
}