package thisJava;

import java.util.Scanner;

public class ���ڿ�_split�ǽ�_�Է¹ް�_����ϱ�2 {

	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	String season = hi.nextLine();
	String newSeason = season.replace("����", "��");
	System.out.println(newSeason);
	
	String fruit = hi.nextLine();
	String [] num = fruit.split(" ");
	
	for(int i=num.length-1; i>=0; i--) {    // �������� ���  // �迭 ���� ��� �ܿ� ��
		System.out.print(num[i]+  " ");
	}
	
	
	
	

	}
	
}
