package _16_Lambda;

public class _3_LambdaExam {

	public static void main(String[] args) {
		_3_Person person = new _3_Person();
		
		//�Ű������� �ΰ��� ���
		person.action1((n, j) -> System.out.println(n +"�� \t" + j + "��       �մϴ�"));
		
		person.action1((n,j) -> System.out.println(n+" "+j + "�� ������"));
		
		//�Ű� ������ �ϳ�
		person.action2(s -> System.out.println(s));
		
		person.action2(s -> System.out.println(s+ " \t �� ��!!!! ��� ���մϴ� \n�׷��� �ߺ������� �ظԾ��ٰ� �Ѵ�."));
		
		
		

	}

}
