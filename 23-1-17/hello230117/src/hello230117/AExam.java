package hello230117;

public class AExam {
	
	public static void main(String[]args) {
		
		//A 객체 생성
		A a = new A();
		a.useB();
		
		//B 객체 생성 .찍으면 A 안에 있는 B 클래스
		A.B b = a.new B();
	}
	

}
