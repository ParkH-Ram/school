package _16_Lambda;

public class _2_ButtonExam {
	public static void main(String[]args) {
		//Ok��ư ��ü ����
		_2_Button btOk = new _2_Button();
		
		//Ok ��ư ��ü�� ���ٽ� ( ClickListener �͸� ���� ��ü) ����
		
		btOk.setClickListener(() -> System.out.println("ok Ŭ��"));
		
		//Ok��ư Ŭ���ϱ�
		btOk.click();
		
		//Cancel ��ư ��ü ����
		_2_Button btClose = new _2_Button();
		
		btClose.setClickListener(() -> System.out.println("Close Ŭ��"));
		
		btClose.click();
	}

}
