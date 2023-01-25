import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedListExam {
	public static void main(String[]args) {
		//ArrayList �÷��� ��ü ����
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList �÷���  ��ü ����
		List<String> list2 = new LinkedList<String>();
		
		
		//���� �ð��� �� �ð��� ������ ����
		long startT;
		long eT;
		
		//ArrayList �÷��� ���� �ð� ����
		startT = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		eT = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList  �ɸ� �ð� : ", (eT-startT));
		//����� ������, ���� �ڿ� ns�� ���̱� ����
		
		//LinkedList �÷��ǿ� �����ϴ� �ð� ����
		startT = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		eT = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList �ɸ� �ð� : ", (eT-startT));
	}

}
