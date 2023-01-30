package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class _10_OptionalExam {
	public static void main(String[]args) {
		List<Integer>list = new ArrayList<>();
		
		//���� �߻� (java.util.noSuchElementException)
		//double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		
		//���1
		OptionalDouble option = list.stream().mapToInt(Integer :: intValue).average();
		
		//���谪 ���ο� ���� ������ �ٸ��� �۵�
		if(option.isPresent()) System.out.println("���1 ��� : " + option.getAsDouble());
		else System.out.println("���1 ���  : 0.0");
		
		//��� 2
		double avg = list.stream().mapToInt(Integer :: intValue)
				.average().orElse(0.0);
		System.out.println("��� 2 ��� : " + avg);
		
		//��� 3
		list.stream().mapToInt(Integer :: intValue).average()
			.ifPresent(a -> System.out.println("��� 3 ��� : " + a));
		
		
	}

}
