package thisJava;
ckage thisJava;

public class Account3333{

	private int balance;
	public static final int MIN_BALANCE = 0;          // ��� ���� �ּڰ�
 	public static final int MAX_BALANCE = 1000000;	  // ��� ���� �ִ�

 	
 	
 	
 	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE  && balance <= MAX_BALANCE){
			this.balance = balance;
		}
	}

}



