package _12월_6일;

import java.util.Scanner;

public class 평균점수계산 {
	public static void main(String[] args) {
		int eng, pro, math, com;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영어점수 입력 하세요");
		eng = scan.nextInt();
		System.out.println("프로그램점수 입력 하세요");
		pro = scan.nextInt();
		System.out.println("수학점수 입력 하세요");
		math = scan.nextInt();
		System.out.println("컴퓨터점수 입력 하세요");
		com = scan.nextInt();
		System.out.println("평균 점수는 " + (eng+pro+math+com)/4 + "입니다.");
		
		}
		
}
