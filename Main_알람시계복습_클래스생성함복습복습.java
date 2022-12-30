package backjun;

import java.util.Scanner;

class Clock{
	int h,m;
	// 클래스 변수 선언
	public Clock(int h, int m) {
		// 클래스 생성자 ( 매개 변수를 받는다 )
		
		this.h = h; 
		// 이 클래스 변수를 생성자에 대입
		
		this.m = m;
		// 이 클래스 변수를 생성자에 대입  
	}
	public void setAlarm() {   //메서드는 매개변수가 없어도 열고 닫고 ㅇㅋ
		// 생략할 수 있는 거는 접근지정자랑 static 순서가 이렇게 돼요 접근 지정자 static 리턴값 함수 이름 매개변수 
		// 접근 지정자랑 static은 생략 가능
		// 접근 지정자는 생략하면 default고 같은 패키지내에서만 접근 가능하고 그다음에 static은 생략하면 반드시 객체를 생성하고 사용 가능한 메소드
		// static을 붙이면 객체를 생성하지 않고도 사용할 수 있는  메서드 
		// return 값이 없을 때는 무조건 void 써줘야함
		if(this.m<45) { 
			// 이 클래스의 m이 45보다 작으면 
			if(this.h==0) this.h = 23;
			// 이 클래스의 h가 0이면  이클래스의 h는 23으로 설정
			else this.h= this.h-1;
			// false 이면 이 클래스의 h는 h-1 지정 
			this.m= this.m + 60 - 45;  
			// 이 클래스의 m이 45보다 작을  시  이 클래스의 m 에다 60을 더한 뒤 45를 빼준다.
		}else {
			this.m = this.m - 45;
			// 이 클래스의 m은 이 클래스의 m에다 45를 뺀다.
		}
		System.out.print(this.h + " " + this.m);
	}	
	
}

public class Main_알람시계복습_클래스생성함복습복습 {
	
	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	int h=hi.nextInt();
	int m=hi.nextInt();
	
	Clock C1 = new Clock(h, m);  // 객체를 만들고 번지수를 반환하면 번지 안에 있는 값이 클래스 C1의 값으로 저장 된다.
	// 생성자  = 메서드  ( 특별한 기능을 하는 메서드 ) 
	// 객체가 생성 될 때 초기값을 넣어주면서 생성 하는걸 생성자라 함 
	C1.setAlarm();
	// 클래스 안에 있는 매서드를 가지고 오는거 
	
	hi.close();
	}

}
