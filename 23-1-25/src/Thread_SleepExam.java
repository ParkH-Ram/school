import java.awt.Toolkit;

public class Thread_SleepExam {
	public static void main(String[]args) {
		long sum=0;
		String str = new String();
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i=0; i<3; i++) {
			tool.beep();
		
			str += "500";
			sum = Long.parseLong(str)+400;
			System.out.println(sum);
			try {
				Thread.sleep(500); // 시간지연
			}catch(InterruptedException e) {
				
			}
		}
	}

}
