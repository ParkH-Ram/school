package thisjava7��_���;

public class CarExam {
	
	public static void main(String[]args) {
		
		//myCar �ν��Ͻ� ����
		Car myCar = new Car();
		
		//Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run(); 		// ŸƼ�� �� ����
		
		
		//�ѱ�Ÿ�̾� ��ü ����
		myCar.tire = new HankookTire();
		myCar.run(); 		// ŸƼ�� �� ����
		
		myCar.tire = new KumhoTire();
		myCar.run(); 		// ŸƼ�� �� ����
	}

}
