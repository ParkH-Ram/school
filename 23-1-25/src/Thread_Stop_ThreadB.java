
public class Thread_Stop_ThreadB extends Thread {

	private Thread_Stop_Work work;   // �ʵ弱��
	
	public Thread_Stop_ThreadB(Thread_Stop_Work work) {
		setName("ThreadB");   
		this.work = work;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			work.methodB();   //����ȭ �޼��� ȣ��
		}
	}

}
