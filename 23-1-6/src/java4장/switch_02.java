package java4장;

import java.util.Scanner;

public class switch_02 {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		char grade = hi.nextLine().charAt(0);
		
		switch(grade) {
			case 'A' : 
			case 'a' :
				System.out.println("A 입니다요");
				break;
			case 'b' :
			case 'B' :
				System.out.println("A 입니다요");
				
			case 'C' :
			case 'c' :
				System.out.println("A 입니다요");
			case 'd' :
			case 'D' :
				System.out.println("A 입니다요");
			case 'E' :
			case 'e' :
				System.out.println("efghijklsn opqrstv vwxyz 입니다요");
		}
	}

}
