package _16_Lambda;

public class _2_LambdaExam {
	public static void main(String[]args) {
		//_2_Person ������ ����
		_2_Person person = new _2_Person();
		
		//���๮�� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {
			System.out.println("���");
			System.out.println("���α׷���");
		});
		
		//���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(() -> System.out.println("hi"));
		
	}

}
