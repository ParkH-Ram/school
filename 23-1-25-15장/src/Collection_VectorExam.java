import java.util.List;
import java.util.Vector;

public class Collection_VectorExam {

	public static void main(String[] args) {
		List<Collection_Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
		
			public void run() {
			//��ü 1000�� �߰�
				for(int i=1; i<=1000; i++) {
					list.add(new Collection_Board("����" + i, "����"+i, "�۾���"+i));
				
				}
			}
		};
	
		//�۾� ������ ��ü ����
		Thread threadB = new Thread() {
			
			public void run() {
			//��ü 1000�� �߰�
				for(int i=1; i<=1000; i++) {
					list.add(new Collection_Board("����" + i, "����"+i, "�۾���"+i));
				
				}
			}
		};
		
		//�۾� ������ ����
		threadA.start();
		threadB.start();
		
		
		//�۾� ��������� ��� ����� ������ ���� �����带 ��ٸ��� ��
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {}
		
		//����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü : " + size);
		System.out.println();
	

	}

}
