package backjun;

import java.util.Scanner;

public class Main_배열없이 {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num=0;
		int max=0;
		int min=0;
		
		for(int i=0;i<n;i++) {
			num = scan.nextInt();
			if(i==0) {    
	//초기 값을 0을 입력 해주면 min에 0이 출력 되므로 0이라도 들어오게 
				max=num;
				min=num;
			}
			if(num>max) {   //  num이 max 보다 작으면 
				max = num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.print(min+" "+max);
		
		scan.close();
	}

}
