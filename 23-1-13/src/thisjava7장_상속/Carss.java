package thisjava7��_���;

public class Carss {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("����");
		speed =0;
	}

}
