package gogo;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		//상품의 가격들의 합이 100,000을 초과할 때까지 상품 가격을 계속 읽어 들이는 프로그램
		
		int price, total;  //가격, 합계
		
		Scanner hi = new Scanner(System.in);
		
		//합계를 0으로 초기화
		total = 0;
		
		//상품 가격 합 100,000 초과 때까지 반복
		do {
			System.out.println("상품 가격 입력");
			price = hi.nextInt();
			
			//합계를 구함
			total += price;
		} while (total <= 100000);
		
		//합계 출력
		System.out.println("합계는" + total);
		hi.close();
	}

}
