package git_test;

import java.util.Scanner;

public class Main_���ϱ����Ŭ���� {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
		int value;      // �Է� �� 
		int count=0;    // ����Ŭ Ƚ�� ī��Ʈ
		int a,b;        // a�� 10�� �ڸ� b�� 1�� �ڸ�
		int sum;        // ������ �ڸ����� ����
		int first;
		value = hi.nextInt();    // �ʱⰪ�� �Է�
		first=value;   // �ʱⰪ�� �޾���
		do {
			a = value/10;
			b = value%10;
			sum = a+b;
			value = (b*10)+(sum%10);  // ��� ���� �ʱ�ȭ ... �� ..
			count ++;
		}while(value!=first);
		
		//true �� �ݺ� false �� ���� 
		// do while �� 
		

		
		System.out.println(count);
	
	
	}
	
}
