package 공부;

import java.util.Scanner;

public class Main_곱셉인데복잡곱셉 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int  A;
	
	A = hi.nextInt();
	hi.nextLine();
	String B = hi.nextLine();
	int sum = 0;
	sum = A * Integer.parseInt(B);   
	//인테저 클래스에 파스인트 해주면 스트링으로 받은 문자가 숫자면 숫자형으로 변경 가능
	
	
	System.out.println(((int)B.charAt(2)-48) * A);
	System.out.println(((int)B.charAt(1)-48) * A);
	System.out.println(((int)B.charAt(0)-48) * A);
	System.out.println(sum);
	
	
		
	hi.close();
	}

}
