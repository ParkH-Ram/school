
public class Thread_Calculator_Exam {
	public static void main(String[]args) {
		Thread_Calculator cal = new Thread_Calculator();
		Thread_Calculator_User user1 = new Thread_Calculator_User();
		user1.setThread_Calculator(cal);
		user1.start();
		
		
		
		Thread_Calculator_User2 user2 = new Thread_Calculator_User2();
		user2.setThread_Calculator(cal);
		user2.start();
		
	}

}
