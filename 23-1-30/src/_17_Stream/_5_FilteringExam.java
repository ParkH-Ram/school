package _17_Stream;

import java.util.ArrayList;
import java.util.List;

public class _5_FilteringExam {
	public static void main(String[]args) {
		
		//List �÷��� ���� 
		List<String> list = new ArrayList<>();
		list.add("�ڱ浿");   list.add("�ű浿");  list.add("��浿");
		list.add("ȫ�浿");   list.add("���浿");
		
		//�ߺ���� ���� 
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		//������ �����ϴ� ��Ҹ� ���͸�
		//startsWith("��Ʈ�� ��") ��Ʈ�� ������ �����ϸ� true ����  
		list.stream().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));
		System.out.println();
	
	}

}
