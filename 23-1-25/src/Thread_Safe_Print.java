
public class Thread_Safe_Print extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {           //�ܺο��� stop �ʵ尪�� ������ �� �ֵ��� Setter ����
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {           //��ž �ʵ� ���� ���� �ݺ� ���� ����
			System.out.println("���� ��");
		}
		System.out.println("���ҽ� ����");      
		System.out.println("����");
	}
}
