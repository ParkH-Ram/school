package hello230119;

public class ToStringExam {
	public static void main(String[]args) {
		ToString_SmartPhone sp = new ToString_SmartPhone("�Ｚ����", "�ȵ���̵�");
		
		String strObj = sp.toString();    // ����Ʈ�� �޼ҵ� ȣ��
		System.out.println(strObj);
		
		System.out.println(sp);
	}
}
