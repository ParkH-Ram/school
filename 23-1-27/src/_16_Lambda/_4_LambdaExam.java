package _16_Lambda;

import java.util.Scanner;

public class _4_LambdaExam {

	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		int s = hi.nextInt();
		int p = hi.nextInt();
		_4_Person per = new _4_Person(); // double, double 을 인수로 받는  
		
		//실행문이 두개일 경우
		per.action((a, b) ->{     //여기 부터
			int result = a + b;
			return result;		// 여기까지가 매개변수
		}, s, p);  //  s, p 도 매개 변수 
		
		//리턴문이 하나만 있을 경우 연산식
		
		//액션 매서드 안에 출력 println이 존재하므로 main 에서 따로 작성하지 않아도 출력 됨
		per.action((x, y) -> (x + y), hi.nextInt(), hi.nextInt());   //하나만 있을 때는 return 생략 가능    
		
		per.action((x,y) -> sum(x, y), hi.nextInt(), hi.nextInt()); // 결국에 인수 입력 받은 인수 두개로 action(x, y)를 시행
	}
	public static int sum(int x, int y) {
		return (x +(- y));
	}

}
