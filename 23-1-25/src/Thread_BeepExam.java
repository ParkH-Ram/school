
	import java.awt.Toolkit;

public class Thread_BeepExam {

	public static void main(String[]args) {
		//러너블 객체 생성
		Thread thread = new Thread(new Runnable() {
			//스레드 객체를 만드는데  만들때 안에 러너블이라는 객체 필드 
			// 스레드라는 클래스 안에 필드로 러너블이라는게 있다.
			
			@Override  //러너블을 상속받자 마자 오버라이딩  run 메소드를
			public void run() {  
				// 스레드가 실행할 코드
		
				Toolkit tool = Toolkit.getDefaultToolkit(); //싱글톤 패턴
				
				for(int i=0; i<50; i++) {
					tool.beep();
					try {Thread.sleep(277);} catch(Exception e) {} //스레드슬립은 예외처리가 필요 무조건
				}
			}
		});
		
		thread.start();
		//스타트를 실행하면 run이 실행 됨
		
		
		for(int i=0; i<50; i++) {
			System.out.println("? 뭐");
			try {Thread.sleep(222); } catch(Exception e) {}
		}
	}

}



