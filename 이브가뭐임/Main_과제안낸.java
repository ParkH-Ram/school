package �̺갡����;

import java.util.Scanner;

public class Main_�����ȳ�{

	public static void main(String[] args) {
		
	Scanner hi = new Scanner(System.in);
	
	int [] i = new int[30];
	int j;
	int s;
	for (j=0; j<i.length-2; j++) {
		i[hi.nextInt()-1]=1;           // 
		// �ε����� ���� �ٷ� �־���  �־��� �� ���� ;;
		// 20��° �л��� 19�� �ε����� �����Ƿ� -1
		//�Է��� ��ȣ�� 1�� ���� 
	}
	
	for (j=0; j<i.length; j++) {
		if ( i[j] != 1) {
			System.out.println(j+1);
			// �� ��° �л��̴ϱ� j �� �ε��� ��ȣ�� +1�� �������
		}
	}
	
	
		
	hi.close();
	}

}
