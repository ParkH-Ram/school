package backjun;

import java.util.Scanner;

public class Main_�����_�⺻ {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	
	int a;		     // �ʱ� �Է� ��
	
	a = hi.nextInt(); 
		
			//���� for ���� Ȱ���� 
	
	 for(int i=1; i<=a; i++){
		 
		 for(int j=1; j<=i; j++)
			 //i = 1�� �� j = 1 �� ���ؼ� ���� �� �ٽ� i�� ���ư��� ���� �ͼ� 2�� �ް� 2�� ����ϰ� �̷���
		 System.out.print("��");
		 System.out.print("\n");

	 }
	 hi.close();
		 
	}
}
