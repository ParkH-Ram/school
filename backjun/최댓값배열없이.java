package backjun;

import java.util.Scanner;

public class Main_최댓값 {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i = new int[9];// 인덱스 9개를 가진 배열 선언
	    int value;         		// 인덱스 안에 들어갈 값
	    int max;				// 최댓값
	    int count=0;			// 몇번째에 최댓값이 있는지 
	 
	    
	    for(value=0; value<i.length; value++) {   //배열안에 넣으려면 포문을 두개 만들어야 함
	    	//i안에 입력 된 인덱스 수를 돌려 줌 
	    	i[value] = hi.nextInt();      //i[value] 안에 cacao 값 ( 정수 입력 ) 을 넣음
	    }
	
	    max = i[0];// 최댓값     // 값을 넣어 준 뒤 밑에서 인덱스를 받아야 함
	    for(value=0; value<i.length; value++) {
	    	//갱신할 때 들어오고 아니면 지나쳐 가니까
	    	// 이값이 마지막 max값이 됨
	    
	    	if(max < i[value]) {
	    	   max = i[value];
	    	   count=value + 1;
	    	   }
		 
	
	    
	    }
	    System.out.println(count + " " + max );
	    hi.close();

	}
	
	
	
	
}
	

