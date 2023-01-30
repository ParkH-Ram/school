package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _12_CollectExam2 {
	public static void main(String[]args) {
		List<_12_Student> total = new ArrayList<>();
		total.add(new _12_Student("홍길동", "남", 99));
		total.add(new _12_Student("박길동", "여", 88));
		total.add(new _12_Student("남길동", "남", 95));
		total.add(new _12_Student("변길동", "여", 91));
		total.add(new _12_Student("권길동", "남", 75));
		

		
		//학생의 이름을 키로, 학생 점수를 값으로
		Map<String, Double>map = total.stream()
				.collect(
					Collectors.groupingBy(
						s -> s.getGender(),
						Collectors.averagingDouble(s->s.getScore())
					)
				);
		System.out.println(map);
		
		
	}
}
