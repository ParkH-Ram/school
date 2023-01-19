package hello230119;

public class ToStringExam {
	public static void main(String[]args) {
		ToString_SmartPhone sp = new ToString_SmartPhone("삼성전자", "안드로이드");
		
		String strObj = sp.toString();    // 투스트링 메소드 호출
		System.out.println(strObj);
		
		System.out.println(sp);
	}
}
