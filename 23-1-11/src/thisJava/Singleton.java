package thisJava;

public class Singleton {
	//private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	//private ���� ������ ���� ������ ���� 
	private Singleton() {
		
	}
	
	//public ���� ������ ���� ���� �޼ҵ� ����
	static Singleton getInstance() {
		return singleton;
	}

}
