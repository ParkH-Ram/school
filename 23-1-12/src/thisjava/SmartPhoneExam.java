package thisjava;

public class SmartPhoneExam {
	
	public static void main(String[]args) {
		SmartPhone myP = new SmartPhone("������", "����");
		
		System.out.println(myP.model);
		System.out.println(myP.color);
		
		
		System.out.println(myP.wifi);
		
		myP.bell();
		myP.sendVoice("������");
		myP.receiveVoice("��� ��������");
	}
	

}
