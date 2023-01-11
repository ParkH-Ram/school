package thisJava;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner hi = new Scanner(System.in);
	
	public static void main(String[]args) {

		int button;
		int count=0;

		loop:  // 안에 있는 반복문에서 브레이크 해봤자 한커플 밖에 
			// 완전 나가고 싶을 때 반복문에 이름 :  <<콜론 앞에 이름 
			// break 이름;  해놓으면 이름 break; 밖 까지 무조건 나감
       while(true) {			//5가 아니라면  while문 작동 // 다시 안 들어오게 하려고  
			System.out.println("-----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.printf("선택 > ");
			button = hi.nextInt();
			hi.nextLine();
			switch(button) {
			case 1:
				Account account = new Account();
				System.out.println("-------");
				System.out.println("계좌 생성");
				System.out.println("-------");
				System.out.print("계좌 번호 : " );
				account.setAccountNum(hi.nextLine());  // 입력이 세터 출력이 게터
				System.out.print("계좌 주 : " );
				account.setOwner(hi.nextLine());
				System.out.print("초기입금액 : " );
				account.setMoney(hi.nextInt());
				System.out.print("결과 : 계좌 생성 되었습니다. " );
				accountArray[count] = account;
				count++;
			break;
			
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println(accountArray[i].getAccountNum() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getMoney() );
				}
				
				break;
			case 3:
				System.out.print("계좌번호 : ");
				String myNum = hi.nextLine();
				for(int i=0; i<count; i++) {
					if(accountArray[i].getAccountNum().equals(myNum)) {
						System.out.print("예금액 : ");
						accountArray[i].setMoney(accountArray[i].getMoney()+hi.nextInt());	
					}	
				}
				break;
			case 4:
				System.out.print("계좌");
				String mynom = hi.nextLine();
				System.out.print("출금액 : ");
				int money = hi.nextInt();
			
				for(int i=0; i<count; i++) {
					if(accountArray[i].getAccountNum().equals(mynom)) {
						if(accountArray[i].getMoney()>=money) {
							accountArray[i].setMoney(accountArray[i].getMoney()-money);
							System.out.println("성공");
						} else {
							System.out.println("돈없어 새끼야");
						}
					}
						
							
					}
					
				break;
			case 5:
				System.out.println("종료하삼");
				break loop;
		}
       
	
       }
     }
}


