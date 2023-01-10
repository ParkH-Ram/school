public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if (gas==0) {
			System.out.println("gas가 읎");
			return false;
		}
		System.out.println("gas 있");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다 (gas 잔량 : " + gas + ")");
				gas-=1;
			}else
				System.out.println("멈춥니다");
			break;
		}
	}
	
	public static void main(String[]args) {
		Car myCar = new Car();
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			System.out.println("출발 ㄱㄱ");
			myCar.run();
		}
		System.out.println("가스 없다");
			
	}
	
//	//필드 선언
//	String company = "르노자동차";
//	String model = "오스트랄";
//	String color = "회색";
//	int maxSpeed = 240;
//	Car(){// 기본 생성자는 생성자가 하나도 없을 때 하나도 없을 때
//		// 아무것도 입력을 안할 시는 public class 에 있는 필드를 따옴
//		// 안에 값을 입력시 해당 값이 초기 값으로 지정
//		// 여기에 입력? 엥? what mean? i dont know
//	}
//	Car(String model){
//		this.model = model;      // 모델을 받아서 필드에 모델에 넣어주고 
//		
//	}
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		
//	}
//	Car(String model, String color, int maxSpeed){
//		// 객체 생성을 할때 Car myCar2 = new Car("오스트랄", "Gray", 240)
//		this.model = model;         // 초기화
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
}
