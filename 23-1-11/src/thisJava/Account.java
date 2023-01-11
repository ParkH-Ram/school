package thisJava;

public class Account {
		
	private String AccountNum;
	private String owner;
	private int money;
	
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		AccountNum = accountNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
