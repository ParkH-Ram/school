package hello230117;

public class G_����Ŭ���� {
	
	public void method1(int arg) {
		int var = 1;
		class H{
			void method2() {
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
			}
		}
		
		H h= new H();
		h.method2();
		
		
		
		
//		arg = 3;      Ŭ���� �ȿ� �޼ҵ� �ȿ� Ŭ������ ������ ���� �⺻������ final ����
//		var = 3;
	}
	void method3() {
		method1(5);        //�Ű������� ���� �־��ַ��� �� �޼ҵ带 ������ �� 
	}
	
	public static void main(String[]args) {
		G_����Ŭ���� g = new G_����Ŭ����();
		g.method3();
	}
}

