package _16_Lambda;

public class _5_MethodReferenceExam {
	public static void main(String[]args) {
		_5_Person per = new _5_Person();
		
		
		//���� �޼ҵ��� ���
		// ���ٽ�
		//per.action((x, y) -> _5_Computer.staticMethod(x, y));
		//�޼ҵ� ����
		per.action(_5_Computer :: staticMethod);
		
		//�ν��Ͻ� �޼ҵ��� ���
		_5_Computer com = new _5_Computer();
		//���ٽ�
		//person.action((x, y) -> com.instanceMethod(x, y));
		//�޼ҵ� ����
		per.action(com :: instanceMethod);
		
		
	}

}
