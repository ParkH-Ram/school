import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Thread_ExecutorServiceExam {

	public static void main(String[] args) {
		
		//�������� ����
		ExecutorService exeutor = Executors.newFixedThreadPool(5);
		//�۾� ������ ó�� ��û
		
		//�������� ����
		exeutor.shutdownNow();
	}

}
