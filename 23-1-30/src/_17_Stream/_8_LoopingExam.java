package _17_Stream;

import java.util.Arrays;

public class _8_LoopingExam {
	public static void main(String[]args) {
		int[] intA = { 2 , 4 ,6 ,7, 9 , 11, 15};
		
		//잘못 작성
		Arrays.stream(intA)
		.filter(a -> a%2==0).peek( n-> System.out.println(n));
		
		//중간처리 메소드 peek()이용해서  반복처리
		//2의 배수만 찾기
		// 최종처리
		System.out.println("총합 :" +  Arrays.stream(intA).filter(a-> a%2==0).peek(n->System.out.println(n))//동작함? 왜?
				.sum()); // 최종처리에 sum이 들어가서 출력 가능
		System.out.println();
		
		//최종 처리가 없으면 출력 되지 않음
		Arrays.stream(intA).filter(a -> a%2 ==0).forEach(n->System.out.println(n))	;
	}

}
