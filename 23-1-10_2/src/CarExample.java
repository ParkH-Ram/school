public class CarExample {

	public static void main(String[]args) {
		
		//Car Ŭ������ �̿��Ͽ� Car ��ü ����
		Car Car1 = new Car(); // ������
		System.out.println("car1.company : " + Car1.company );
		System.out.println();
		
		Car Car2 = new Car("�ڰ���");
		System.out.println("car2.company : " + Car2.company );
		System.out.println("car2.model : " + Car2.model );
		System.out.println();
		
		Car Car3 = new Car ("�ڰ���", "����");
		System.out.println("car3.company : " + Car3.company );
		System.out.println("car3.model : " + Car3.model );
		System.out.println("car3.color : " + Car3.color );
		System.out.println();
		

		Car Car4 = new Car("����Ʈ��", "Gray", 240);
		System.out.println("car4.company : " + Car4.company );
		System.out.println("car4.model : " + Car4.model );
		System.out.println("car4.color : " + Car4.color );
		System.out.println("car4.maxSpeed : " + Car4.maxSpeed );
		System.out.println();
		
		Car Car5 = new Car();
		System.out.println("car5.company : " + Car5.company );
		System.out.println("car5.model : " + Car5.model );
		System.out.println("car5.color : " + Car5.color );
		System.out.println("car5.maxSpeed : " + Car5.maxSpeed );
	}
}
