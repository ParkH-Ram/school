package git_test;

import java.util.Scanner;

public class printf�ǽ�_�Է½ǽ� {	
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);	
		int value =123;
		//������ �ȸ����� ������ ����
		System.out.printf("��ǰ�� ����: %d��\n", value);
		System.out.printf("��ǰ�� ����: %6d��\n", value);
		//�տ� �� 6�ڸ� �տ� 3�ڸ� ����� 
		System.out.printf("��ǰ�� ����: %-6d��\n", value);
		// �ڿ� 6�ڸ� ����� 
		System.out.printf("��ǰ�� ����: %06d��\n", value);
		// 6�ڸ��� ��ĭ�� 0���� ä��
	
		double pi = 3.14159 * 10 *10;
		
		System.out.printf("������ �� %d�� ���� ���� : %10.2f\n", 10, pi);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name,job);
		
	
		System.out.print("X �� �Է�: ");
		String strX = hi.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("Y �� �Է�: ");
		String strY = hi.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("�Է� ���ڿ�:  " );
			String data = hi.nextLine();
			

			if (data.equals("q")) {
				break;
			}
			System.out.println("��� ���ڿ�: "+ data);
			System.out.print("\n�����Ϸ��� q ���� ���ּ���~~ \n");
			System.out.println();
		}
		System.out.println("����");
		
	}
	
}
