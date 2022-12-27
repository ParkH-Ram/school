package backjun;

import java.util.*;

public class Main_아스키코드{
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		// 캐릭터 형을 강제 플롯 해주면 아스키코드 자동 적용
		
	
		int a  = (int)sc.next().charAt(0);
		
		System.out.printf("%d", a);
		
		sc.close();
		
	}

}
