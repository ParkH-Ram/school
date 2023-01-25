
public class Thread_DaemonExam {
	public static void main(String[]args) {
		Thread_Daemon_AutoSave autoS = new Thread_Daemon_AutoSave();
		autoS.setDaemon(true);  // AutoSaveThread를 데몬스레드로 만듦
		autoS.start();
		
		try {
			Thread.sleep(2500);  // 2.5초 후에 종료
		}catch (InterruptedException e) {}
		System.out.println("메인 종료");  // sleep 2500 이후 메인종료 출력
	}

}
