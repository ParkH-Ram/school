import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[]args) {
		//TreeSet �÷��� ����
		TreeSet<Integer> scores = new TreeSet<>();
		
		//Integer ��ü ����
		// �ӵ��� �ٸ�
		scores.add(95);
		scores.add(45);
		scores.add(75);
		scores.add(65);
		scores.add(95); // �ߺ� ��ü ����
		
		for(Integer i : scores) System.out.print(i + " ");
		System.out.println();
		
		//Ư�� Integer ��ü ��������
		System.out.println("���� " + scores.first());
		System.out.println("���� " + scores.last());
		System.out.println("95���Ʒ� ���� " + scores.lower(95)); // 95�� �ٷ� �Ʒ� ����
		System.out.println("95�� �� ���� " + scores.higher(95)); // 95�� ���� ���� ���� ������ null
		System.out.println();
		//�������� ����
		
		//���� �������� ����
		NavigableSet<Integer> descending = scores.descendingSet();
		for (Integer i : descending) {
			System.out.print(i + " ");
		}
		System.out.println();
		//���� �˻� (80 <= )
		NavigableSet<Integer>rangSet = scores.tailSet(80, true);
		for(Integer i : rangSet) {
			System.out.println(i + " ");
		}
		System.out.println("\n");

		
		
		
	}

}
