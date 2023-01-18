
public class AccountExam {
	public static void main(String[]args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		acc.deposit(500000000);
		System.out.println("예금액" + acc.getBalance());
		
	
		
		
		try {
			acc.withdraw(30000);
			acc.withdraw(30000);
			acc.withdraw(30000);
			acc.withdraw(30000);
			acc.withdraw(30000);
			acc.withdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}finally {
			System.out.println("예금액" + acc.getBalance());
		}
	
	
	}

}
