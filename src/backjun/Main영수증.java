package backjun;

import java.util.Scanner;

public class Main������ {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		int x, n, a, b;
		int sum=0;
		
		x = hi.nextInt();       //�� �ݾ�
		n = hi.nextInt();		//���� ���� �ľ�
	
		for(int i=1; i<=n; i++) {
			
			a = hi.nextInt();		// ���� ���� ����
			b = hi.nextInt();		// ���� ���� ���� 
			
			sum += a*b;
		}
		
		System.out.println((x==sum)? "Yes" : "No");  
				
		hi.close();
		
	}

}
