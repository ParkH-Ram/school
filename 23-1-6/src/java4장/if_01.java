package java4장;

import java.util.Scanner;

public class if_01 {
	 
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
	
		
//		if(score >= 90) {
//			System.out.println("점수가 90보다 같거나 큼");
//			System.out.println("등급은 A 입니다.");
//		}
//		if(score >= 80 && score < 90)
//			System.out.println("점수가 80~ 89 임ㅋ \n 등급은 B임");
		
	
		for (int i=0; i<6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);	
		}
		

		
		
	}

}
