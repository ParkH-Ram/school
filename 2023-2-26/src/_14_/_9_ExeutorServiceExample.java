package _14_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _9_ExeutorServiceExample {
	public static void main(String []args) {
		//스레드풀 생성
		ExecutorService es = Executors.newFixedThreadPool(5);  //  스레드풀 5개 까지 생성하겠다.
		//작업 생성과 처리 요청
		//스레드풀 종료
		es.shutdown();
		
	}

}
