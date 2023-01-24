
import java.util.Scanner;

public class Main_출석안한사람 {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		
		int num=0;
		int [] stu = new int[30];
		
		for(int i=0; i<28; i++) {
			stu[hi.nextInt()-1]++;     // 입력 받은 번지에 증감 1 해줌   
						// -1 하는 이유는 인덱스는 0번부터 시작하므로
			
		}
		for (int i=0; i<30; i++) {
			if(stu[i]==0) {
				if(i<num) {
					i =num;
				}
				System.out.println(i+1);
			}
		}
	hi.close();
	}

}
