package gogo;

import java.util.Scanner;

public class 문제2 {

	public static void main (String[]args) {
		
		int count = 0;
		String password = "codehows";
		String pass;
		Scanner hi = new Scanner(System.in);
		
		while(true) {			//참이라서 while를 계속 실행
			
			System.out.printf ("비밀번호 입력 ");
			
			pass = hi.nextLine();
			
			if ( pass.equals(password) ) {				
				System.out.println("환영합니다!!!");
				break;				
			} 
			count++;
			System.out.println("암호가 틀렸습니다.");
			
			if(count>=3) {
				System.out.println("집에가세요");
				break;
			}
			
			
				
		}
		
	
	hi.close();
	}

}
