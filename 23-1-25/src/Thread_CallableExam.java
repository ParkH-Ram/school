import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;      //제네릭 리턴 타입

public class Thread_CallableExam {
	public static void main(String[]args) {
		
		//Executor 생성
		ExecutorService exeS = Executors.newFixedThreadPool(3);   //스레드 최대 5개 제한 스레드풀 생성
		
		//계산 작업 생성 및 처리 요청
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = exeS.submit(new Callable<Integer>() { //100개의 Callable을 생성하고 submit메서드에 넣는다
				//Integer 형태로 리턴
				@Override
				public Integer call() throws Exception{
					int sum=0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread(); // 현재 실행중인 스레드
					System.out.println(thread.getName() + " " + idx + "합 계산" +sum);
					return sum;
				}
			});
			
			try {
				int result = future.get();      //Callable의 call 메소드가 리턴한 값 얻기
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		//종료
		exeS.shutdown();
	}

}
