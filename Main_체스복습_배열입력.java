package backjun;

import java.util.*;

public class Main_체스복습_배열입력 {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int [] s = {1, 1, 2, 2, 2, 8};
	int i=0;
	while(i<s.length) {
		System.out.print(s[i] - hi.nextInt());
		i++;
	
	}
	hi.close();
	}
	
}