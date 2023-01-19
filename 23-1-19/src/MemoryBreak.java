
public class MemoryBreak {
	public static void main(String[]args) {
		for(int i=0; i<7777777; i++) {
			System.out.print(i);
			if( i == 5575555) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}

