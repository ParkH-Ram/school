
public class Tree_Person implements Comparable<Tree_Person> { //Ŭ������ ���ø���Ʈ ���۷��� �ϰ� ���� 
	public String name;
	public int age;
	
	public Tree_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Tree_Person o) {
		if(age<o.age) return -1;   // �� ��ü�� ���̸� �������� ������ �ϰڴ�.
		else if(age == o.age) return 0;
		else return 1;
		
	}
	
	

}
