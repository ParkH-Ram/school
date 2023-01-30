package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _12_CollectExam2 {
	public static void main(String[]args) {
		List<_12_Student> total = new ArrayList<>();
		total.add(new _12_Student("ȫ�浿", "��", 99));
		total.add(new _12_Student("�ڱ浿", "��", 88));
		total.add(new _12_Student("���浿", "��", 95));
		total.add(new _12_Student("���浿", "��", 91));
		total.add(new _12_Student("�Ǳ浿", "��", 75));
		

		
		//�л��� �̸��� Ű��, �л� ������ ������
		Map<String, Double>map = total.stream()
				.collect(
					Collectors.groupingBy(
						s -> s.getGender(),
						Collectors.averagingDouble(s->s.getScore())
					)
				);
		System.out.println(map);
		
		
	}
}
