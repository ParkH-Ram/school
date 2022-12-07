package _12월_6일;

public class auto {

	public static void main (String [] args) {
		//자동 형 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intvalue : " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("intvalue : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longvalue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("intvalue : " + intValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doublevalue : " + intValue);
		
		}
}
