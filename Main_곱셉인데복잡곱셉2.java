package °øºÎ;

import java.util.Scanner;

public class Main_°ö¼ÁÀÎµ¥º¹Àâ°ö¼Á2 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int A;
	int B, tem;
	int B3, B2, B1;
	
	A=hi.nextInt();
	B=hi.nextInt();
	
	B3 = B/100;
	tem = B%100;
	B2 = tem/10;
	B1 = tem%10; 
	System.out.println(B1*A);
	System.out.println(B2*A);
	System.out.println(B3*A);
	System.out.println(B*A);
	
	hi.close();
	}

}
