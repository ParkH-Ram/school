package _17_Stream;

import java.util.Arrays;
import java.util.Scanner;

public class _10_AggregateExam {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		
		//정수 배열
		int[] arr = new int [hi.nextInt()];
		for (int i=0; i<arr.length; i++) {
			arr[i] = hi.nextInt();
			
		}
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i]<min) min = arr[i];
		}
		System.out.println("최소값은 : " + min );
		
		//카운팅 
		long count = Arrays.stream(arr).filter(n-> n%2==0).count();
		System.out.println("2으 배수의 개수 : " + count);

		//총합
		long sum = Arrays.stream(arr).filter(n-> n%2==0).sum();
		System.out.println("2으 배수의 총합 : " + sum);
		
		//평균
		double avg = Arrays.stream(arr).filter(n-> n%2==0).average().getAsDouble();
		// average로 바꾼 뒤 long type을 Double 값으로 출력하기 위해
		
		System.out.println("2의 배수 평균 : " + avg);
		
		//최댓값
		int max = Arrays.stream(arr).filter(n-> n%1==0).max().getAsInt();
		// average로 바꾼 뒤 long type을 Integer형태를 Int로 변환 후 출력하기 위해 getAsInt() 사용
		
		System.out.println("전체 중 최댓값 : " + max);

		//최솟값
		int mins = Arrays.stream(arr).min().getAsInt();
		//average로 바꾼 뒤 long type을 Integer형태를 Int로 변환 후 출력하기 위해 getAsInt() 사용
		
		System.out.println("전체 중 최솟값 : " + mins);
		
		
	}

}
