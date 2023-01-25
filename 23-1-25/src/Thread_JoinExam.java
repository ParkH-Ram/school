
public class Thread_JoinExam {
	public static void main(String[]args) {
		Thread_Sum sumT = new Thread_Sum();
		sumT.start();
		
		try {
			sumT.join();
		}catch (InterruptedException e) {}
		System.out.println(sumT.getSum());
	}
}
