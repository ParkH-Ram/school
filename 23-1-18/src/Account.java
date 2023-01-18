
public class Account {
	private long balance=0;
	
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws InsufficientException{
//		if (this.balance < money) {
//			throw new InsufficientException("�ܰ���� ��T " + (money-balance) + "���ڶ�" );
//		}
//		this.balance -= money;
		doit(money);
	}
	
	public void doit(int money) throws InsufficientException{
		if (this.balance < money) {
			throw new InsufficientException("�ܰ���� ��T " + (money-balance) + "���ڶ�" );
		}
		this.balance -= money;
	}
}
