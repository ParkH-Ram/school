package ����;

import java.util.Scanner;

public class Main_�������� {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int sum=0;

	String b;				//��Ʈ�� ���� b ����

	int a = hi.nextInt();   // ó�� �Է� ���� ���� ����	
	hi.nextLine();			// ���� �� �Է�
	b = hi.nextLine();		// ���ڿ� �Է�
	for (int i=0; i<a; i++) {		// �Է��� ��ŭ ���ڸ� 
		sum += (int)b.charAt(i)-48;
		// �ƽ�Ű�ڵ�� �ϳ��� �ɰ���  []�ε��� ��ȣ�� �޾���  �� �ϳ��� �� ������ 
		// 48�� 0�̶� ���� �ε��� 0������ �ޱ� ���� 0�� ����
	}
	System.out.println(sum);             
	
	hi.close();
	}

}
