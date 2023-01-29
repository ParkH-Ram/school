package _17_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _4_ArrayStreamExam {
	public static void main(String[]args) {
		String[] strA = {"홍길동", "박희", "넌 누구"};  // 그래 제네릭을 한번 선언하면 재사용 못하는걸 알았음. 
														//그럼 다시 쓸 방법 없나? 확인
		//문자열, 스트링 객체를 스트림<스트링타입>으로 얻음
		Stream<String> strStream = Arrays.stream(strA);
		
		//item  자리에 strA 배열 값들이 하나씩 들어가고 그걸 출력
		strStream.forEach(item -> System.out.print(item + " ,"));
		System.out.println();
		Integer[] intA = {1, 2, 3, 4, 5, 878, 33, 42};
		
		//오름차순 정렬
		Arrays.sort(intA);
		Stream<Integer> intStream = Arrays.stream(intA);
		intStream.forEach(item -> System.out.print(item + " ,"));	
	
		//스트림은 한번 초기값 바꾸면 값이 고정 되므로 다시 선언 해줘야 함
		
		Stream<Integer> intStream2 = Arrays.stream(intA);
		// 내림차순 정렬 //내림 차순은 정수형이아닌 정수객체 인티저로 선언
		Arrays.sort(intA, Collections.reverseOrder());
		//내림 차순하려면 제네릭 <Integer> 선언..   음 그냥 int형이면 -1 써서 포문으로 돌리는게 편할 수도
		System.out.println();
		
		//item 자리에 intA 배열 값들이 하나씩 들어가고 그걸 출력
		intStream2.forEach(item -> System.out.print(item + " ,"));	
		}

}
