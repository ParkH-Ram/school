package _16_Lambda;

public class _4_Person {
	public void action(_4_Calculable cal, int a, int b) {
		
		// _4_Calculable 인터페이스에서 cal 객체를 만들어줌 
		//cal 안에 있는 calc 메서드에 10, 4의 값을 넣어줌
		int result = cal.calc(a, b);
		System.out.println("결과 : " + result);
	}

}
