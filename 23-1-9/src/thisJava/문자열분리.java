package thisJava;

public class 문자열분리 {
	
	public static void main(String[]args) {
		
		String board = "1, 자바 학습, 참조타입 String을 학습합니다., 홍길동";
		
		//문자열 분리
		
		String [] tokens = board.split(",");  // ,이걸로 구분 하겄다
		
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]);
		
		for (int i=0; i<tokens.length; i++) {   // 배열은  () 안 붙임. 이유는 쉬벌
			System.out.println(tokens[i]);
		}
		
	}

}
