package ����;

import java.util.Scanner;

public class Main_�����ε�������� {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int  A;
	
	A = hi.nextInt();
	hi.nextLine();
	String B = hi.nextLine();
	int sum = 0;
	sum = A * Integer.parseInt(B);   
	//������ Ŭ������ �Ľ���Ʈ ���ָ� ��Ʈ������ ���� ���ڰ� ���ڸ� ���������� ���� ����
	
	
	System.out.println(((int)B.charAt(2)-48) * A);
	System.out.println(((int)B.charAt(1)-48) * A);
	System.out.println(((int)B.charAt(0)-48) * A);
	System.out.println(sum);
	
	
		
	hi.close();
	}

}
