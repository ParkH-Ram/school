import java.util.*;
public class Collection_HashSet {

	public static void main(String[]args) {
		//HashSet컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");   //중복 객체이므로 저장하지 안흥ㅁ
		set.add("Spring");
		
		//저장된 객체 수 출력
		
		int size = set.size();
		System.out.println(size);
		
		//중복값을 허용하지 않는 것이 Set
		
	}
	
}
