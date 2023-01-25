
public class Thread_Stop_Work {
	public synchronized void methodA() {   //동기화 메서드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ "A");
		notify();        //다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();   	 // 자신의 스레드는 일시정지 상태로 만듦
		}catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {   //동기화 메서드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "B");
		notify();        //다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();   	 // 자신의 스레드는 일시정지 상태로 만듦
		}catch (InterruptedException e) {}
	}
}
	