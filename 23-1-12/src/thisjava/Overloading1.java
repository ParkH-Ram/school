package thisjava;

public class Overloading1 {

	static int sum(int a, int b) {
		System.out.println("���ڰ� ���� ��� ȣ��");
		return a+b;
	}
	
	static int sum(int a, int b, int c) {     //������ ���� �ٷ� ��� ����  ����ƽ ������ ���� Ŭ���� ���� �ٷ� ��� ����
		System.out.println("���ڰ� ���� ��� ȣ��");
		return a+b+c;
	}
	
	static double sum(double a, double b, double c) {     //������ ���� �ٷ� ��� ����  ����ƽ �޼ҵ�� ���� Ŭ���� ���� �ٷ� ��� ����
		System.out.println("���ڰ� ���� ��� ȣ��");
		return a+b+c;
	}
	
	public static void main(String[]args) {
		
		System.out.println(sum(3,2));
		System.out.println(sum(3,2,3));
		System.out.println(sum(2.5,2.4,2.8));
		
	}
}
