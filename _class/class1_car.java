package _class;


class Car{
	//�Ӽ�
	boolean powerOn; //�õ�
	String color; 	 // ������ ����
	int wheel;	   	 // ������ ��
	int speed;		 // �ӷ�
	boolean wiperOn;  // ������
	
	void power () {powerOn = !powerOn;}   // �õ� �޼���
	void speedUp() {speed++;}			// ���� �޼���
	void speedDown() {speed--;}			// �극��ũ �޼���
	void wiper() {wiperOn = !wiperOn;}    //���� ������ ������, ���������� ������
	
	
}


public class class1_car {
	

	
	public static void main (String[]args) {

		
		Car mycar1 = new Car();		//mycar1 �ν��Ͻ� ����
		Car mycar2 = new Car();     //mycar2 �ν��Ͻ� ����
		
		mycar1.color = "red";
		mycar2.color = "black";
		
		mycar1.speedUp();			//����ī1�� �ӵ� �޼��� ȣ��
		mycar2.wiper();				//����ī2�� ������ �޼��� ȣ��
				
		
		System.out.println("mycar1�� ��" + mycar1.color);
		System.out.println("mycar2�� ��" + mycar2.color);
		System.out.println("mycar1�� �ӵ�" + mycar1.speed);
		System.out.println("mycar2�� �ӵ�" + mycar2.speed);
		System.out.println("mycar1�� ������ ���� " + mycar1.wiperOn);
		System.out.println("mycar1�� �����۵��� " + mycar2.wiperOn);
				
		
}

}
