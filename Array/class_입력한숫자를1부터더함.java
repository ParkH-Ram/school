package Array;

import java.util.Scanner;

public class class_입력한숫자를1부터더함 {
	
	public static int findSum(int n) {
		// 합을 저장하는 변수
		
		int sum;
		
		// n이 1이라면 합은 1 아니라면 n-1에다가 + n
		if ( n == 1)
			sum = 1;
		else //  n이 2 이상이라면 
			sum = findSum(n-1) + n; 
		// 지를 호출해서 값에 -1을하고 + n 을 해준다.
		
		//합을 리턴
		return sum;
		
	}	
	
	public static void main (String[]args) {
		
		//임의의 숫자를 입력 받아 하나씩 더하기 
		
		Scanner hi = new Scanner(System.in);
		int number;    
		System.out.println("숫자를 입력해 보아");
		number = hi.nextInt();
		
		System.out.println(number+"아라라라라"+findSum(number));
		
		
		
		
		
	}

}
