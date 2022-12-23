package backjun;

import java.util.Scanner;

public class Main_최소최대 {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i;// 배열  선언
	    int j = hi.nextInt();// 배열에 들어가는 인덱스 수 입력 
	    i = new int[j];// 배열안에 (i[]안에 j수 삽입 
	
	    int value;          // for문 돌릴 변수  ( j에 값 입력
	    int cacao;    // 인덱스 안에 들어갈 값
	    int min;
	    int max;
	 
	    
	    for(value=0; value<i.length; value++) {   //배열안에 넣으려면 포문을 두개 만들어야 함
	    	//i안에 입력 된 인덱스 수를 돌려 줌 
	    	cacao = hi.nextInt();
	    	i[value] = cacao;      //i[value] 안에 cacao 값 ( 정수 입력 ) 을 넣음
	    }
	    min = i[0];// 최솟값  i 값의 첫 번째 빼열 부터 
	    max = i[0];// 최댓값     // 값을 넣어 준 뒤 밑에서 인덱스를 받아야 함
	    for(value=0; value<i.length; value++) {
	    	//배열을 돌리면서 값 비교
	    
	    	if(min > i[value]) 
	    		min = i[value];
	    	
	    	if(max < i[value])
	    		max = i[value];
	    		
	    }
	    
	    
	    
	    System.out.println(min+" "+ max);
	    
	    
	    hi.close();
	    
	    }
	    

	
	
	
	
}
	

