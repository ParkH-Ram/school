package this_Java;

import java.util.Scanner;

public class �̰����ڹٴ�_5��_9������ {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);   
		int button=0;               // ���Ϲ� ����
		int [] score = null; 		//  ���� �Է� �迭 ���� �ʱⰪ �� 
		int student=0;				// �Է� ���� �л�	 
		int max=0;					// �ְ� ����
		int sum=0;					// �� ����
//				new int [hi.nextInt()];
		loop:  // �ȿ� �ִ� �ݺ������� �극��ũ �غ��� ��Ŀ�� �ۿ� 
				// ���� ������ ���� �� �ݺ����� �̸� :  <<�ݷ� �տ� �̸� 
				// break �̸�;  �س����� �̸� break; �� ���� ������ ����
		while(true) {			//5�� �ƴ϶��  while�� �۵� // �ٽ� �� ������ �Ϸ���  
		System.out.println("-------------------------------------------");
		System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");  //I Ga rit ������ 
		System.out.println("-------------------------------------------");
		System.out.printf("���� > ");
		button = hi.nextInt();
		switch(button) {
			case 1:
				System.out.printf("�л��� > ");
				student = hi.nextInt();
				score = new int[student];
			break;
			
			case 2:
				for(int i=0; i<student; i++) {
					System.out.printf("score[" + i + "]: ");
					score[i] = hi.nextInt();
				}
				break;
			
			case 3:
				for(int i=0; i<student; i++) {
					System.out.println("score[" + i + "] > " + score[i] );
				}
				break;
			
			case 4:
				for(int i=0; i<student; i++) {
					if(max < score[i]){
						max = score[i];
						sum += score[i];
					}
				}
				System.out.println("�� ���� : " + sum);
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + (sum/student));
				break;
			
			case 5:
				System.out.println("�����ϻ�");
				break loop;
		}
		
		}
		
	}
}
