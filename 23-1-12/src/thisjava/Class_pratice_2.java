package thisjava;


public class Class_pratice_2 {

	public static void main(String[]args) {
		Car1 mycar1 = new Car1();       // 번지가 다름
		Car1 mycar2 = new Car1();    	  // 번지가 다름
		
		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wiper();   // 이걸 하면  클래스에서 wiper 가 작동함
		
		System.out.println("mycar1 색: " + mycar1.color);
		System.out.println("mycar1 색: " + mycar2.color);
		System.out.println("mycar1 색: " + mycar1.speed);
		System.out.println("mycar1 색: " + mycar2.speed);
		System.out.println("mycar1 색: " + mycar1.wiperOn);
		System.out.println("mycar1 색: " + mycar2.wiperOn);
		
		System.out.println(mycar1);
		System.out.println(mycar2);
		
	}
}
