
import java.util.Scanner;

public class Main_�⼮���ѻ�� {
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		
		int num=0;
		int [] stu = new int[30];
		
		for(int i=0; i<28; i++) {
			stu[hi.nextInt()-1]++;     // �Է� ���� ������ ���� 1 ����   
						// -1 �ϴ� ������ �ε����� 0������ �����ϹǷ�
			
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
