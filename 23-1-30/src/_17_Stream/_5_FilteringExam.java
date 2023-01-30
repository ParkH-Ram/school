package _17_Stream;

import java.util.ArrayList;
import java.util.List;

public class _5_FilteringExam {
	public static void main(String[]args) {
		
		//List 컬렉션 생성 
		List<String> list = new ArrayList<>();
		list.add("박길동");   list.add("신길동");  list.add("김길동");
		list.add("홍길동");   list.add("마길동");
		
		//중복요소 제거 
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		//startsWith("스트링 값") 스트링 값으로 시작하면 true 리턴  
		list.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
		System.out.println();
	
	}

}
