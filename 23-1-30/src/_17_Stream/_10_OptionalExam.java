package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class _10_OptionalExam {
	public static void main(String[]args) {
		List<Integer>list = new ArrayList<>();
		
		//예외 발생 (java.util.noSuchElementException)
		//double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		
		//방법1
		OptionalDouble option = list.stream().mapToInt(Integer :: intValue).average();
		
		//집계값 여부에 따라 동작이 다르게 작동
		if(option.isPresent()) System.out.println("방버1 평균 : " + option.getAsDouble());
		else System.out.println("방법1 평균  : 0.0");
		
		//방법 2
		double avg = list.stream().mapToInt(Integer :: intValue)
				.average().orElse(0.0);
		System.out.println("방법 2 평균 : " + avg);
		
		//방법 3
		list.stream().mapToInt(Integer :: intValue).average()
			.ifPresent(a -> System.out.println("방법 3 평균 : " + a));
		
		
	}

}
