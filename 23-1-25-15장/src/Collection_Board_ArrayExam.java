import java.util.ArrayList;
import java.util.List;

public class Collection_Board_ArrayExam {
	public static void main(String[]args) {
		//ArrayList �÷��� ����
		List<Collection_Board> list = new ArrayList<>();
		
		list.add(new Collection_Board("����1", "����1", "�۾���1"));
		list.add(new Collection_Board("����2", "����2", "�۾���2"));
		list.add(new Collection_Board("����3", "����3", "�۾���3"));
		list.add(new Collection_Board("����4", "����4", "�۾���4"));
		list.add(new Collection_Board("����5", "����5", "�۾���5"));
		
		
		//����� �� ��ü ���
		int size = list.size();
		System.out.println("�� ��ü �� " + size);
		System.out.println();
		
		//Ư�� �ε����� ��ü ��������
		Collection_Board board = list.get(1);
		System.out.println(board.getSubject()+ "\t" + board.getContent()+ "\t" + board.getWriter());
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			Collection_Board b = list.get(i);
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		}
		System.out.println();
			
		list.remove(1);
		list.remove(2);

		
		for(Collection_Board b : list) {
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		
		}
	}
}
