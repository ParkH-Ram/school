package hello230117;

public class Cexam {

	public static void main(String[] args) {
		
		//d ��ü�� �����ؼ� �ν��Ͻ� ����� ����
		C.D d = new C.D();
		System.out.println(d.field1);
		d.method1();
		//�ν��Ͻ� ��� ��ø B ��ü ����
		
		// Ŭ���� ������� Ŭ������.Ŭ������.Ŭ�������
		System.out.println(C.D.field2);
		C.D.method2();
		

	}

}
