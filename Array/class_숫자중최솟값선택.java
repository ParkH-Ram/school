package Array;

import java.util.Scanner;

public class class_숫자중최솟값선택 {
	public static int findMin(int number1, int number2) {
			//과정1. 최솟값을 저장하는 변수 minimum 선언
			int minimum;
			
			//과정2. 최솟값은 두 정수를 비교하여 작은 값으로 한다.
			if (number1 < number2)
				minimum = number1;
			else 
				minimum = number2;
			
			//과정3. 최솟값 반환
			return minimum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimum1;
		Scanner hi = new Scanner(System.in);
		
		minimum1 = findMin(20, 30);
		
		System.out.print("두개의 정수 값중 작은거슨" +minimum1);


	}

}