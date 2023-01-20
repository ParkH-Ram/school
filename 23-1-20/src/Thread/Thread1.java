package Thread;
class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("스레드 진행중" + (i+1));
		}
	}
}

//Runnalbe 인터페이스 구현
class MyThread2 implements Runnable {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("러너블 진행중" + (i+1));
		}
	}
}
public class Thread1 {
	public static void main(String[]args) {
		MyThread th1 = new MyThread();
		Runnable th2 = new MyThread2();
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		for(int i=1; i<=10; i++) {
			System.out.println("메인함수 진행중" + i);
		}
	}
}
