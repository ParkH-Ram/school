package backjun;

import java.util.*;

public class Main_�Ѽ� {

	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int value; 	//  �Էư�
		int h3;      // 100�� �ڸ� 
		int h2;		//  10�� �ڸ�
		int h1; 	//  1�ڸ�
		int temp;
		int count=0;
		value = hi.nextInt();
		int i = 1;
		while(i <= value) {
			h3 = i/100;			// value�� 100���� ���� 
			temp = i% 100;    	//100���� ���� ������ 
			h2 = temp/10;          //100���� ���� �������� 10���� �ٽ� ����
			h1 = temp%10;          // 10���� ���� ������ ��
			
			if(h3>0) {
				if(h3-h2 == h2-h1) count++;
			}else count++;
			i++;
		}
		System.out.println(count);
	}
	
}
