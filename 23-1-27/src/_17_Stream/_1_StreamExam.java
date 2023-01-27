package _17_Stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class _1_StreamExam {
	public static void main(String[]args) {
		
		//Set �÷��� ����
		Set<String> set = new HashSet<>();
		set.add("ȫ�浿");
		set.add("ȫ����");
		set.add("ȫ����");
		
		//�ܺ� �ݺ��� �̿�
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		System.out.println();
		
		//���� �ݺ��� �̿�
//		Stream<String> stream = set.stream();
//		stream.forEach((item) -> {
//			System.out.println(item);
//		});
		// ���� �ݺ��� ���� ���� 
		Stream<String> stream = set.stream();
		stream.forEach(item -> 	System.out.println(item));
		
		
		
//		//Stream�� �̿��� �ݺ�ó��  		//��Ʈ�� ���
//		Stream<String> stream2 = set.stream();
//		
//		//���ٽ� ��� ó��
//		stream.forEach(name -> System.out.println(name));
	}

}
