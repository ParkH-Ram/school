package hello230118;

public class Hash_StudentExam {

	public static void main(String[] args) {
		Hash_Student s1 = new Hash_Student(1, "ȫ�浿");
		Hash_Student s2 = new Hash_Student(1, "ȫ�浿");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.hashCode() == s2.hashCode()) {		//�ؽ��ڵ� ��
			if(s1.equals(s2)) {						//������ ��
				System.out.println("�������");
			}else
				System.out.println("�����Ͱ� �ٸ��ϴ�");	
		
		}else
			System.out.println("�ؽ��ڵ尡 �ٸ��Ƿ� ���ü ���̴�");

	}
}
