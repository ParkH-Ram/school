package ����;

import java.util.Scanner;

public class Main_�����ε��������3 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int A;
	
	A=hi.nextInt();
	hi.nextLine();
	String B = hi.nextLine();
	
	String[] arr = B.split(""); //�����ڸ� �����ݾƿ�
//	�����ڰ� �� ���ڿ��� �Ǵϱ� �׳� ���� ���� �������� �� �ɰ��� �ſ��� 
//	�׷��� ���ڿ� �迭�� ����
//	�����ڸ� �� ������ �� ���� ���� �� �ɰ�
	
	System.out.println(Integer.parseInt(arr[2])*A);
	System.out.println(Integer.parseInt(arr[1])*A);
	System.out.println(Integer.parseInt(arr[0])*A);
	System.out.println(Integer.parseInt(B)*A);  
	//�迭�� ��ü���� �����ַ��� B�� ���ָ� ��. �ɰ��� ���� ������
	
	hi.close();
	}

}
