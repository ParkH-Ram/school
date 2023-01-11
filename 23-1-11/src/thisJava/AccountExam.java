package thisJava;

public class AccountExam {
	
	public static void main(String[]args) {
		
	
	
	Account account = new Account();
	
	account.setBalance(100000);
	System.out.println(account.getBalance());
	
	account.setBalance(-100000);
	System.out.println(account.getBalance());
	
	}
}
