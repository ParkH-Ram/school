package _17_Stream;

import java.util.Arrays;

public class _9_MatchingExam {

	public static void main(String[] args) {
		int[]intA = {2, 4, 6, 8, 18};
		
					// allMatch =��� 
		boolean value = Arrays.stream(intA) //�迭�� ��Ʈ������ �޾��ְ�
						.allMatch(a -> a%2==0);
		System.out.println("��� 2�� �����? " + value);

			//anyMatch �ϳ���
		value = Arrays.stream(intA).anyMatch(a -> a%3 == 0);
		System.out.println("�ϳ��� 3�� ����� �ִ�? " + value);
		
		//none ���°�?
		value = Arrays.stream(intA).noneMatch(a -> a%3 == 0);
		System.out.println("3�� ����� ����? " + value);

	}

}
