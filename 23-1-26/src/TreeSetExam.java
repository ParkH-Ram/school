import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[]args) {
		//TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		//Integer 객체 저장
		// 속도가 다름
		scores.add(95);
		scores.add(45);
		scores.add(75);
		scores.add(65);
		scores.add(95); // 중복 개체 삭제
		
		for(Integer i : scores) System.out.print(i + " ");
		System.out.println();
		
		//특정 Integer 객체 가져오기
		System.out.println("낮은 " + scores.first());
		System.out.println("높은 " + scores.last());
		System.out.println("95점아래 점수 " + scores.lower(95)); // 95점 바로 아래 점수
		System.out.println("95점 위 점수 " + scores.higher(95)); // 95점 보다 높은 점수 없으니 null
		System.out.println();
		//내림차순 정렬
		
		//내림 차순으로 정렬
		NavigableSet<Integer> descending = scores.descendingSet();
		for (Integer i : descending) {
			System.out.print(i + " ");
		}
		System.out.println();
		//범위 검색 (80 <= )
		NavigableSet<Integer>rangSet = scores.tailSet(80, true);
		for(Integer i : rangSet) {
			System.out.println(i + " ");
		}
		System.out.println("\n");

		
		
		
	}

}
