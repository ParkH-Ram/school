package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _12_CollectExam {
	public static void main(String[]args) {
		List<_12_Student> total = new ArrayList<>();
		total.add(new _12_Student("ȫ�浿", "��", 99));
		total.add(new _12_Student("�ڱ浿", "��", 88));
		total.add(new _12_Student("���浿", "��", 95));
		total.add(new _12_Student("���浿", "��", 91));
		total.add(new _12_Student("�Ǳ浿", "��", 75));
		
		//���л��� ���� List ����
		List<_12_Student> maleList = total.stream().filter(s->s.getGender().equals("��")).collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		
		//���� ������ ��� �Ұ�
//		List<_12_Student> maleList = total.stream().filter(s->s.getGender().equals("��")).toList();
//		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//�л��� �̸��� Ű��, �л� ������ ������
		Map<String, Integer>map = total.stream().collect(
				Collectors.toMap(
						s -> s.getName(),  // ��ü���� Ű�� �� �κ�
						s -> s.getScore()  // ��ü���� ���� �� �κ�
						)
				);
		System.out.println(map);
		
		
	}
}
