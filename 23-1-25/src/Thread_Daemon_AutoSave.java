
public class Thread_Daemon_AutoSave extends Thread{
	public void save() {
		System.out.println("작업 내용 저장");
		
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);  // 1초마다 작업 내용 저장
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}

}
