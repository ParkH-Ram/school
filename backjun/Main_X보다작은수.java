package backjun;

import java.util.Scanner;

public class Main_X���������� {
	
	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	int[] i;            //�迭 ���� i[]
	int j;            // �迭 �ȿ� �� �迭 �� (�ε��� �� )
	j = hi.nextInt();
	i= new int[j];
	int x = hi.nextInt();    // �־����� ���� �� (���� ���� ��) 
 	int count=0;
 	int f;
 	for(f=0; f<i.length; f++) {    //�ε����� 0���� ����
 		i[f] = hi.nextInt();
		
	}
 	
	for(int k=0; k<i.length; k++) {    //�ε����� 0���� ����
		if(i[k]<x ) {
			System.out.print(i[k]+" ");
		}
		
	}
	

		
	}

}
