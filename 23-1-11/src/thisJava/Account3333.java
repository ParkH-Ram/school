package thisJava;
ckage thisJava;

public class Account3333{

	private int balance;
	public static final int MIN_BALANCE = 0;          // 상수 설정 최솟값
 	public static final int MAX_BALANCE = 1000000;	  // 상수 설정 최댓값

 	
 	
 	
 	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE  && balance <= MAX_BALANCE){
			this.balance = balance;
		}
	}

}



