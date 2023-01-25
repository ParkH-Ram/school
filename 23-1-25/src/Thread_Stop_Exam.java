
public class Thread_Stop_Exam {
	public static void main(String[]args) {
		Thread_Stop_Work work = new Thread_Stop_Work();    // 공유 작업 객체 생성
		
		Thread_Stop_ThreadA threadA = new Thread_Stop_ThreadA(work);
		Thread_Stop_ThreadB threadB = new Thread_Stop_ThreadB(work);
		
		threadA.start();
		threadB.start();
	}

}
