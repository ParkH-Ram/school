package thisjava;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
	this.model = model;
	this.color = color;
	}
	public void setWifi(boolean wifi) {
		this.wifi  = wifi;
		System.out.println("���º���");
	}
	
	public void internet() {
		System.out.println("�̳ʳ� ����");
	}
	
}
