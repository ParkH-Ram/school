import java.util.ArrayList;
import java.util.List;

public class Collection_Board_ArrayExam {
	public static void main(String[]args) {
		//ArrayList 컬렉션 생성
		List<Collection_Board> list = new ArrayList<>();
		
		list.add(new Collection_Board("제목1", "내용1", "글쓴이1"));
		list.add(new Collection_Board("제목2", "내용2", "글쓴이2"));
		list.add(new Collection_Board("제목3", "내용3", "글쓴이3"));
		list.add(new Collection_Board("제목4", "내용4", "글쓴이4"));
		list.add(new Collection_Board("제목5", "내용5", "글쓴이5"));
		
		
		//저장된 총 객체 얻기
		int size = list.size();
		System.out.println("총 객체 수 " + size);
		System.out.println();
		
		//특정 인덱스의 객체 가져오기
		Collection_Board board = list.get(1);
		System.out.println(board.getSubject()+ "\t" + board.getContent()+ "\t" + board.getWriter());
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			Collection_Board b = list.get(i);
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		}
		System.out.println();
			
		list.remove(1);
		list.remove(2);

		
		for(Collection_Board b : list) {
			System.out.println(b.getSubject() + " " + b.getContent() + " " + b.getWriter());
		
		}
	}
}
