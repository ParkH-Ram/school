
public class Thread_DaemonExam {
	public static void main(String[]args) {
		Thread_Daemon_AutoSave autoS = new Thread_Daemon_AutoSave();
		autoS.setDaemon(true);  // AutoSaveThread�� ���󽺷���� ����
		autoS.start();
		
		try {
			Thread.sleep(2500);  // 2.5�� �Ŀ� ����
		}catch (InterruptedException e) {}
		System.out.println("���� ����");  // sleep 2500 ���� �������� ���
	}

}
