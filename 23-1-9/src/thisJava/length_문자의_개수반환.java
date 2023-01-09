package thisJava;

import java.util.Scanner;

public class length_문자의_개수반환 {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		String ssn = hi.nextLine(); //  입력 개수 반환
		long heymama = ssn.length();
		
		if(heymama == 13) 
			System.out.println("숫자 아시네유?");
		else
			System.out.println("숫자 몰라유?");
		

			
			
		

	}

}
