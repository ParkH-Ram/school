package _13Generic;

public class _1_GenericExam {

	public static void main(String[] args) {
		//_1_BOX<String> box1 = new _1_BOX<String>(); 
		_1_BOX<String> box1 = new _1_BOX<String>();  //���׸� <T>��  String���� ���� 						
		box1.content = "��ο� ���";  //box1�� �ν��Ͻ� ������ content �� "��ο� ���" ����
		String str = box1.content; //��Ʈ�� ������ "��ο���" ����
		System.out.println(str);
		

	}

}
