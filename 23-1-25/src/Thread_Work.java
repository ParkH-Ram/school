
public class Thread_Work extends Thread {
	public boolean work = true;
	
	//»ý¼ºÀÚ 
	public Thread_Work(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName());
			}else {
				Thread.yield();
			}
		}
	}
	
}
