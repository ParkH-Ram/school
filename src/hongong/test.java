package hongong;

import java.util.Scanner;

	public class test {
		
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	int [] i = new int [hi.nextInt()];
	int sum=0;
	int j;
	for(j=0; j<i.length; j++ ) {
	   i[j] = hi.nextInt();
	   sum += i[j];
	}
	System.out.println(sum);
	}

}
