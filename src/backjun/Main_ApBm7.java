package backjun;

import java.util.Scanner;

public class Main_ApBm7 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	
	int a, 		     // �ʱ� �Է� ��
	b, 
	c,             	 // 
	count = 0;
	 a = hi.nextInt();   // a d�Է� ����
	 
	 for(int i=1; i<=a; i++){
		 count++;
		 b = hi.nextInt();
		 c = hi.nextInt();
		 
	 System.out.println("Case #" + count +": " + (b+c));
	 }	
	
	hi.close();
	
	}
}
