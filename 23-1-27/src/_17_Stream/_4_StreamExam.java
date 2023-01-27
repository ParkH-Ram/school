package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_StreamExam {
	public static void main(String[]args) {
		//List  컬렉션 생성
		List<_4_Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			_4_Product product = new _4_Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
			
			list.add(product);
		}
		
		//객체 스트림
		Stream<_4_Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p)); 
		
	}

}
