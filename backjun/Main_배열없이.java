package backjun;

import java.util.Scanner;

public class Main_�迭���� {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num=0;
		int max=0;
		int min=0;
		
		for(int i=0;i<n;i++) {
			num = scan.nextInt();
			if(i==0) {    
	//�ʱ� ���� 0�� �Է� ���ָ� min�� 0�� ��� �ǹǷ� 0�̶� ������ 
				max=num;
				min=num;
			}
			if(num>max) {   //  num�� max ���� ������ 
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
