import java.util.HashSet;
import java.util.Set;

public class Collection_HashExam {

	public static void main(String[] args) {
		//HashSet �÷��� ����
		Set<Collection_Hash_Member> set = new HashSet<Collection_Hash_Member>();
		Collection_Hash_Member a = new Collection_Hash_Member("ȫ�浿", 30);
		Collection_Hash_Member b = new Collection_Hash_Member("ȫ�浿", 30);
		

		
		//Member ��ü ����
		set.add(a);
		set.add(b); 	//�ν��Ͻ��� �ٸ����� ���� ��ü�̹Ƿ� ��ü 1���� ����
		
	
		
		System.out.println(a.equals(b));
		

	}

}
