package hello230117;

public class AExam {
	
	public static void main(String[]args) {
		
		//A ��ü ����
		A a = new A();
		a.useB();
		
		//B ��ü ���� .������ A �ȿ� �ִ� B Ŭ����
		A.B b = a.new B();
	}
	

}
