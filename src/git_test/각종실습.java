package git_test;

public class 각종실습 {

	public static void main(String[] args) {
		// 자동 타입 변환  같은 타입일 시 더 큰 값에 대입 되는 것 
		//byte byteValue = 10;
		//int intValue = byteValue;      
		
		long longValue = 5000000000L;
		float floatValue = longValue;      // 5.0E9f
		double doubleValue = longValue;    // 5.0E9
		
		
		char charValue = 'A';
		int inValue = charValue;  // 65  = A  ; 아스키코드 ㅣ
		
		byte byteValue = 65;		
		//1byte byte 형은 char형에 대입 불가능 .. 자동 형변환 X 
//		char charValue = byteValue;  // 에러
		

	}

}
