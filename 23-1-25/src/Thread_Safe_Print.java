
public class Thread_Safe_Print extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {           //외부에서 stop 필드값을 변경할 수 있도록 Setter 선언
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {           //스탑 필드 값에 따라 반복 여부 결정
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");      
		System.out.println("종료");
	}
}
