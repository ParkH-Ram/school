package hello230119;

public class System_ExitExam {
	public static void main(String[]args) {
		for(int i=0; i<77777; i++) {
			System.out.println(i);
			if( i == 55555) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}
