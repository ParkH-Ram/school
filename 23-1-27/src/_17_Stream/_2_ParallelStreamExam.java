package _17_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _2_ParallelStreamExam {
	public static void main(String[]args) {
		//List �÷��� ����
		List<String>list = new ArrayList<>();
		for(int i=0; i<1000; i++) {
			list.add("ȫ��" + 1);
//		list.add("ȫ��");
//		list.add("ȫ��");
//		list.add("ȫ��");
//		list.add("ȫ��");
//		list.add("ȫ��");
//		list.add("ȫ��");
		}
		
		//���� ó�� // ���������� ������ ���
		Stream<String> para = list.parallelStream(); // ���� ��Ʈ�� ���
		
		//���ٽ� ��� ó��
		para.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});			//�������� ������ ��� �������� �̸��� �� ����ض�
		
	}

}
