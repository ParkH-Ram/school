package hongong;

public class �ڹ�������_�ֻ����� {
	
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
		
		System.out.println("���� 5���� �ֻ����� ��� �� ������? " +count[6]);
		System.out.println("1�� ���� Ƚ�� " +count[0]);
		System.out.println("2�� ���� Ƚ�� " +count[1]);
		System.out.println("3�� ���� Ƚ�� " +count[2]);
		System.out.println("4�� ���� Ƚ�� " +count[3]);
		System.out.println("5�� ���� Ƚ�� " +count[4]);
		System.out.println("6�� ���� Ƚ�� " +count[5]);
	}

}
