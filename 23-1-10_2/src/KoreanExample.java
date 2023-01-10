public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("자바", "011122-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("김자바", "930222-2222221");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
