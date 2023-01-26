import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[]args) {
		// Ʈ���� �÷��� ����
		TreeMap<String,Integer> treemap = new TreeMap<>();
		
		//��Ʈ�� ����
		treemap.put("apple", 10);
		treemap.put("forever", 60);
		treemap.put("description", 40);
		treemap.put("ever", 50);
		treemap.put("zoo", 80);
		treemap.put("base", 20);
		treemap.put("guess", 70);
		treemap.put("cherry", 30);
		//��� �ϳ��ϳ��� ��Ʈ�� ��ü  �� �� ������ Set�� ����
		
		//���ĵ� ��Ʈ���� �ϳ��� �������� 
		Set<Entry<String, Integer>> entrySet = treemap.entrySet();
		//��Ʈ�� ���� ���� (���) �¾ȿ� ��� �ִ� ���빰�� <��Ʈ��, ��Ƽ��>
		
		for(Entry<String, Integer> entry : entrySet) {
			// �¾ȿ� �ִ� ���빰�� �ϳ��� �� 
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		
		//Ư�� Ű�� ���� �� �������� 
		Entry<String,Integer> entry = null;
		entry = treemap.firstEntry();
		System.out.println("���� �� �ܾ� : " + entry.getKey() + " - " + entry.getValue() );
		entry = treemap.lastEntry();
		System.out.println("���� �� �ܾ� : " + entry.getKey() + " - " + entry.getValue() );
		//lowerEntry("key") key ���� �ٷ� �� �ܾ� ���
		System.out.println();
		
		//���� ���� ���� descending = ��������, �������� 
		NavigableMap<String,Integer>desMap = treemap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = desMap.entrySet();
		for(Entry<String,Integer> i : descendingEntrySet) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
		System.out.println();
		
		//���� �˻�
		System.out.println("[c ~ g ������ �ܾ� �˻� ]");
		
		//NavigableMap���� ���� �÷��� rang�� treemap.sumMap(c ���� ��� , h�� �������� ����  //key�� �ձ��� ����
		NavigableMap<String, Integer> rang = treemap.subMap("c", true, "g", false);
		for(Entry<String, Integer> s : rang.entrySet()) { 
			System.out.println(s.getKey() + " - " + s.getValue() );
		}
	}

}
