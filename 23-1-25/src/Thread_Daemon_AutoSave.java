
public class Thread_Daemon_AutoSave extends Thread{
	public void save() {
		System.out.println("�۾� ���� ����");
		
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);  // 1�ʸ��� �۾� ���� ����
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}

}
