package hello;

public class hello {

	public static int sum(int n, int m) {
		return n + m;   //함수 sum 생성, n과 m을 더한다. 
	}
	//main()메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum (i, 10); //sum() 메소드 호출
		a = '?';
		System.out.println(a);  // 문자 '?'화면 출력
		System.out.println("Hello"); // 헬로우 문자열 화면 출력
		System.out.println(s); // 정수 s 값 화면 출력
	}
	

}
