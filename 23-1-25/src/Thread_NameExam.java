
public class Thread_NameExam {

	public static void main(String[]args) {
		
		//�� �ڵ带 �����ϴ� ������ ��ü ���� ���
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+ " ����");
		
		for(int i=0; i<1000; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					
					//getName()�޼ҵ�� Thread�� �ν��Ͻ� �޼ҵ�� �������� �̸��� ����
					
					for(int j=0; j<1000; j++) {
						System.out.println(getName()+ " ����");	
					}
				}
			};
			threadA.start();
		}
		Thread chatThread = new Thread() {
		@Override
		public void run() {
			System.out.println(getName() + " ����");
		}
	};
	chatThread.setName("chat-thread");
	
	//�۾� ������ �̸� ����
	chatThread.start();   
	}

}
