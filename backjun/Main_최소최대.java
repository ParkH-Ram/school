package backjun;

import java.util.Scanner;

public class Main_�ּ��ִ� {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i;// �迭  ����
	    int j = hi.nextInt();// �迭�� ���� �ε��� �� �Է� 
	    i = new int[j];// �迭�ȿ� (i[]�ȿ� j�� ���� 
	
	    int value;          // for�� ���� ����  ( j�� �� �Է�
	    int cacao;    // �ε��� �ȿ� �� ��
	    int min;
	    int max;
	 
	    
	    for(value=0; value<i.length; value++) {   //�迭�ȿ� �������� ������ �ΰ� ������ ��
	    	//i�ȿ� �Է� �� �ε��� ���� ���� �� 
	    	cacao = hi.nextInt();
	    	i[value] = cacao;      //i[value] �ȿ� cacao �� ( ���� �Է� ) �� ����
	    }
	    min = i[0];// �ּڰ�  i ���� ù ��° ���� ���� 
	    max = i[0];// �ִ�     // ���� �־� �� �� �ؿ��� �ε����� �޾ƾ� ��
	    for(value=0; value<i.length; value++) {
	    	//�迭�� �����鼭 �� ��
	    
	    	if(min > i[value]) 
	    		min = i[value];
	    	
	    	if(max < i[value])
	    		max = i[value];
	    		
	    }
	    
	    
	    
	    System.out.println(min+" "+ max);
	    
	    
	    hi.close();
	    
	    }
	    

	
	
	
	
}
	

