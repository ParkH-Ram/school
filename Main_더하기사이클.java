package backjun;

import java.util.Scanner;

public class Main_���ϱ����Ŭ {
	
	public static void main(String[]args) {
		
		int a,					//�ʱⰪ
			b,					//a / 10  ��
			c,					//a % 10 ��
			d,					// b+c ��
			sum;
			//b + c�� %10 �� ��
		int	summax=0;			// sum + c �� ��
		int	count=0;
	
	
		Scanner hi = new Scanner(System.in);
		a = hi.nextInt();
		summax=a; // �Է°� �ϰ� summax�ϰ� ����ȭ 
		
		do {             //do ������ ���� ��Ű�� 
						// while�� ���� Ȯ��
		
		
			b = summax/10;
			c = summax%10;
			d = b + c;
			sum = d%10;
			summax = sum + c*10;     
			//summax = a �� ����  �׷��� do while�� "�Ἥ ������ �ѹ� ���� �ؾ� ��
			
		count++;
			
		}while(a!=summax);
	
		System.out.println(count);
	hi.close();
	
	}
}
