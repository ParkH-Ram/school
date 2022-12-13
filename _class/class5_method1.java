package _class;

class Area{                //면적을 구하는 클래스
	static void manual() {  //클래스 메서드는 바로 사용 가능.
		//static 클래스 메서드 : void 라서 리턴 값이 없다. 
		System.out.println("현재사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형의 넓이");
		System.out.println("rectangle : 사각형의 넓이");
		System.out.println("입니다");
	}
	//메서드를 하나 만들게요
	double triangle(int a, int b) {   //삼각형 넓이 구함
						//인스턴스 메서드 (static이 붙지 않으면)
		return (double)a*b / 2;   //void가 없기 때문에 리턴 값 표기
	}							//바로 사용 불가. ( 불러줘야 함 )
 	int rectangle(int a, int b) {  // 사각형의 넓이
 		return a * b;
 		
 	}
}


public class class5_method1 {
	
	
	
	
	public static void main (String[] args) {
		
		Area.manual(); // 클래스 메서드
		//Area.triagle(3, 5) ;    // 인스턴스 메서드 접근 불가능 <- 인스턴스 생성전
		//Area.rectagle(3, 5) ;    // 인스턴스 메서드 접근 불가능 <- 인스턴스 생성전		
		
		Area cal = new Area();    // 인스턴스 cal 생성
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 5));
	}

}
