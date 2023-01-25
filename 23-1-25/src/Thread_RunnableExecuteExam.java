import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Thread_RunnableExecuteExam  {
		//Execute = �����ϴ�
	public static void main(String[]args) {
		
		//1000���� ���� ����
		
		String [] [] mails = new String[1000][3];
		//1000���� �� 3���� ���� ���� �迭 ����
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "�Ż��̴�";
		}
		
		//ExeutorService ���� //�ִ� 5��
		ExecutorService exeS = Executors.newFixedThreadPool(5);
		
		
		//�̸����� ������ �۾� ���� �� ó�� ��û
		for(int i=0; i<1000; i++) {
		final int idx = i;
		exeS.execute(new Runnable() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				String from = mails[idx][0];
				String to = mails[idx][1];
				String content = mails[idx][2];
				System.out.println("[" + thread.getName()+ "]" + from + "==>" + to + ": "+ content);
			}
		});
		}
		
	}

}
