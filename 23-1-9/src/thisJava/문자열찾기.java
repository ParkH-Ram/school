package thisJava;

import java.util.Scanner;

public class ���ڿ�ã�� {

	public static void main(String[]args) {
		String test = "�ڹ� ���α׷����� ��ƴ�!";
		
		int location = test.indexOf("��ƴ�");
		System.out.println("test�� ���̴� " +  test.length());
		System.out.println("��ƴ�!�� ��ġ�� " + (location+1) + "��° " );   //���α׷��� �� �� ��° �ε��� ���� �����ϴ��� 
		String sub = test.substring(location);    //substring() �޼��� sub = subject �� ���ڿ� ���� location���� ã�� ��ġ  ����  �߶�
		System.out.println(sub);
		String newtest = test.replace("��ƴ�!", "soEasy!");
		
	
		System.out.println(newtest);
	
		
		
		
	}
}
