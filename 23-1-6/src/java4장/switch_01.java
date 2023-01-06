package java4장;

public class switch_01 {
	
	public static void main(String[]args) {
		
		int num = (int)(Math.random()*45)+1;   // 랜덤 1 ~6까지 출력
		
		switch(num) {
			case 1:
				System.out.println("1번이다");
				break;
			case 2:
				System.out.println("2번이다");
				break;
			case 3:
				System.out.println("3번이다");
				break;
			case 4:
				System.out.println("4번이다");
				break;
			case 5:
				System.out.println("5번이다");
				break;
			default: 	
				System.out.println("6번이다");
		
		
		
		}
		
	}

}
