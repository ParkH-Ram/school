package backjun;

import java.util.Scanner;

class Matdasi{
	int h,m,sum;
	// 클래스 변수 선언
	public Matdasi(int h, int m, int sum) {
		// 클래스 생성자 ( 매개 변수를 받는다 )
		
		this.h = h; 
		// 이 클래스 변수를 생성자에 대입
		
		this.m = m;
		// 이 클래스 변수를 생성자에 대입
		
		this.sum = sum;
	}
	public void setOven() {
		this.sum = (this.h*60) + this.m + this.sum;
		this.h = (this.sum/60)%24;  //  다 더해서 60으로 나눈 뒤 24로 나눈 나머지 값을 구하면 
		//  0은 0으로 표시 25는 1로 표시 돼서 괜춘.
		this.m = this.sum%60;
		
		System.out.println(h+" "+m);		

	}
}
public class Main_오븐시계복습_클래스로만들어보자 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int h,m,sum;
	h=hi.nextInt();
	m=hi.nextInt();
	sum=hi.nextInt();
	
	Matdasi Ove = new Matdasi(h, m, sum);	
	Ove.setOven();
		
	}
	
}
	
	


