package backjun;

import java.util.Scanner;

public class Main_�����2 {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	
	int a; 		     // �ʱ� �Է� ��
	a = hi.nextInt(); 
		
			//���� for ���� Ȱ���� 
	
	 for (int k=1; k<=a; k++) {    // ū ���� �ȿ� ���� ���� �ΰ��� �־ �ΰ��� �ߺ����� ����
		 
	
		 for(int i=1; i<=a-k; i++){  //�Է� ���� ������ - �������� ����  ��ĭ�� ä��� ����.
		 System.out.printf(" ");}
		 
		 for(int j=1; j<=k; j++) {
			 //i = 1�� �� j = 1 �� ���ؼ� ���� �� �ٽ� i�� ���ư��� ���� �ͼ� 2�� �ް� 2�� ����ϰ� �̷���
		 System.out.printf("*");
		 
		 }
		 System.out.printf("\n");
	 
	 
	 
		 
	}
	 hi.close();
}
}
