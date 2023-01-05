package git_test;

public class 자동형변환 {
	
	public static void main(String[]args) {
		//자동 타입 변환
		// 큰 데서 작은데 불가 
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue " + intValue);

		intValue  =50;
		long longValue = intValue;
		System.out.println("longValue " + longValue);

		longValue  = 100;
		float floatValue = longValue;
		System.out.println("floatValue " + floatValue);

		
	}

}
