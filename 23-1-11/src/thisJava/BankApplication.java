package thisJava;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner hi = new Scanner(System.in);
	
	public static void main(String[]args) {

		int button;
		int count=0;

		loop:  // �ȿ� �ִ� �ݺ������� �극��ũ �غ��� ��Ŀ�� �ۿ� 
			// ���� ������ ���� �� �ݺ����� �̸� :  <<�ݷ� �տ� �̸� 
			// break �̸�;  �س����� �̸� break; �� ���� ������ ����
       while(true) {			//5�� �ƴ϶��  while�� �۵� // �ٽ� �� ������ �Ϸ���  
			System.out.println("-----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------------------------------");
			System.out.printf("���� > ");
			button = hi.nextInt();
			hi.nextLine();
			switch(button) {
			case 1:
				Account account = new Account();
				System.out.println("-------");
				System.out.println("���� ����");
				System.out.println("-------");
				System.out.print("���� ��ȣ : " );
				account.setAccountNum(hi.nextLine());  // �Է��� ���� ����� ����
				System.out.print("���� �� : " );
				account.setOwner(hi.nextLine());
				System.out.print("�ʱ��Աݾ� : " );
				account.setMoney(hi.nextInt());
				System.out.print("��� : ���� ���� �Ǿ����ϴ�. " );
				accountArray[count] = account;
				count++;
			break;
			
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println(accountArray[i].getAccountNum() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getMoney() );
				}
				
				break;
			case 3:
				System.out.print("���¹�ȣ : ");
				String myNum = hi.nextLine();
				for(int i=0; i<count; i++) {
					if(accountArray[i].getAccountNum().equals(myNum)) {
						System.out.print("���ݾ� : ");
						accountArray[i].setMoney(accountArray[i].getMoney()+hi.nextInt());	
					}	
				}
				break;
			case 4:
				System.out.print("����");
				String mynom = hi.nextLine();
				System.out.print("��ݾ� : ");
				int money = hi.nextInt();
			
				for(int i=0; i<count; i++) {
					if(accountArray[i].getAccountNum().equals(mynom)) {
						if(accountArray[i].getMoney()>=money) {
							accountArray[i].setMoney(accountArray[i].getMoney()-money);
							System.out.println("����");
						} else {
							System.out.println("������ ������");
						}
					}
						
							
					}
					
				break;
			case 5:
				System.out.println("�����ϻ�");
				break loop;
		}
       
	
       }
     }
}


