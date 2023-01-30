package _17_Stream;

import java.util.Arrays;

public class _9_MatchingExam {

	public static void main(String[] args) {
		int[]intA = {2, 4, 6, 8, 18};
		
					// allMatch =모두 
		boolean value = Arrays.stream(intA) //배열을 스트림으로 받아주고
						.allMatch(a -> a%2==0);
		System.out.println("모두 2으 배수니? " + value);

			//anyMatch 하나라도
		value = Arrays.stream(intA).anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수가 있니? " + value);
		
		//none 없는가?
		value = Arrays.stream(intA).noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없니? " + value);

	}

}
