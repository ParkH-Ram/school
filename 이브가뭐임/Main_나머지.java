package �̺갡����;

import java.util.Scanner;

public class Main_������ {

	public static void main(String[] args) {
		// ���� 10���� �Է� �ް� �� ����  42�� ���� ������ ��
		//  �ٸ� ����  �� �� �ִ��� �ľ� �Ͻÿ�
	
	Scanner hi = new Scanner(System.in);
	
	int [] reMain = new int[42];
	int i;
	int h;          // �ݺ��� ���� ���� 
	int count=0;    // ������ ���� 1�� �ٲ� �ֵ��� üũ �ϴ� �Լ�
	
	for(h=0; h<10; h++ ) {
		reMain[hi.nextInt() % 42] = 1 ;     
		// �Է� ���� ���ڸ� 42�� ���� �������� ���ϰ�
		// �� �ε����� ���� 1��  �Է¾��� �ֵ��� 0�� ��
	}
	for(i=0; i<42; i++) { 
		if(reMain[i]==1) {      
			// �迭�� ���鼭 (�ε��� 0~41) ���� ���鼭 1�� �ֵ� ������ �ľ�
			count++;
		}
	}
	System.out.println(count);
	hi.close();
		
	}

}
