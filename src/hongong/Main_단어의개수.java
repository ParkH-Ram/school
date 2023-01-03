package hongong;

import java.util.Scanner;

public class Main_단어의개수 {

	public static void main (String[]args) {
		Scanner hi = new Scanner(System.in);	
		
		
		String A = hi.nextLine();
		int count=0;
//		int i;
//		for (i=0; i<A.length(); i++) {
//			if(A.charAt(i)==' ') {
//				if(i!=0 && i!=A.length()-1)
//				// 맨 앞이거나 맨 뒤거나
//					count++;	
//			}
//		}
		if(A.charAt(0)==' ') count++;
		String[] B = A.split(" ");
		System.out.println(B.length-count);
		hi.close();
	}
}
