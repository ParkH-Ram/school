package �̺갡����;

import java.util.Scanner;

public class Main_�ִ񰪹迭���� {
	
	public static void main(String[]args) {
		
	
	
	Scanner hi = new Scanner(System.in);
	// �ִ��� ���Ϸ��� �ϴ� ���� �Է� ���� ������ ���� �� ���ָ� 
	// �ʿ��� ���� 
	// �ִ� ���� max ����
	// ���� ���� ���� a ����
	// �Է��� ���� �� �ִ��� �� ��° �ִ��� Ȯ�� �� b����
	
	int a;        	//���� ���� ���� 
	int b=0; 		// ��ġ ã�� ���� �ʿ��� ����
	int h=0;			// �ִ� ��ġ ã�� ����
	int c;		 	// for ���� �� ����
	int max=-1;     //�ִ� 
	
	for(c=1; c<10; c++) {      //c �� 10���� ������ c�� 1�� ����
		a = hi.nextInt();		//a= �Է� ���� ����
				// b ���� ( �Է� ���� ���� ���� ���� üũ )
		  if(max<a) {				// max �� a���� ������ 
			  max = a;			// max�� a 
			  h = c;				// h = ��ġ ã�� ���� 
			//�� 9�� ���� ���� h�� ��� �������� üũ ����� �ؿ��� ã�� �� ����
			//�̰� �� ���ڱ� ���������� ��;;
		
			
		}
		
		
	}
	System.out.println(max + "\n" + h);
	hi.close();
	
	
	
	}
	
	
	
}
