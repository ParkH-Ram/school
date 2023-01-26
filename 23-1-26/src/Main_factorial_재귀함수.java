import java.util.Scanner;

public class Main_factorial_재귀함수 {
	static int fact1(int num) {
		if(num ==1) return 1;
		if(num ==0) return 1;
		else return num*fact1(num-1); //num == 1 일때까지 반복
		      // ->  5 입력시  5*4 -> num-1 값으로 fact1 호출 
		      // -> 
	}
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		int num = hi.nextInt();
		System.out.println(fact1(num));
		hi.close();
	}


}