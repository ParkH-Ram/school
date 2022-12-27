package backjun;

import java.util.Scanner;

public class Main_체스복습_배열설정 {

	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	int [] i = {1, 1, 2, 2, 2, 8};

	for (int s=0; s<i.length; s++)
		System.out.print(i[s]- hi.nextInt());
		
	hi.close();
	}
}
