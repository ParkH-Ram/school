
public class Thread_Safe_Exam {
	public static void main(String[]args) {
		Thread_Safe_Print printT = new Thread_Safe_Print();
		printT.start();
		
		try {
			Thread.sleep(1500);
		}catch (InterruptedException e) {}
		printT.setStop(true);    //printThread�� �����ϱ� ���� stop �ʵ尪 ����
	}

}
