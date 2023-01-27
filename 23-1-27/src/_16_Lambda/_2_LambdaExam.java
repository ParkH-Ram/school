package _16_Lambda;

public class _2_LambdaExam {
	public static void main(String[]args) {
		//_2_Person 생성자 생성
		_2_Person person = new _2_Person();
		
		//실행문이 두 개 이상인 경우 중괄호 필요
		person.action(() -> {
			System.out.println("출근");
			System.out.println("프로그래밍");
		});
		
		//실행문이 한 개일 경우 중괄호 생략 가능
		person.action(() -> System.out.println("hi"));
		
	}

}
