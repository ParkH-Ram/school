package _17_Stream;

import java.util.ArrayList;

import java.util.List;
public class _7_Student2SortingExam2 {

	public static void main(String[] args) {
		List<_7_Student2> list = new ArrayList<>();
		list.add(new _7_Student2("ȫ�游", 85));
		list.add(new _7_Student2("�ű游", 95));
		list.add(new _7_Student2("�ڱ游", 99));
		
		//���� ���� ����
		//���� ���� ����
		list.stream().sorted((s1, s2)->Integer.compare(s1.getscore(), s2.getscore()))
		.forEach(s -> System.out.println(s.getName() + s.getscore()));
		System.out.println();
		
		//���� ������ compare(s1, s2 ��ġ�� �ٲ��ָ� ��)
		list.stream().sorted((s1, s2)->Integer.compare(s2.getscore(), s1.getscore()))
		.forEach(s -> System.out.println(s.getName() + s.getscore()));
//		list.stream() ~ forEach(s -> ��� ����) ����
	}            

}
