package hello230117;

public class Interface_Home {
	
	private Interface_Remote rc = new Interface_Remote() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �Ҵ�");
		}
		public void turnOff() {
			System.out.println("TV�� ����");
		}
	};
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		
		Interface_Remote rc = new Interface_Remote() {
		public void turnOn() {
			System.out.println("������ �Ҵ�");
		}
		public void turnOff() {
			System.out.println("������ ����");
		}
	};

	rc.turnOn();
	rc.turnOff();
	}
	
	//�޼ҵ�(�Ű�����)
	public void use3(Interface_Remote rc) {
		rc.turnOn();
		rc.turnOff();
	}
}