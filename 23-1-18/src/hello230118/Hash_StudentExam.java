package hello230118;

public class Hash_StudentExam {

	public static void main(String[] args) {
		Hash_Student s1 = new Hash_Student(1, "홍길동");
		Hash_Student s2 = new Hash_Student(1, "홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.hashCode() == s2.hashCode()) {		//해시코드 비교
			if(s1.equals(s2)) {						//데이터 비교
				System.out.println("동등허다");
			}else
				System.out.println("데이터가 다릅니다");	
		
		}else
			System.out.println("해시코드가 다르므로 동등객체 아이다");

	}
}
