package git_test;

import java.util.Scanner;

public class printf실습_입력실습 {	
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);	
		int value =123;
		//개수가 안맞으면 에러가 생김
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		//앞에 총 6자리 앞에 3자리 비워짐 
		System.out.printf("상품의 가격: %-6d원\n", value);
		// 뒤에 6자리 비워짐 
		System.out.printf("상품의 가격: %06d원\n", value);
		// 6자린데 빈칸을 0으로 채움
	
		double pi = 3.14159 * 10 *10;
		
		System.out.printf("반지름 이 %d인 원의 넓이 : %10.2f\n", 10, pi);
		
		String name = "홍길동";
		String job = "의적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name,job);
		
	
		System.out.print("X 값 입력: ");
		String strX = hi.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("Y 값 입력: ");
		String strY = hi.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열:  " );
			String data = hi.nextLine();
			

			if (data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: "+ data);
			System.out.print("\n종료하려면 q 엔터 해주세욥~~ \n");
			System.out.println();
		}
		System.out.println("종료");
		
	}
	
}
