package test;

import java.util.Scanner;

public class ������ {
	
	public static void main(String[]args) {
		
		int [] elecArray = new int[3];
			double payment = 0;
			elecArray[0] = 200;
			elecArray[1] = 200;
			elecArray[2] = 200;
			
		Scanner input = new Scanner(System.in);
		System.out.println("���� ��뷮�� �Է��ϼ���");
		  elecArray[2] = input.nextInt();
		  //�迭�� �����ص� ���� �ٲ㼭 ���� �� �� ����.
			
		  if (elecArray[2]<=200) {
			  payment = 910+elecArray[2] * 93.3;
			  //200 ������ ����̹Ƿ� 910 �� 
			//�Է¹��� elecArray[2]�� ���� 200���� ������ elecArray[2]�� 93.3�� ���Ѵ�.
			  //���ϰ� 910�� ���� ���� payment�� �����Ѵ�.
		  } else if (elecArray[2]>200&&elecArray[2]<400) {
			  payment = 1600+((elecArray[2]-200)* 187.9) + (elecArray[0]*93.3);
		  }
		  // 200 ���� 400 ������ ����̹Ƿ� 1600�� ���Ѵ� 
		  // �Է� ���� elecArray[2]�� ���� 200�� ���� 200�� �ʰ��ϴ� �κ��� ���Ѵ�.
		  // 200�� �ʰ��ϴ� �κп� ���ؼ� 187.9�� ���Ѵ�.
		  // 200������ �κ��� elecArray[0]�� 93.3�� ���Ѵ�.
		  // ��� ���� ���� payment�� �����Ѵ�.
		  
		  else if (elecArray[2]>=400) {
			 payment = 7300+(elecArray[1]*187.9) + (elecArray[0]*93.3) + (elecArray[2]-elecArray[0]-elecArray[1]*280.6);
		  } // 400�� �ʰ��ϴ� ��� �̹Ƿ� 7300�� ���Ѵ�
		  //�Է��� elecArray[2]�� 400���� ũ�ٸ� 200�� ����� elecArray[1]��  187.9�� ���Ѵ�
		  //elecArray[0]93.3�� ���Ѵ� 400�� �ʰ��ϴ� ��쿡 ���� �ڵ��̹Ƿ� 400�� elecArray[2]���� ���� �ְ� ������ 280.6�� ���Ѵ�.
		  //elecArray[0] + elecArray[1] + elecArray[2] �� ���� payment��  �����Ѵ�
		 
		  System.out.print("�⺻��� : " + payment);
		
		
		  
	}
	

}
