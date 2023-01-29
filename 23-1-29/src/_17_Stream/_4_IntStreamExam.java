package _17_Stream;

import java.util.stream.IntStream;

public class _4_IntStreamExam {
	public static int sum;
	
	public static void main(String[]args) {
		//1~1억까지 stream을 얻어옴  숫자가 커질 수록 뭔가 이상해짐 확인
		IntStream stream = IntStream.rangeClosed(1, 100000);
		
		//자동 형변환 후 sum에 누적
		stream.forEach(a-> sum += a);
		System.out.println(sum);
	}
}
