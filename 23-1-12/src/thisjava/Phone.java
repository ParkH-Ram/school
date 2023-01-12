package thisjava;

public class Phone {
	
	public String model;
	public String color;
	
	public void bell(){
		System.out.println("º§ÀÌ¿ï¸²");
	}
	
	public void sendVoice(String message) {
		System.out.println("¹¹²¿" + message);
	}
	public void receiveVoice(String message) {
		System.out.println("´©²¿" + message);
	}
	public void hangUp(){
		System.out.println(" ²÷¾î");
	}

}
