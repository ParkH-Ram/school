package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _2_ParallelStreamExam {
	public static void main(String[]args) {
		//List 컬렉션 생성
		List<String>list = new ArrayList<>();
		for(int i=0; i<1000; i++) {
			list.add("홍길" + 1);
//		list.add("홍길");
//		list.add("홍만");
//		list.add("홍수");
//		list.add("홍나");
//		list.add("홍영");
//		list.add("홍우");
		}
		
		//병렬 처리 // 내부적으로 스레드 사용
		Stream<String> para = list.parallelStream(); // 병렬 스트림 얻기
		
		//람다식 요소 처리
		para.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});			//스레드의 참조를 얻고 스레드의 이름을 얻어서 출력해라
		
	}

}
