package backjun;

import java.util.*;

public class Main_OX���� {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		//ox �� �� �ľ�
		int i = hi.nextInt();      
		hi.nextLine();    // enter  �Է�
		String score;	 	// ��Ʈ�� �� �Է�
		char [] Ox;        // OX ���� �迭 ����
		int count=0;       //O�϶� ����
		int sum=0;         //�հ�
		for(int j=0; j<i; j++) {
			
			score = hi.nextLine();  // �������� ������ ���� ���� ENTER�� ������  �����
								    // ������ ���� ���� ���� Enter ������ �� ����
			Ox=score.toCharArray(); // �Է� ���� ���ڿ��� ĳ���Ϳ��� �ϳ��ϳ� �迭 ������ �޾���
			
			for(int h=0; h<Ox.length; h++) {  //ĳ���� �� �ݺ���
				if(Ox[h] =='O' ){    //�迭 ���� O �϶�
					count++;         // 1�� ����
					sum += count;    // ������ ���� �� �ϱ�
					// System.out.println(count+ " " + sum);
				} else{
					count =0;   // X �� �� �ٽ� �ʱ�ȭ
				}
			}
			
			System.out.println(sum);
			sum=0;   // sum count �� �ʱ�ȭ
			count=0;
		}

		
		hi.close();
	}
}
