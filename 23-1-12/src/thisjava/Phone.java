package thisjava;

public class Phone {
	
	public String model;
	public String color;
	
	public void bell(){
		System.out.println("���̿︲");
	}
	
	public void sendVoice(String message) {
		System.out.println("����" + message);
	}
	public void receiveVoice(String message) {
		System.out.println("����" + message);
	}
	public void hangUp(){
		System.out.println(" ����");
	}

}
