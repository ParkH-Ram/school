package _17_Stream;

import java.util.stream.IntStream;

public class _4_IntStreamExam {
	public static int sum;
	
	public static void main(String[]args) {
		//1~1����� stream�� ����  ���ڰ� Ŀ�� ���� ���� �̻����� Ȯ��
		IntStream stream = IntStream.rangeClosed(1, 100000);
		
		//�ڵ� ����ȯ �� sum�� ����
		stream.forEach(a-> sum += a);
		System.out.println(sum);
	}
}
