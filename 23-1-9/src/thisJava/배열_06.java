package thisJava;

import java.util.*;

public class 배열_06 {

	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int rowNum;
		int colNum;
		char [][] arr; 
		char ch = 'a';
		
		System.out.printf("행의 크기 : ");
		rowNum = hi.nextInt();
		
		arr = new char[rowNum][];
		for (int i=0; i<rowNum; i++) {
			
			System.out.printf(i+"열의 크기 : " );
			colNum=hi.nextInt();
			arr[i] = new char[colNum];
			for(int j=0; j<colNum; j++){
				
				arr[i][j] = ch++;
			}
		
		}for(int s=0; s<arr.length; s++) {
			for(int p=0; p<arr[s].length; p++) {
				System.out.print(arr[s][p]+" ");
			}System.out.println();
		}
	
	}
}
