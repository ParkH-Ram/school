package thisJava;

public class ServiceExam {

	public static void main(String[]args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Service ser = new ServiceImpl(); // 인터페이스는 객체로 못 만듬 
										// 객체로 만들 클래스를 생성해줌
		
		// 디폴트 메소드 호출
		ser.defaultMethod1();
		System.out.println();
		ser.defaultMethod2();
		
	}
}
