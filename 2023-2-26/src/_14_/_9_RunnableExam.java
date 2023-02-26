package _14_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _9_RunnableExam {
	public static void main(String[]args) {
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];   // 총 3000개
		
		for(int i=0; i<mails.length;i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"  + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
			//ExecutorService 생성
			ExecutorService es = Executors.newFixedThreadPool(5);
			
			//이메일을 보내는 작업 생성 및 처리 요청
			for(int i=0; i<1000; i++) {
				final int idx = i;
				// 작업 객체를 큐에 넣는 작업 
				es.execute(new Runnable() {
					@Override
					public void run() {
						
						//메일의 내용을 하나씩 읽어서 
						Thread thread = Thread.currentThread();
						String from = mails[idx][0];
						String to = mails[idx][1];
						String content = mails[idx][2];
						System.out.println(thread.getName() + " : " + from + ">" + to + " : " + content);
					}
				});
			}
			//종료
			es.shutdown();
		
	}

}
