
public class Thread_Stop_Work {
	public synchronized void methodA() {   //����ȭ �޼���
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ "A");
		notify();        //�ٸ� �����带 ���� ��� ���·� ����
		try {
			wait();   	 // �ڽ��� ������� �Ͻ����� ���·� ����
		}catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {   //����ȭ �޼���
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "B");
		notify();        //�ٸ� �����带 ���� ��� ���·� ����
		try {
			wait();   	 // �ڽ��� ������� �Ͻ����� ���·� ����
		}catch (InterruptedException e) {}
	}
}
	