package _16_Lambda;

public class _2_Button {
	
	//���� ��� �������̽�
	
	//��ų��������̽� ������̼��� ������ �������� �߻�޼��尡 �ϳ��� �ƴ��� Ȯ������
	//FunctionalInterface Annotation��
	@FunctionalInterface
	public static interface ClickListener{
		//�߻�޼���
		void onClick();
	}
	
	//�ʵ� = Ŭ���� ���� 
	private ClickListener clickL;
	
	//�޼���
	public void setClickListener(ClickListener clickL) {
		this.clickL = clickL;
	}
	
	public void click() {
		this.clickL.onClick();
	}

}
