package thisjava;


public class Class_pratice_2 {

	public static void main(String[]args) {
		Car1 mycar1 = new Car1();       // ������ �ٸ�
		Car1 mycar2 = new Car1();    	  // ������ �ٸ�
		
		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wiper();   // �̰� �ϸ�  Ŭ�������� wiper �� �۵���
		
		System.out.println("mycar1 ��: " + mycar1.color);
		System.out.println("mycar1 ��: " + mycar2.color);
		System.out.println("mycar1 ��: " + mycar1.speed);
		System.out.println("mycar1 ��: " + mycar2.speed);
		System.out.println("mycar1 ��: " + mycar1.wiperOn);
		System.out.println("mycar1 ��: " + mycar2.wiperOn);
		
		System.out.println(mycar1);
		System.out.println(mycar2);
		
	}
}
