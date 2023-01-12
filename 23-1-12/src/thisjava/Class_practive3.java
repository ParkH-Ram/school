package thisjava;

class Cars{
	static int wheel = 4; // 클래스 변수 , 정적멤버(변수)
	int speed;			  // 인스턴스 변수, 인스턴스 멤버
}

public class Class_practive3 {
	public static void main(String[]args) {
		Cars add = new Cars();			// 생성자 생성
		
		
		System.out.println(Cars.wheel);   // 객체 선언 없이 사용 가능
		System.out.println(add.speed);   //  인스턴스 만든 후  인스턴스 변수 사용 가능
		
		Cars add2 = new Cars();
		System.out.println("<before>");
		System.out.println("myCar1.speed " + add.speed );
		System.out.println("myCar2.speed " + add2.speed );
		System.out.println("myCar1.wheel " + add.wheel );
		System.out.println("myCar2.wheel " + add2.wheel );
		
		add2.speed = 150; // 인스턴스는 변경한 내용만 변경    .. 음 지만 바뀜  
		add2.wheel =5;    // 정적은 공유가 됨  ... 음 전체가 바뀜   . 메모리 공유 번지 하나
		
		System.out.println("<after>");
		System.out.println("myCar1.speed " + add.speed );
		System.out.println("myCar2.speed " + add2.speed );
		System.out.println("myCar1.wheel " + add.wheel );
		System.out.println("myCar2.wheel " + add2.wheel );
		
	}
	

}
