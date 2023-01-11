package thisJava;

//인스턴스 필드
public class Car {
//	
//	String model;
//	int speed;
//	
//	Car(String model){        // 생성자
//		this.model = model;   // 카 클래스 안 model 안에  생성자로 만든 model을 넣어주겠다. 
//	}
//	
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	void run() {    
//		this.setSpeed(100);
//		System.out.println(this.model + " 가 달립니다. (시속 : " + this.speed + "k/h)");
//	}
//
//	//인스턴스 변수
//	int speed;
//
//	//인스턴스 메소드
//	void run() {
//		System.out.println(speed + "달린다");
//	}
//	
//	 // 정적 메소드
//	static void simulate() {
//		Car myCar = new Car(); // 생성자 
//		myCar.speed = 200;      // 인스턴스 필드의 속도를 바꿔줌 
//		myCar.run();		
//	}
//	
//	public static void main(String[]args) {
//		simulate(); // 정적 메소드 호출   // 이걸 호출하면 speed 200이 생성됨
//		
//		Car myCar = new Car();
//		myCar.speed = 60;
//		myCar.run();
//	}
	
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
		this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed =0;
	}
}
	