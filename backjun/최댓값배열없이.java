package backjun;

import java.util.Scanner;

public class Main_�ִ� {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i = new int[9];// �ε��� 9���� ���� �迭 ����
	    int value;         		// �ε��� �ȿ� �� ��
	    int max;				// �ִ�
	    int count=0;			// ���°�� �ִ��� �ִ��� 
	 
	    
	    for(value=0; value<i.length; value++) {   //�迭�ȿ� �������� ������ �ΰ� ������ ��
	    	//i�ȿ� �Է� �� �ε��� ���� ���� �� 
	    	i[value] = hi.nextInt();      //i[value] �ȿ� cacao �� ( ���� �Է� ) �� ����
	    }
	
	    max = i[0];// �ִ�     // ���� �־� �� �� �ؿ��� �ε����� �޾ƾ� ��
	    for(value=0; value<i.length; value++) {
	    	//������ �� ������ �ƴϸ� ������ ���ϱ�
	    	// �̰��� ������ max���� ��
	    
	    	if(max < i[value]) {
	    	   max = i[value];
	    	   count=value + 1;
	    	   }
		 
	
	    
	    }
	    System.out.println(count + " " + max );
	    hi.close();

	}
	
	
	
	
}
	

