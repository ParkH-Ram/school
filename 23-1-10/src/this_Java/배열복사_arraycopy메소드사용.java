package this_Java;

import java.util.Scanner;

public class 배열복사_arraycopy메소드사용 {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
	
		
		String [] newhihi = new String[hi.nextInt()];
		
		for (String i : newhihi) {
			i = hi.nextLine();
			
		}
		for (int i=0; i<newhihi.length; i++) {
			System.out.println(newhihi[i]);
		}
		
		
		
//		String [] newString = new String [hi.nextInt()];
//		
		//System.arraycopy(old, 1, newString, 1, old.length-1);
		// null array hello null null
		//old array를 인덱스 0번부터  new스트링에 0번 인덱스 부터 복사 
//		System.arraycopy(old, 0, newString, 2, old.length-1);
		//null null man array null
//		System.arraycopy(old, 0, newString, 2, old.length-2);
//		System.arraycopy(old, 2, newString, 0, old.length-2);
//		System.arraycopy(old, 2, newString, 4, old.length-2);
//		System.arraycopy(old, 2, newString, 3, old.length-2);
//		System.arraycopy(old, 2, newString, 1, old.length-2);
		
//		for (int i=0; i<newString.length; i++) {
//			System.out.println(newString[i] );
//		}
	}

}
