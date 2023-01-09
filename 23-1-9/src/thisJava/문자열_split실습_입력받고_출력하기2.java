package thisJava;

import java.util.Scanner;

public class 문자열_split실습_입력받고_출력하기2 {

	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	String season = hi.nextLine();
	String newSeason = season.replace("가을", "봄");
	System.out.println(newSeason);
	
	String fruit = hi.nextLine();
	String [] num = fruit.split(" ");
	
	for(int i=num.length-1; i>=0; i--) {    // 역순으로 출력  // 배열 역순 출력 외워 걍
		System.out.print(num[i]+  " ");
	}
	
	
	
	

	}
	
}
