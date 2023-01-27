package _17_Stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class _1_StreamExam {
	public static void main(String[]args) {
		
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("홍동협");
		set.add("홍단현");
		
		//외부 반복자 이용
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		System.out.println();
		
		//내부 반복자 이용
//		Stream<String> stream = set.stream();
//		stream.forEach((item) -> {
//			System.out.println(item);
//		});
		// 내부 반복자 많이 줄임 
		Stream<String> stream = set.stream();
		stream.forEach(item -> 	System.out.println(item));
		
		
		
//		//Stream을 이용한 반복처리  		//스트림 얻기
//		Stream<String> stream2 = set.stream();
//		
//		//람다식 요소 처리
//		stream.forEach(name -> System.out.println(name));
	}

}
