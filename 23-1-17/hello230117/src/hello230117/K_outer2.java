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
		K_outer2.this.method();  // KŬ���� �ȿ� �ִ� �ν��Ͻ� ����
					// ���� �տ� �ִ� Ŭ�������� ������ ���
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
