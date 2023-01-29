package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_StreamExam {
	public static void main(String[]args) {
		
		//List  컬렉션 생성
		List<_4_Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			//한번씩 실행 할따마다 프로덕트 생성      //Math.random() 0.0<= .... < 1.0
			// 가격이 0~9999원까지 랜덤으로 형성 되는 제품 5개를 생성
			_4_Product product = new _4_Product(i, "상품"+i, "너 상품된거야", (int)(10000*Math.random())); 
			
			list.add(product);
		}
		
		//객체 스트림
		Stream<_4_Product> stream = list.stream();
		
		//foreEach가 최종처리 하는 것
		//매개변수 p자리에 프로덕트가 하나씩 대입 되는거에요  
		// p를 출력 ( 자동으로 toString 됨 )
		stream.forEach(p -> System.out.println(p)); 
		
	}

}
