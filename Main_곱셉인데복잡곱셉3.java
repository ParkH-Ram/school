package 공부;

import java.util.Scanner;

public class Main_곱셉인데복잡곱셉3 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int A;
	
	A=hi.nextInt();
	hi.nextLine();
	String B = hi.nextLine();
	
	String[] arr = B.split(""); //구분자를 안줬잖아요
//	구분자가 빈 문자열이 되니까 그냥 한자 한자 기준으로 다 쪼개는 거에요 
//	그러고 문자열 배열에 넣죠
//	구분자를 안 넣으면 한 글자 별로 다 쪼갬
	
	System.out.println(Integer.parseInt(arr[2])*A);
	System.out.println(Integer.parseInt(arr[1])*A);
	System.out.println(Integer.parseInt(arr[0])*A);
	System.out.println(Integer.parseInt(B)*A);  
	//배열의 전체값을 정해주려면 B로 해주면 됨. 쪼개기 전의 숫자임
	
	hi.close();
	}

}
