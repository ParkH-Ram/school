package git_test;

public class 캐리지리턴_실습 {

	public static void main(String[]args) {
	
		long var1 = 10;                 //int 10
		long var2 = 20L;				// 뒤에 L붙이면 long 타입 입력
//		long var3 = 100000000000;
		long var4 = 100000000000L;      // 뒤에 L붙여서 입력 가능
		String str = "abcde\nfghi";
		
		
		String str1="                   abcd";
		String str2="              \rabc";
		
		// \r : 캐리지 리턴 CR  : 커서의 위치를 현재 줄의 맨 앞으로 이동
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(var4);
	
	}
}
