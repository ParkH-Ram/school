
	import java.awt.Toolkit;

public class Thread_BeepExam {

	public static void main(String[]args) {
		//���ʺ� ��ü ����
		Thread thread = new Thread(new Runnable() {
			//������ ��ü�� ����µ�  ���鶧 �ȿ� ���ʺ��̶�� ��ü �ʵ� 
			// �������� Ŭ���� �ȿ� �ʵ�� ���ʺ��̶�°� �ִ�.
			
			@Override  //���ʺ��� ��ӹ��� ���� �������̵�  run �޼ҵ带
			public void run() {  
				// �����尡 ������ �ڵ�
		
				Toolkit tool = Toolkit.getDefaultToolkit(); //�̱��� ����
				
				for(int i=0; i<50; i++) {
					tool.beep();
					try {Thread.sleep(277);} catch(Exception e) {} //�����彽���� ����ó���� �ʿ� ������
				}
			}
		});
		
		thread.start();
		//��ŸƮ�� �����ϸ� run�� ���� ��
		
		
		for(int i=0; i<50; i++) {
			System.out.println("? ��");
			try {Thread.sleep(222); } catch(Exception e) {}
		}
	}

}



