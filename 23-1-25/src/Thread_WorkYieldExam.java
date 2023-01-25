
public class Thread_WorkYieldExam {
	public static void main(String[]args) {
		Thread_Work work1 = new Thread_Work("workThreadA");
		Thread_Work work2 = new Thread_Work("workThreadB");
		work1.start();
		work2.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		work1.work = false; //1초 뒤 false가 되면 work2만 출력
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		work1.work = true; // 2초 뒤 다시 true가 되면서 work1,2 출력 
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		work1.work = false;
		work2.work = false;
		
	}

}
