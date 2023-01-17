package hello230117;

public class Cexam {

	public static void main(String[] args) {
		
		//d 객체를 생성해서 인스턴스 멤버에 접근
		C.D d = new C.D();
		System.out.println(d.field1);
		d.method1();
		//인스턴스 멤버 중첩 B 객체 생성
		
		// 클래스 멤버에는 클래스명.클래스명.클래스멤버
		System.out.println(C.D.field2);
		C.D.method2();
		

	}

}
