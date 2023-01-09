package thisJava;

import java.util.Scanner;

public class 배열_07 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);	
		String [][] arr = new String [6][6];
		int row, col;
		
		for(int i=0; i<arr.length-1; i++) {
			arr[0][i + 1] = arr[i + 1][0] = Integer.toString(i);
			// i에 입력된 숫자를 스트링형으로 바꾸겠다.
		}
		
		row = hi.nextInt();
		col = hi.nextInt();
		
		arr[row][col] = "X";
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==null) {
					System.out.print(" ");
				}else {
					System.out.print(arr[i][j]+ " "); 
				}
			}System.out.println();
		}
		
	
	}

}
