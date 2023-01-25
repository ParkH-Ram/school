
public class Thread_Calculator_User extends Thread {
	private Thread_Calculator cal;
	
	public Thread_Calculator_User() {
		setName("Thread_Calculator_User");   //이름 설정
	}
	
	
	//외부에서 공유 객체인 Thread_Calculator를 받아 필드에 저장
	public void setThread_Calculator(Thread_Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory1(100);         //동기화 메소드 호출
	}
}
