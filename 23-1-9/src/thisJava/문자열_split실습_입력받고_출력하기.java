package thisJava;

import java.util.Scanner;

public class ���ڿ�_split�ǽ�_�Է¹ް�_����ϱ� {

	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("�̸� �й� �а� �Է��ϼ��� ( �̸�/�й�/�а�)");
		String name = hi.nextLine();
		String [] tokens = name.split("/");    //  /�̰ɷ� ���� �Ǵ� ������ �ڸ��δ�.
		
		System.out.println("�̸�: " + tokens[0]);
		System.out.println("�й�: " + tokens[1]);
		System.out.println("��ǻ�Ͱ��а�: " + tokens[2]);
	
	
		System.out.println("�̸� �Է�");
		String str = hi.nextLine();
		System.out.println("������� �Է� (mm/dd/yy)");
		String birth = hi.nextLine();
		String [] test = birth.split("/");
		
		System.out.println("�̸� : " + str);
		System.out.println("�������: " + test[2]+"�� "+test[0]+"�� " + test[1]+"��");
		
		
		
		
//
//		�̸� �й� �а� �Է� ���� �� 
//		�̸� : ȫ�浿
//		�й� :
//		�а� : 
//		
//		�̸� �Է� : ȫ�浿
//		������� (mmddyy)���� :
//			
//		�̸�
//		������� 
//			
//			
			
			
			
			
			
			
		

	}

}
