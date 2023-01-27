package _16_Lambda;

public class _3_LambdaExam {

	public static void main(String[] args) {
		_3_Person person = new _3_Person();
		
		//매개변수가 두개일 경우
		person.action1((n, j) -> System.out.println(n +"이 \t" + j + "을       합니다"));
		
		person.action1((n,j) -> System.out.println(n+" "+j + "을 끝내다"));
		
		//매개 변수가 하나
		person.action2(s -> System.out.println(s));
		
		person.action2(s -> System.out.println(s+ " \t 닭 쳐!!!! 라고 말합니다 \n그렇게 닭볶음탕을 해먹었다고 한다."));
		
		
		

	}

}
