import java.util.TreeSet;

public class Tree_PersonExam {
	public static void main(String[]args) {
		//Tree �÷��� ����
		TreeSet<Tree_Person> tree = new TreeSet<Tree_Person>();
		
		//��ü ����
		tree.add(new Tree_Person("ȫ�浿", 44));
		tree.add(new Tree_Person("���û�", 55));
		tree.add(new Tree_Person("�����", 32));
		
		//��ü�� �ϳ��� ��������
		for(Tree_Person person : tree) {
			System.out.println(person.name + " " +  person.age);
		}
	}

}
