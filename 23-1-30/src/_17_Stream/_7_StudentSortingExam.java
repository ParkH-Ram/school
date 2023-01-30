package _17_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _7_StudentSortingExam {
	public static void main(String[]args) {
		
		//리스트 컬렉션 생성
		List<_7_Student>stu = new ArrayList<>();
		stu.add(new _7_Student("홍길만", 85));
		stu.add(new _7_Student("신길만", 95));
		stu.add(new _7_Student("박길만", 99));
		
		//정수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		stu.stream().sorted()
		.forEach(s -> System.out.println(s.getName() + ": "+ s.getscore()));
		System.out.println();
		System.out.println(stu);
		//체이닝 구조로 stu라는 리스트 컬렉션 구조를 끌고와서 바로바로 연결...? 
		
		
		stu.stream().sorted(Comparator.reverseOrder())
		
		.forEach(s->System.out.println(s.getName() + ": " + s.getscore()));
		
		//stu라는 주소..?는 동일
		System.out.println(stu);
	}	

}
