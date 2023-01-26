import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[]args) {
		
		//맵 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 55);
		map.put("홍길동", 85);
		map.put("희람", 95);
		map.put("히람", 97);
		System.out.println("총 Entry : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);   // 키를 매개값으로 주면 값을 리턴
		System.out.println(key + " : " + value);
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyit = keySet.iterator(); // 키를 반복하기 위해 반복자를 얻음
		while (keyit.hasNext()) {
			String k = keyit.next();
			Integer v = map.get(key);
			System.out.println(k + " : " + v);
			
			
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>>entryIter = entrySet.iterator();
		//엔트리를 반복하기 위해 반복자를 얻음
		
		while(entryIter.hasNext()) {
			Entry<String, Integer>entry = entryIter.next();
			String k= entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}		
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove("신용권");
		
		
		System.out.println("총 Entry : " + map.size());
		
		
	}

}
