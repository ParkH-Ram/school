package thisjava;
class Area{
	static void manual() {     // static ���� ���� Ŭ����  �޼ҵ�  : �ٷ� ��밡��, void : ��ȯ �� ����;
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : ����� ����");
		System.out.println("��");
	}
	
	double triangle(int a, int b) {
		return (double)a * b /2 ;    //�ﰢ�� ���� ��ȯ
	}
	int rectangle(int a, int b) {
		return a * b;
	}
}

public class Method2 {

	public static void main(String []args) {
		Area.manual();   // Ŭ���� ���� ����ƽ ������ Ŭ������.�Լ��� ���� �ٷ� ȣ�� ����
		
		//triangle
		double i = 55;
		double j = 44;
		Area trie = new Area();   
		System.out.println(trie.triangle(55,44));    //�ν��Ͻ��� ������ ���� ����� ��
		System.out.println(trie.rectangle(55,44));
		
	}
}
