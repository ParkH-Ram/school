package backjun;

import java.util.Scanner;

public class Main����ð� {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int h;
		int m;

		int c;     //�ɸ��� �ð�
		int min;   // ���� 60�Ѿ� �������� üũ



		
		
		h= hi.nextInt();
		m= hi.nextInt();
		c= hi.nextInt();
		
		min = (h*60)+m;
		min += c;
		
		
		h = (min/60)%24;    // ���� �� �������� ���Ѵ�.  24�� �� �Ѱ� �Ϸ���
		m = min % 60;		// 

		
	
			System.out.println(h + " " + m); 
				
			  //24�� ���� �������� �Է�
			hi.close();
			}
			
		

	

}
