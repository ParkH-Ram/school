package hello230117;

public class Interface_Home {
	
	private Interface_Remote rc = new Interface_Remote() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켠다");
		}
		public void turnOff() {
			System.out.println("TV를 끈다");
		}
	};
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		
		Interface_Remote rc = new Interface_Remote() {
		public void turnOn() {
			System.out.println("에어컨 켠다");
		}
		public void turnOff() {
			System.out.println("에어컨 끈다");
		}
	};

	rc.turnOn();
	rc.turnOff();
	}
	
	//메소드(매개변수)
	public void use3(Interface_Remote rc) {
		rc.turnOn();
		rc.turnOff();
	}
}