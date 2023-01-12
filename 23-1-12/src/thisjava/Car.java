package thisjava;

class Car1 {

	//필드 ( 속성, 객체 변수)
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	//메소드 (함수, 기능)  이름 ()
	void power() { powerOn = !powerOn; }  // ! 반대 연산자s
	void speedUp() {speed++ ;}
	void speedDown() {speed--;}
	void wiper() {wiperOn = !wiperOn ;}
	
}

public class Car{
	public static void main(String[]args) {
//		// 객체를 생성하지 않으면 class 사용 불가
//		System.out.println("시동 처음 초기화: " + mycar.powerOn);
		
		Car1 mycar = new Car1();   // Car1 클래스를 이용해서 mycar라는 객체 생성
		System.out.println("시동 처음 초기화: " + mycar.powerOn);
		System.out.println("색상: " + mycar.color);
		System.out.println("바퀴 수: " + mycar.wheel);
		System.out.println("속도: " + mycar.speed);
		System.out.println("와이퍼: " + mycar.wiperOn);
		
		mycar.power();
		mycar.speedUp();
		mycar.wiper();
		mycar.color = "black";
		
		System.out.println("시동 처음 초기화: " + mycar.powerOn);
		System.out.println("색상: " + mycar.color);
		System.out.println("바퀴 수: " + mycar.wheel);
		System.out.println("속도: " + mycar.speed);
		System.out.println("와이퍼: " + mycar.wiperOn);
		
	}
}