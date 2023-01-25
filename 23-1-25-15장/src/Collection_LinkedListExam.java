import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedListExam {
	public static void main(String[]args) {
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList 컬렉션  객체 생성
		List<String> list2 = new LinkedList<String>();
		
		
		//시작 시간과 끝 시간을 저장할 변수
		long startT;
		long eT;
		
		//ArrayList 컬렉션 저장 시간 측정
		startT = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		eT = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList  걸린 시간 : ", (eT-startT));
		//출력이 정수로, 숫자 뒤에 ns를 붙이기 위해
		
		//LinkedList 컬렉션에 저장하는 시간 측정
		startT = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		eT = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (eT-startT));
	}

}
