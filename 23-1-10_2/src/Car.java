public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if (gas==0) {
			System.out.println("gas�� ��");
			return false;
		}
		System.out.println("gas ��");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ� (gas �ܷ� : " + gas + ")");
				gas-=1;
			}else
				System.out.println("����ϴ�");
			break;
		}
	}
	
	public static void main(String[]args) {
		Car myCar = new Car();
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			System.out.println("��� ����");
			myCar.run();
		}
		System.out.println("���� ����");
			
	}
	
//	//�ʵ� ����
//	String company = "�����ڵ���";
//	String model = "����Ʈ��";
//	String color = "ȸ��";
//	int maxSpeed = 240;
//	Car(){// �⺻ �����ڴ� �����ڰ� �ϳ��� ���� �� �ϳ��� ���� ��
//		// �ƹ��͵� �Է��� ���� �ô� public class �� �ִ� �ʵ带 ����
//		// �ȿ� ���� �Է½� �ش� ���� �ʱ� ������ ����
//		// ���⿡ �Է�? ��? what mean? i dont know
//	}
//	Car(String model){
//		this.model = model;      // ���� �޾Ƽ� �ʵ忡 �𵨿� �־��ְ� 
//		
//	}
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		
//	}
//	Car(String model, String color, int maxSpeed){
//		// ��ü ������ �Ҷ� Car myCar2 = new Car("����Ʈ��", "Gray", 240)
//		this.model = model;         // �ʱ�ȭ
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
}
