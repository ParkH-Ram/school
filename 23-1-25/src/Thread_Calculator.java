
public class Thread_Calculator {
	private int memory;
	public int getMemory(){
		return memory;
	}
	
	//동기화 메소드
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);//메모리값 읽기
	}
	
	
	//동기화 블록
	public void setMemory2(int memory) {
		synchronized(this) {
			this.memory = memory;  // 메모리 값 저장
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);//메모리값 읽기
	}
	

}
}