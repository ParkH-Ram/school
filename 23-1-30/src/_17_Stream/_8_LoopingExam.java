package _17_Stream;

import java.util.Arrays;

public class _8_LoopingExam {
	public static void main(String[]args) {
		int[] intA = { 2 , 4 ,6 ,7, 9 , 11, 15};
		
		//�߸� �ۼ�
		Arrays.stream(intA)
		.filter(a -> a%2==0).peek( n-> System.out.println(n));
		
		//�߰�ó�� �޼ҵ� peek()�̿��ؼ�  �ݺ�ó��
		//2�� ����� ã��
		// ����ó��
		System.out.println("���� :" +  Arrays.stream(intA).filter(a-> a%2==0).peek(n->System.out.println(n))//������? ��?
				.sum()); // ����ó���� sum�� ���� ��� ����
		System.out.println();
		
		//���� ó���� ������ ��� ���� ����
		Arrays.stream(intA).filter(a -> a%2 ==0).forEach(n->System.out.println(n))	;
	}

}
