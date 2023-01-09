package thisJava;

import java.util.Scanner;


public class 배열_05 {
	//룩업 테이블 
	public static void main (String[]args) {
		Scanner hi = new Scanner(System.in);
		int [][] ajdcjddl = new int [hi.nextInt()][hi.nextInt()];
		
		for(int i=0; i<ajdcjddl.length-1; i++) {
			for(int j=0; j<ajdcjddl[i].length-1; j++) {
				ajdcjddl[i][j] = (int)(Math.random()*5)+1;
				ajdcjddl[i][ajdcjddl[i].length-1] += ajdcjddl[i][j];
				ajdcjddl[ajdcjddl.length-1][j] += ajdcjddl[i][j];
				ajdcjddl[ajdcjddl.length-1][ajdcjddl[i].length-1] += ajdcjddl[i][j];
			}
			
		}
		
		for(int i=0; i<ajdcjddl.length; i++) {
			for(int j=0; j<ajdcjddl[i].length; j++) {
				System.out.print(ajdcjddl[i][j]+"\t");
			}System.out.println();
		}
			
		
		
	}

}
