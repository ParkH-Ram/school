package thisJava;

public class CarExample_public {
	
	public static void main(String[]args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		myCar.setSpeed(650);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {          //  
			myCar.setStop(true);
		}
		System.out.println("����ӵ� : " + myCar.getSpeed());
}
}
