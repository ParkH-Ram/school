import java.util.HashSet;
import java.util.Set;

public class Collection_HashExam {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Collection_Hash_Member> set = new HashSet<Collection_Hash_Member>();
		Collection_Hash_Member a = new Collection_Hash_Member("홍길동", 30);
		Collection_Hash_Member b = new Collection_Hash_Member("홍길동", 30);
		

		
		//Member 객체 저장
		set.add(a);
		set.add(b); 	//인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
		
	
		
		System.out.println(a.equals(b));
		

	}

}
