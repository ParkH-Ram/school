package _16_Lambda;

public class _5_MethodReferenceExam {
	public static void main(String[]args) {
		_5_Person per = new _5_Person();
		
		
		//정적 메소드일 경우
		// 람다식
		//per.action((x, y) -> _5_Computer.staticMethod(x, y));
		//메소드 참조
		per.action(_5_Computer :: staticMethod);
		
		//인스턴스 메소드일 경우
		_5_Computer com = new _5_Computer();
		//람다식
		//person.action((x, y) -> com.instanceMethod(x, y));
		//메소드 참조
		per.action(com :: instanceMethod);
		
		
	}

}
