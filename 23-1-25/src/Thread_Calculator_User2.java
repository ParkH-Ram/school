
public class Thread_Calculator_User2 extends Thread {
	private Thread_Calculator cal;
	
	public Thread_Calculator_User2() {
		setName("Thread_Calculator_User2");   //�̸� ����
	}
	
	
	//�ܺο��� ���� ��ü�� Thread_Calculator�� �޾� �ʵ忡 ����
	public void setThread_Calculator(Thread_Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory2(50);         //����ȭ ����� ���� �޼ҵ� ȣ��
	}
}
