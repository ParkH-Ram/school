package java4장;

import java.util.Scanner;

public class test {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. 증속| 2. 감속 | 3. 중지");
			System.out.println("----------------------");
			System.out.println("선택: " );
			
			int strNum = hi.nextInt();
			if (strNum == 1) {
				speed++;
				speed++;
				speed++;
				speed++;
				System.out.println("현재 속도= " + speed);
			}else if(strNum == 2) {
				speed--;
				speed--;
				System.out.println("현재 속도= " + speed);
			}else if (strNum==3) { 
				run = false;
				System.out.println("중지");
				}
		}
		
	}
}
