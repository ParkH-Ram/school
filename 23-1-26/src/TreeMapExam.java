import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[]args) {
		// 트리맵 컬렉션 생성
		TreeMap<String,Integer> treemap = new TreeMap<>();
		
		//엔트리 저장
		treemap.put("apple", 10);
		treemap.put("forever", 60);
		treemap.put("description", 40);
		treemap.put("ever", 50);
		treemap.put("zoo", 80);
		treemap.put("base", 20);
		treemap.put("guess", 70);
		treemap.put("cherry", 30);
		//얘네 하나하나가 엔트리 객체  얘 들 가지고 Set을 만듦
		
		//정렬된 엔트리를 하나씩 가져오기 
		Set<Entry<String, Integer>> entrySet = treemap.entrySet();
		//엔트리 셋을 만듦 (목록) 셋안에 들어 있는 내용물이 <스트링, 인티저>
		
		for(Entry<String, Integer> entry : entrySet) {
			// 셋안에 있는 내용물을 하나씩 비교 
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		
		//특정 키에 대한 값 가져오기 
		Entry<String,Integer> entry = null;
		entry = treemap.firstEntry();
		System.out.println("제일 앞 단어 : " + entry.getKey() + " - " + entry.getValue() );
		entry = treemap.lastEntry();
		System.out.println("제일 뒷 단어 : " + entry.getKey() + " - " + entry.getValue() );
		//lowerEntry("key") key 보다 바로 앞 단어 출력
		System.out.println();
		
		//내림 차순 정렬 descending = 내림차순, 내려간다 
		NavigableMap<String,Integer>desMap = treemap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = desMap.entrySet();
		for(Entry<String,Integer> i : descendingEntrySet) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
		System.out.println();
		
		//범위 검색
		System.out.println("[c ~ g 사이의 단어 검색 ]");
		
		//NavigableMap으로 만든 컬렉션 rang은 treemap.sumMap(c 포함 출력 , h는 포함하지 않음  //key의 앞글자 기준
		NavigableMap<String, Integer> rang = treemap.subMap("c", true, "g", false);
		for(Entry<String, Integer> s : rang.entrySet()) { 
			System.out.println(s.getKey() + " - " + s.getValue() );
		}
	}

}
