
public class Thread_Calculator_User extends Thread {
	private Thread_Calculator cal;
	
	public Thread_Calculator_User() {
		setName("Thread_Calculator_User");   //�̸� ����
	}
	
	
	//�ܺο��� ���� ��ü�� Thread_Calculator�� �޾� �ʵ忡 ����
	public void setThread_Calculator(Thread_Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory1(100);         //����ȭ �޼ҵ� ȣ��
	}
}
