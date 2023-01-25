import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Thread_ExecutorServiceExam {

	public static void main(String[] args) {
		
		//스레드폴 생성
		ExecutorService exeutor = Executors.newFixedThreadPool(5);
		//작업 생성과 처리 요청
		
		//스레드폴 종료
		exeutor.shutdownNow();
	}

}
