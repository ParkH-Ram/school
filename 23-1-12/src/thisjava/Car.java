package thisjava;

class Car1 {

	//�ʵ� ( �Ӽ�, ��ü ����)
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	//�޼ҵ� (�Լ�, ���)  �̸� ()
	void power() { powerOn = !powerOn; }  // ! �ݴ� ������s
	void speedUp() {speed++ ;}
	void speedDown() {speed--;}
	void wiper() {wiperOn = !wiperOn ;}
	
}

public class Car{
	public static void main(String[]args) {
//		// ��ü�� �������� ������ class ��� �Ұ�
//		System.out.println("�õ� ó�� �ʱ�ȭ: " + mycar.powerOn);
		
		Car1 mycar = new Car1();   // Car1 Ŭ������ �̿��ؼ� mycar��� ��ü ����
		System.out.println("�õ� ó�� �ʱ�ȭ: " + mycar.powerOn);
		System.out.println("����: " + mycar.color);
		System.out.println("���� ��: " + mycar.wheel);
		System.out.println("�ӵ�: " + mycar.speed);
		System.out.println("������: " + mycar.wiperOn);
		
		mycar.power();
		mycar.speedUp();
		mycar.wiper();
		mycar.color = "black";
		
		System.out.println("�õ� ó�� �ʱ�ȭ: " + mycar.powerOn);
		System.out.println("����: " + mycar.color);
		System.out.println("���� ��: " + mycar.wheel);
		System.out.println("�ӵ�: " + mycar.speed);
		System.out.println("������: " + mycar.wiperOn);
		
	}
}