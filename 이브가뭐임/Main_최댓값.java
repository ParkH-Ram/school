package �̺갡����;

import java.util.Scanner;

public class Main_�ִ� {

	public static void main(String[]args) {
	
	Scanner hi= new Scanner(System.in);
	
	    int []i = new int[9];// �ε��� 9���� ���� �迭 ����
	    int j;				// i�� �� ����
	    int max;
	    int maxint=0;

	   
	    
	    for(j=0; j<9; j++) {
	    	  i[j] = hi.nextInt();
	    }
	    max =  i[0];
	    for(j=0; j<9; j++) {
	    	  if(max<i[j]) {
	    		  max = i[j];
	    		  maxint  =j+1;
	    	  }	
	    }
		System.out.println(max + "\n" + maxint);
	}
	
}