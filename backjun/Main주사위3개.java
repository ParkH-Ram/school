package backjun;

import java.util.Scanner;

public class Main�ֻ���3�� {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	int a;
	int b;
	int c;
	int same=0;
	
	a= hi.nextInt();
	b= hi.nextInt();
	c= hi.nextInt();
	
	if(a==b && a==c )         // a b c�� ������  
		same = 10000+ a * 1000;   
	else if(a==b && b!=c)     // a �� b�� ������ c���� ���� ���� �� 
		same = 1000 + b * 100;
	else if(b==c && a!=c)	  // b �� c �� ������ a���� ���� ���� ��
		same = 1000 + c * 100;
	else if(a==c && a!=b)	  // a�� c �� ������ b���� ���� ���� �� 
		same = 1000 + a * 100;
	else if(a!=b && b!=c)     // �� ���� ���� ��
		same = Math.max(Math.max(a, b), c) * 100;
	
	
		System.out.println(same);
	

	
	}
}

