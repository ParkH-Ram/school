package hongong;

import java.util.Scanner;

public class Main_�ܾ��ǰ��� {

	public static void main (String[]args) {
		Scanner hi = new Scanner(System.in);	
		
		
		String A = hi.nextLine();
		int count=0;
//		int i;
//		for (i=0; i<A.length(); i++) {
//			if(A.charAt(i)==' ') {
//				if(i!=0 && i!=A.length()-1)
//				// �� ���̰ų� �� �ڰų�
//					count++;	
//			}
//		}
		if(A.charAt(0)==' ') count++;
		String[] B = A.split(" ");
		System.out.println(B.length-count);
		hi.close();
	}
}
