import java.util.*;
public class Collection_HashSet {

	public static void main(String[]args) {
		//HashSet�÷��� ����
		Set<String> set = new HashSet<String>();
		
		//��ü����
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");   //�ߺ� ��ü�̹Ƿ� �������� ���櫓
		set.add("Spring");
		
		//����� ��ü �� ���
		
		int size = set.size();
		System.out.println(size);
		
		//�ߺ����� ������� �ʴ� ���� Set
		
	}
	
}
