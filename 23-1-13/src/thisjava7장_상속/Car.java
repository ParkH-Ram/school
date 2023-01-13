package thisjava7장_상속;

public class Car {
	public Tire tire;   //해즈어 관계? has a 관계?   is a 관계 상속 
	
	public void run() {
		tire.roll();
	}

}
