package thisjava;

class Cars{
	static int wheel = 4; // Ŭ���� ���� , �������(����)
	int speed;			  // �ν��Ͻ� ����, �ν��Ͻ� ���
}

public class Class_practive3 {
	public static void main(String[]args) {
		Cars add = new Cars();			// ������ ����
		
		
		System.out.println(Cars.wheel);   // ��ü ���� ���� ��� ����
		System.out.println(add.speed);   //  �ν��Ͻ� ���� ��  �ν��Ͻ� ���� ��� ����
		
		Cars add2 = new Cars();
		System.out.println("<before>");
		System.out.println("myCar1.speed " + add.speed );
		System.out.println("myCar2.speed " + add2.speed );
		System.out.println("myCar1.wheel " + add.wheel );
		System.out.println("myCar2.wheel " + add2.wheel );
		
		add2.speed = 150; // �ν��Ͻ��� ������ ���븸 ����    .. �� ���� �ٲ�  
		add2.wheel =5;    // ������ ������ ��  ... �� ��ü�� �ٲ�   . �޸� ���� ���� �ϳ�
		
		System.out.println("<after>");
		System.out.println("myCar1.speed " + add.speed );
		System.out.println("myCar2.speed " + add2.speed );
		System.out.println("myCar1.wheel " + add.wheel );
		System.out.println("myCar2.wheel " + add2.wheel );
		
	}
	

}
