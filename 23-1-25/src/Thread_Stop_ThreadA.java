
public class Thread_Stop_ThreadA extends Thread {
	
	private Thread_Stop_Work work;   // �ʵ弱��
	
	public Thread_Stop_ThreadA(Thread_Stop_Work work) {
		setName("ThreadA");   
		this.work = work;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			work.methodA();   //����ȭ �޼��� ȣ��
		}
	}

}
