
public class Thread_NameExam {

	public static void main(String[]args) {
		
		//이 코드를 실행하는 스레드 객체 참조 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+ " 실행");
		
		for(int i=0; i<1000; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					
					//getName()메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
					
					for(int j=0; j<1000; j++) {
						System.out.println(getName()+ " 실행");	
					}
				}
			};
			threadA.start();
		}
		Thread chatThread = new Thread() {
		@Override
		public void run() {
			System.out.println(getName() + " 실행");
		}
	};
	chatThread.setName("chat-thread");
	
	//작업 스레드 이름 변경
	chatThread.start();   
	}

}
