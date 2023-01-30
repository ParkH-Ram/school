package _17_Stream;

import java.util.ArrayList;

import java.util.List;
public class _7_Student2SortingExam2 {

	public static void main(String[] args) {
		List<_7_Student2> list = new ArrayList<>();
		list.add(new _7_Student2("홍길만", 85));
		list.add(new _7_Student2("신길만", 95));
		list.add(new _7_Student2("박길만", 99));
		
		//점수 기준 정렬
		//오름 차순 정렬
		list.stream().sorted((s1, s2)->Integer.compare(s1.getscore(), s2.getscore()))
		.forEach(s -> System.out.println(s.getName() + s.getscore()));
		System.out.println();
		
		//내림 차순은 compare(s1, s2 위치만 바꿔주면 됨)
		list.stream().sorted((s1, s2)->Integer.compare(s2.getscore(), s1.getscore()))
		.forEach(s -> System.out.println(s.getName() + s.getscore()));
//		list.stream() ~ forEach(s -> 출력 까지) 한줄
	}            

}
