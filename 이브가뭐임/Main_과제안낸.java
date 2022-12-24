package 이브가뭐임;

import java.util.Scanner;

public class Main_과제안낸{

	public static void main(String[] args) {
		
	Scanner hi = new Scanner(System.in);
	
	int [] i = new int[30];
	int j;
	int s;
	for (j=0; j<i.length-2; j++) {
		i[hi.nextInt()-1]=1;           // 
		// 인덱스에 값을 바로 넣어줌  넣어줄 수 있음 ;;
		// 20번째 학생은 19번 인덱스에 있으므로 -1
		//입력한 번호를 1로 만듬 
	}
	
	for (j=0; j<i.length; j++) {
		if ( i[j] != 1) {
			System.out.println(j+1);
			// 몇 번째 학생이니까 j 는 인덱스 번호라 +1을 해줘야함
		}
	}
	
	
		
	hi.close();
	}

}
