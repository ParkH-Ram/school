package _17_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _4_ArrayStreamExam {
	public static void main(String[]args) {
		String[] strA = {"ȫ�浿", "����", "�� ����"};  // �׷� ���׸��� �ѹ� �����ϸ� ���� ���ϴ°� �˾���. 
														//�׷� �ٽ� �� ��� ����? Ȯ��
		//���ڿ�, ��Ʈ�� ��ü�� ��Ʈ��<��Ʈ��Ÿ��>���� ����
		Stream<String> strStream = Arrays.stream(strA);
		
		//item  �ڸ��� strA �迭 ������ �ϳ��� ���� �װ� ���
		strStream.forEach(item -> System.out.print(item + " ,"));
		System.out.println();
		Integer[] intA = {1, 2, 3, 4, 5, 878, 33, 42};
		
		//�������� ����
		Arrays.sort(intA);
		Stream<Integer> intStream = Arrays.stream(intA);
		intStream.forEach(item -> System.out.print(item + " ,"));	
	
		//��Ʈ���� �ѹ� �ʱⰪ �ٲٸ� ���� ���� �ǹǷ� �ٽ� ���� ����� ��
		
		Stream<Integer> intStream2 = Arrays.stream(intA);
		// �������� ���� //���� ������ �������̾ƴ� ������ü ��Ƽ���� ����
		Arrays.sort(intA, Collections.reverseOrder());
		//���� �����Ϸ��� ���׸� <Integer> ����..   �� �׳� int���̸� -1 �Ἥ �������� �����°� ���� ����
		System.out.println();
		
		//item �ڸ��� intA �迭 ������ �ϳ��� ���� �װ� ���
		intStream2.forEach(item -> System.out.print(item + " ,"));	
		}

}
