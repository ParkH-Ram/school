package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _12_CollectExam {
	public static void main(String[]args) {
		List<_12_Student> total = new ArrayList<>();
		total.add(new _12_Student("홍길동", "남", 99));
		total.add(new _12_Student("박길동", "여", 88));
		total.add(new _12_Student("남길동", "남", 95));
		total.add(new _12_Student("변길동", "여", 91));
		total.add(new _12_Student("권길동", "남", 75));
		
		//남학생만 묶어 List 생성
		List<_12_Student> maleList = total.stream().filter(s->s.getGender().equals("남")).collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		
		//버전 문제로 사용 불가
//		List<_12_Student> maleList = total.stream().filter(s->s.getGender().equals("남")).toList();
//		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//학생의 이름을 키로, 학생 점수를 값으로
		Map<String, Integer>map = total.stream().collect(
				Collectors.toMap(
						s -> s.getName(),  // 객체에서 키가 될 부분
						s -> s.getScore()  // 객체에서 값이 될 부분
						)
				);
		System.out.println(map);
		
		
	}
}
