import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[]args) {
		
		//�� �÷��� ����
		Map<String, Integer> map = new HashMap<>();
		
		//��ü ����
		map.put("�ſ��", 55);
		map.put("ȫ�浿", 85);
		map.put("���", 95);
		map.put("����", 97);
		System.out.println("�� Entry : " + map.size());
		System.out.println();
		
		//Ű�� �� ���
		String key = "ȫ�浿";
		int value = map.get(key);   // Ű�� �Ű������� �ָ� ���� ����
		System.out.println(key + " : " + value);
		System.out.println();
		
		//Ű Set �÷����� ���, �ݺ��ؼ� Ű�� ���� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyit = keySet.iterator(); // Ű�� �ݺ��ϱ� ���� �ݺ��ڸ� ����
		while (keyit.hasNext()) {
			String k = keyit.next();
			Integer v = map.get(key);
			System.out.println(k + " : " + v);
			
			
		}
		System.out.println();
		
		//��Ʈ�� Set �÷����� ���, �ݺ��ؼ� Ű�� ���� ���
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>>entryIter = entrySet.iterator();
		//��Ʈ���� �ݺ��ϱ� ���� �ݺ��ڸ� ����
		
		while(entryIter.hasNext()) {
			Entry<String, Integer>entry = entryIter.next();
			String k= entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}		
		System.out.println();
		
		//Ű�� ��Ʈ�� ����
		map.remove("�ſ��");
		
		
		System.out.println("�� Entry : " + map.size());
		
		
	}

}
