package thisJava;

//�ν��Ͻ� �ʵ�
public class Car {
//	
//	String model;
//	int speed;
//	
//	Car(String model){        // ������
//		this.model = model;   // ī Ŭ���� �� model �ȿ�  �����ڷ� ���� model�� �־��ְڴ�. 
//	}
//	
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	void run() {    
//		this.setSpeed(100);
//		System.out.println(this.model + " �� �޸��ϴ�. (�ü� : " + this.speed + "k/h)");
//	}
//
//	//�ν��Ͻ� ����
//	int speed;
//
//	//�ν��Ͻ� �޼ҵ�
//	void run() {
//		System.out.println(speed + "�޸���");
//	}
//	
//	 // ���� �޼ҵ�
//	static void simulate() {
//		Car myCar = new Car(); // ������ 
//		myCar.speed = 200;      // �ν��Ͻ� �ʵ��� �ӵ��� �ٲ��� 
//		myCar.run();		
//	}
//	
//	public static void main(String[]args) {
//		simulate(); // ���� �޼ҵ� ȣ��   // �̰� ȣ���ϸ� speed 200�� ������
//		
//		Car myCar = new Car();
//		myCar.speed = 60;
//		myCar.run();
//	}
	
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
		this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed =0;
	}
}
	