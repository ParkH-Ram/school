package thisJava;

public class Interface_Exam {
	
	public static void main(String[]args) {
		
		
		// ����Ʈ ��Ʈ�� �������̽� ���� ���� �� ���� ��ü ����
		Interface_RemoteControl rc = new Interface_Smart();
		
		rc.turnOn3();
		rc.turnOff3();
		
		 Interface_Search search5 = new Interface_Smart();
		 
		 search5.search("https://www.youtube.com");
		 
		
	}

}
