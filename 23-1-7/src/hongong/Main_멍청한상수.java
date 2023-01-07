package hongong;

import java.util.Scanner;

public class Main_멍청한상수 {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
		String num1 = hi.nextLine();
		String num2 = hi.nextLine();
		
		char []arr1 = num1.toCharArray(); //  스트링 -> charAt
		char []arr1re = new char[arr1.length];
		for (int i=0; i<arr1.length; i++) {
			arr1re[arr1.length-1-i] = arr1[i];
		}
		
		String value = new String(arr1re);
		System.out.println(arr1re);
		
		char []arr2 = num2.toCharArray(); //  스트링 -> charAt
		char []arr2re = new char[arr2.length];
		for (int i=0; i<arr1.length; i++) {
			arr2re[arr2.length-1-i] = arr2[i];
		}
		String value2 = new String(arr2re);
		System.out.println(arr2re);
	
	
		
		
	
	}
	
}
