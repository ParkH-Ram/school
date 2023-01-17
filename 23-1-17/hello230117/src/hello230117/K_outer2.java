package hello230117;

public class K_outer2 {
	
	String field = "K-field";
	
	void method() {
		System.out.println("K-method");
	}
	
	class L{
		String field = "L-field";
	void method() {
		System.out.println("L-method");
	}
	void print() {
		System.out.println(this.field);
		this.method(); 
		
		System.out.println(K_outer2.this.field);
		K_outer2.this.method();  // K클래스 안에 있는 인스턴스 변수
					// 가장 앞에 있는 클래스명의 내용이 출력
	}
	}
	void useL() {
		L l = new L();
		l.print();
	}
	
	public static void main(String[]args) {
		K_outer2 k = new K_outer2();
		
		k.useL();
		
	}

}
