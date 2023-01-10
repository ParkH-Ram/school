package this_Java;

import java.util.Scanner;

public class 이것이자바다_5장_7번문제 {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int[] arr = new int[hi.nextInt()];
		int max =0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = hi.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		
	}

}
