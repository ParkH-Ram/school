package _17_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _7_StudentSortingExam {
	public static void main(String[]args) {
		
		//����Ʈ �÷��� ����
		List<_7_Student>stu = new ArrayList<>();
		stu.add(new _7_Student("ȫ�游", 85));
		stu.add(new _7_Student("�ű游", 95));
		stu.add(new _7_Student("�ڱ游", 99));
		
		//������ �������� ������������ ������ �� ��Ʈ�� ���
		stu.stream().sorted()
		.forEach(s -> System.out.println(s.getName() + ": "+ s.getscore()));
		System.out.println();
		System.out.println(stu);
		//ü�̴� ������ stu��� ����Ʈ �÷��� ������ ����ͼ� �ٷιٷ� ����...? 
		
		
		stu.stream().sorted(Comparator.reverseOrder())
		
		.forEach(s->System.out.println(s.getName() + ": " + s.getscore()));
		
		//stu��� �ּ�..?�� ����
		System.out.println(stu);
	}	

}
