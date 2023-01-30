package _17_Stream;

import java.util.Arrays;
import java.util.List;

public class _11_ReductionExam {
	public static void main(String[]args) {
		List<_11_Student> stu = Arrays.asList(
				new _11_Student("남길동스", 150),
				new _11_Student("홍길동스", 350),
				new _11_Student("박길동스", 450)
				);
		
		//방법1
		int sum1 = stu.stream().mapToInt(_11_Student :: getScore).sum();
		
		int sum2 = stu.stream().mapToInt(_11_Student :: getScore).reduce(0, (a,b)->a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
				
	}

}
