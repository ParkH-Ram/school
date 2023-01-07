package hongong;

public class 자바의정석_주사위합 {
	
	public static void main(String[]args) {
		
		int dice1, dice2;
		int [] count = new int[7];

			while(true) {
				
				dice1 = (int)(Math.random()*6)+1;
				dice2 = (int)(Math.random()*6)+1;
				count[6]++;
				
				if(dice1==1 || dice2==1) count[0]++;				
				if(dice1==2 || dice2==2) count[1]++;
				if(dice1==3 || dice2==3) count[2]++;
				if(dice1==4 || dice2==4) count[3]++;
				if(dice1==5 || dice2==5) count[4]++;
				if(dice1==6 || dice2==6) count[5]++;
				
//				if(dice1==1) count[0]++;
//				if(dice2==1) count[0]++;
//
//				if(dice1==2) count[1]++;
//				if(dice2==2) count[1]++;
//
//				if(dice1==3) count[2]++;
//				if(dice2==3) count[2]++;
//				
//				if(dice1==4) count[3]++;
//				if(dice2==4) count[3]++;
//				
//				if(dice1==5) count[4]++;
//				if(dice2==5) count[4]++;
//				
//				if(dice1==6) count[5]++;
//				if(dice2==6) count[5]++;
				
				if((dice1+dice2)==5) break;

			
		}
		
		System.out.println("합이 5까지 주사위를 몇번 던 졌나요? " +count[6]);
		System.out.println("1이 나온 횟수 " +count[0]);
		System.out.println("2이 나온 횟수 " +count[1]);
		System.out.println("3이 나온 횟수 " +count[2]);
		System.out.println("4이 나온 횟수 " +count[3]);
		System.out.println("5이 나온 횟수 " +count[4]);
		System.out.println("6이 나온 횟수 " +count[5]);
	}

}
