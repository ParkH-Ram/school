package java4��;

import java.util.Scanner;

public class test {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. ����| 2. ���� | 3. ����");
			System.out.println("----------------------");
			System.out.println("����: " );
			
			int strNum = hi.nextInt();
			if (strNum == 1) {
				speed++;
				speed++;
				speed++;
				speed++;
				System.out.println("���� �ӵ�= " + speed);
			}else if(strNum == 2) {
				speed--;
				speed--;
				System.out.println("���� �ӵ�= " + speed);
			}else if (strNum==3) { 
				run = false;
				System.out.println("����");
				}
		}
		
	}
}
