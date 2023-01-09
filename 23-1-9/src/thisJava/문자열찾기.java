package thisJava;

import java.util.Scanner;

public class 문자열찾기 {

	public static void main(String[]args) {
		String test = "자바 프로그래밍은 어렵다!";
		
		int location = test.indexOf("어렵다");
		System.out.println("test의 길이는 " +  test.length());
		System.out.println("어렵다!의 위치는 " + (location+1) + "번째 " );   //프로그래밍 이 몇 번째 인덱스 부터 시작하는지 
		String sub = test.substring(location);    //substring() 메서드 sub = subject 의 문자열 에서 location으로 찾은 위치  부터  잘라냄
		System.out.println(sub);
		String newtest = test.replace("어렵다!", "soEasy!");
		
	
		System.out.println(newtest);
	
		
		
		
	}
}
