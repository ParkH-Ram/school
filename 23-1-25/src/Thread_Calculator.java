
public class Thread_Calculator {
	private int memory;
	public int getMemory(){
		return memory;
	}
	
	//����ȭ �޼ҵ�
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);//�޸𸮰� �б�
	}
	
	
	//����ȭ ���
	public void setMemory2(int memory) {
		synchronized(this) {
			this.memory = memory;  // �޸� �� ����
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);//�޸𸮰� �б�
	}
	

}
}