package hello230117;

public class Interface_ButtonExam {
	public static void main(String[]args) {
		
		//OK��ư ��ü ����
		Interface_Button btok = new Interface_Button();
		
		//��ư Ŭ�����ȿ� Ŭ�������� ����  OkListener ����
		class OkListener implements Interface_Button.ClickListener{
			@Override
			public void onClick() {     // �߻�޼��� �� ����
				System.out.println("k��ư Ŭ����");
			}
		}
		btok.setClickListener(new OkListener());
		btok.click();
		
		class NoListener implements Interface_Button.ClickListener{
			public void onClick() {
				System.out.println("��");
			}
		}
		btok.setClickListener(new NoListener());
		btok.click();
	}
}
