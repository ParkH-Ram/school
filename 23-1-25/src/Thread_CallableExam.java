import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;      //���׸� ���� Ÿ��

public class Thread_CallableExam {
	public static void main(String[]args) {
		
		//Executor ����
		ExecutorService exeS = Executors.newFixedThreadPool(3);   //������ �ִ� 5�� ���� ������Ǯ ����
		
		//��� �۾� ���� �� ó�� ��û
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = exeS.submit(new Callable<Integer>() { //100���� Callable�� �����ϰ� submit�޼��忡 �ִ´�
				//Integer ���·� ����
				@Override
				public Integer call() throws Exception{
					int sum=0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread(); // ���� �������� ������
					System.out.println(thread.getName() + " " + idx + "�� ���" +sum);
					return sum;
				}
			});
			
			try {
				int result = future.get();      //Callable�� call �޼ҵ尡 ������ �� ���
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		//����
		exeS.shutdown();
	}

}
