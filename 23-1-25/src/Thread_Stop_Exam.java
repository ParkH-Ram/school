
public class Thread_Stop_Exam {
	public static void main(String[]args) {
		Thread_Stop_Work work = new Thread_Stop_Work();    // ���� �۾� ��ü ����
		
		Thread_Stop_ThreadA threadA = new Thread_Stop_ThreadA(work);
		Thread_Stop_ThreadB threadB = new Thread_Stop_ThreadB(work);
		
		threadA.start();
		threadB.start();
	}

}
